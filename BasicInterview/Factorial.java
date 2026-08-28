public class Factorial {
    public static void main(String[] args) {
        factorial(25);
    }

    public static int factorial(int n) {
            int f = 1;

            for (int i = 2; i <= n; i++) {
                f *= i;
            }

            return f;
        }
}
