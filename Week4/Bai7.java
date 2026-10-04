import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            // Mảng lưu tần số xuất hiện của các giá trị từ 0 đến 99
            int[] frequency = new int[100];

            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();
                frequency[value]++;
            }

            // In kết quả tần suất 100 phần tử
            for (int i = 0; i < 100; i++) {
                System.out.print(frequency[i] + (i < 99 ? " " : ""));
            }
            System.out.println();
        }

        sc.close();
    }
}