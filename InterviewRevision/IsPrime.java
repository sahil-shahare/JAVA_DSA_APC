public class IsPrime {
    public static void main(String[] args) {
        isPrime(8);
    }

    public static void isPrime(int n) {
            boolean flag = true;
            if (n <= 1) {
                flag = false;
            }

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if ((n % i) == 0) {
                    flag = false;
                }
            }

            System.out.println(flag ? "Prime" : "Not Prime");
        }
}
