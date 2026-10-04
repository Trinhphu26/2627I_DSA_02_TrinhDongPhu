import java.util.Scanner;

public class BalancedBrackets {
    // Tự cài đặt Stack cơ bản bằng Linked List
    private static class MyStack {
        private static class Node {
            char val;
            Node next;
            Node(char val) { this.val = val; }
        }
        private Node top = null;

        public void push(char c) {
            Node newNode = new Node(c);
            newNode.next = top;
            top = newNode;
        }

        public char pop() {
            if (isEmpty()) return ' ';
            char val = top.val;
            top = top.next;
            return val;
        }

        public boolean isEmpty() {
            return top == null;
        }
    }

    public static String isBalanced(String s) {
        MyStack stack = new MyStack();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Gặp ngoặc mở -> push vào stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            // Gặp ngoặc đóng -> kiểm tra khớp với đỉnh stack
            else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) return "NO";
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return "NO";
                }
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String s = sc.next();
                System.out.println(isBalanced(s));
            }
        }
        sc.close();
    }
}