
class PriorityQueue {
    private int[] q;
    private int size;

    public PriorityQueue(int K) {
        q = new int[K];
        size = 0;
    }

    // Thêm một số vào hàng đợi
    public void insert(int x) {
        if (size == q.length) {
            throw new IllegalStateException("Queue is full");
        }

        q[size] = x;
        size++;
    }

    // Xóa và trả về số nhỏ nhất
    public int deleteMin() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }

        int minIndex = 0;

        // Tìm vị trí số nhỏ nhất
        for (int i = 1; i < size; i++) {
            if (q[i] < q[minIndex]) {
                minIndex = i;
            }
        }

        int min = q[minIndex];

        // Dồn các phần tử phía sau sang trái
        for (int i = minIndex; i < size - 1; i++) {
            q[i] = q[i + 1];
        }

        size--;
        return min;
    }
}
