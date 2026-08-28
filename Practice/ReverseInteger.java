import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReverseInteger {
    public static void main(String[] args) {
        reverseInteger(12345);
    }

    public static void reverseInteger(int n) {
            int rev = 0;

            while (n > 0) {
                int lastDigit = n % 10;
                rev = rev * 10 + lastDigit;
                n /= 10;
            }
            System.out.println(rev);
        }
}
