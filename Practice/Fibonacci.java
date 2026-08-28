import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(8);
    }

    public static void fibonacci(int n) {
            int a = 0;
            int b = 1;
            int c = 0;

            System.out.println("a: " + a + " b: " + b);

            for (int i = 2; i < n; i++) {
                c = a + b;

                a = b;
                b = c;
            }
            System.out.println("c: " + c);

        }
}
