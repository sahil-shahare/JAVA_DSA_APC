public class ReverseNumber {
    public static void main(String[] args) {
        reverseNumber(12345);
    }

    public static void reverseNumber(int n) {
            while (n > 0) {
                int lastDigit = n % 10;
                System.out.print(lastDigit);
                n /= 10;
            }
            System.out.println();
        }
}
