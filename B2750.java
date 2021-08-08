import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//B2750
//첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 
//둘째 줄부터 N개의 줄에는 수 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다.
//수는 중복되지 않는다.

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        quickSort(arr);
        show(arr);
    }

    static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    static void quickSort(int[] arr, int l, int r) {
        if (l < r) {// 배열의 크기가 1일경우 바로 아웃
            int p = partition(arr, l, r);
            quickSort(arr, l, p - 1);
            quickSort(arr, p + 1, r);
        }
    }

    static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];// 내 기준으로 크기가 작으면 왼쪽 크면 오른쪽 모아두자!
        int p = l - 1;// 나 위치 기준으로 pivot보다 작은 수는 왼쪽 큰 수는 오른쪽
        for (int i = l; i < r; i++) {// 피봇위치 전까지 증가한다.
            if (arr[i] < pivot) {// p값이 상승하는 조건은 pivot보다 작은 값을 찾았을 때 그 값 앞에 파티션 친다. //i는 그냥 증가한다.
                swap(arr, ++p, i);
            }
        }
        if (arr[r] < arr[++p])
            swap(arr, p, r);
        return p;

    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void show(int[] arr) {
        for (int n : arr) {
            System.out.println(String.valueOf(n));
        }

    }

}
