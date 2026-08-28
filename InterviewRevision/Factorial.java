public class Factorial {
    public static void main(String[] args) {
        factorial(5);
    }

    public static void factorial(int n) {
            int f = 1;

            for (int i = 2; i <= n; i++) {
                f *= i;
            }
            System.out.println(f);
        }
}
