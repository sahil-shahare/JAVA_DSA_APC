import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        stackExample2();
        stackExample3();

    }

    public static void stackExample1() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());

        stack.pop();

        System.out.println(stack.peek());
    }

    public static void stackExample2() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

    public static void stackExample3() {
        String str = "hello";
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);

    }
}
