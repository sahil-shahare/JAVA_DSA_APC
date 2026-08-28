import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Factorial {
    public static void main(String[] args) {
        factorial(8);
    }

    public static void factorial(int n) {
            int f = 1;
            for (int i = 2; i <= n; i++) {
                f *= i;
            }
            System.out.println("factorial: " + f);
        }
}
