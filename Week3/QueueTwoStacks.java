import java.util.Scanner;

public class QueueTwoStacks {
    // Stack tự cài bằng mảng động cơ bản
    private static class IntStack {
        private int[] a = new int[2];
        private int n = 0;

        private void resize(int capacity) {
            int[] temp = new int[capacity];
            for (int i = 0; i < n; i++) temp[i] = a[i];
            a = temp;
        }

        public void push(int item) {
            if (n == a.length) resize(2 * a.length);
            a[n++] = item;
        }

        public int pop() {
            int item = a[--n];
            if (n > 0 && n == a.length / 4) resize(a.length / 2);
            return item;
        }

        public int peek() {
            return a[n - 1];
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    // Queue dùng 2 Stacks
    private static class MyQueue {
        private IntStack stackIn = new IntStack();
        private IntStack stackOut = new IntStack();

        public void enqueue(int x) {
            stackIn.push(x);
        }

        private void shiftStacks() {
            if (stackOut.isEmpty()) {
                while (!stackIn.isEmpty()) {
                    stackOut.push(stackIn.pop());
                }
            }
        }

        public void dequeue() {
            shiftStacks();
            if (!stackOut.isEmpty()) {
                stackOut.pop();
            }
        }

        public int front() {
            shiftStacks();
            return stackOut.peek();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int q = sc.nextInt();
            MyQueue queue = new MyQueue();

            for (int i = 0; i < q; i++) {
                int type = sc.nextInt();
                if (type == 1) {
                    int x = sc.nextInt();
                    queue.enqueue(x);
                } else if (type == 2) {
                    queue.dequeue();
                } else if (type == 3) {
                    System.out.println(queue.front());
                }
            }
        }
        sc.close();
    }
}