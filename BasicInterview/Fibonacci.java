public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci(10);
    }

    public static int Fibonacci(int n) {
            int a = 0;
            int b = 1;
            int c = 0;

            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }

            return c;

        }
}
