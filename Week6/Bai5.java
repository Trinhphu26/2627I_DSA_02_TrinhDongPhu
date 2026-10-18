
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        int pivot = ar[0];

        // In các số nhỏ hơn pivot
        for (int x : ar) {
            if (x < pivot) {
                System.out.print(x + " ");
            }
        }

        // In pivot
        System.out.print(pivot + " ");

        // In các số lớn hơn hoặc bằng pivot
        for (int i = 1; i < n; i++) {
            if (ar[i] >= pivot) {
                System.out.print(ar[i] + " ");
            }
        }

        sc.close();
    }
}
