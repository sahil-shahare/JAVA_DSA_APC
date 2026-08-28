public class IsPrime {
    public static void main(String[] args) {
        isPrime(5);
    }

    public static boolean isPrime(int n) {

            if (n <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        }
}
