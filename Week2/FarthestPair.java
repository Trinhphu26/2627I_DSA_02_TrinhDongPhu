public class FarthestPair {
    public static void findFarthestPair(double[] a) {
        if (a == null || a.length < 2) {
            System.out.println("Mảng cần ít nhất 2 phần tử.");
            return;
        }

        double min = a[0];
        double max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("Cặp xa nhất: (" + min + ", " + max + ")");
        System.out.println("Khoảng cách: " + Math.abs(max - min));
    }

    public static void main(String[] args) {
        double[] a = {3.5, -2.1, 7.8, 1.0, -5.4, 9.2};
        findFarthestPair(a);
    }
}