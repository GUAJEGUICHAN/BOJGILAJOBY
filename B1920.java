import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int theNumber;
        int[] num1;
        int[] num2;
        Scanner scanner = new Scanner(System.in);
        theNumber = scanner.nextInt();
        num1 = new int[theNumber];// num1배열크기

        for (int i = 0; i < theNumber; i++) {
            num1[i] = scanner.nextInt();
        } // num1배열을 받는다.

        theNumber = scanner.nextInt();
        num2 = new int[theNumber];// num2배열크기

        for (int i = 0; i < theNumber; i++) {
            num2[i] = scanner.nextInt();
        } // num2배열을 받는다.
        scanner.close();

        // 정렬하자!
        Arrays.sort(num1);
        for (int n : num2) {
            System.out.println(Bsearch(num1, n));
        }

    }

    private static int Bsearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return 0;
    }
}
