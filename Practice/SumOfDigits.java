import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SumOfDigits {
    public static void main(String[] args) {
        sumOfDigits(12345);
    }

    public static void sumOfDigits(int n) {
            int sum = 0;

            while (n > 0) {
                int lastDigit = n % 10;
                sum += lastDigit;
                n /= 10;
            }
            System.out.println("sum: " + sum);
        }
}
