public class SumNumber {
    public static void main(String[] args) {
        sumNumber(1561);
    }

    public static void sumNumber(int n) {
            int sum = 0;
            while (n > 0) {
                int lastDigit = n % 10;
                sum += lastDigit;
                n /= 10;
            }
            System.out.println(sum);
        }
}
