
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt(); // Số cần tìm
        int n = sc.nextInt(); // Số phần tử

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == V) {
                System.out.println(mid);
                return;
            } else if (arr[mid] < V) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        sc.close();
    }
}
