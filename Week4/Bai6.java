import java.io.*;
import java.util.*;

public class Bai6 {

    public static void insertionSort(int[] A){
        for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            // LỖI Ở ĐÂY: mã gốc là (j > 0), cần sửa thành (j >= 0)
            while(j >= 0 && A[j] > value){
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
        }
        printArray(A);
    }

    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int n = in.nextInt();
            int[] ar = new int[n];
            for(int i = 0; i < n; i++){
                ar[i] = in.nextInt();
            }
            insertionSort(ar);
        }
        in.close();
    }
}