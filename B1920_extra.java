import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//while문을 많이 써서 구현해보았다 더 직관적이다. 
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
        int start = l;
        int end = r;
        while (start < end) {
            while (true) {
                if (arr[start] > arr[end]) {
                    swap(arr, start, end);
                    break;
                }
                start++;
                if (start == end) {
                    return start;
                }
            }
            while (true) {
                if (arr[start] > arr[end]) {
                    swap(arr, start, end);
                    break;
                }
                end--;
                if (start == end) {
                    return start;
                }
            }
        }
        return -1;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void show(int[] arr) {
        for (int n : arr) {
            System.out.println(n);
        }

    }

}
