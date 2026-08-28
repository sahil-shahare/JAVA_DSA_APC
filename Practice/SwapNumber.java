import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SwapNumber {
    public static void main(String[] args) {
        swapNumber();
    }

    public static void swapNumber() {
            int a = 5;
            int b = 10;

            a = a + b;
            b = a - b;
            a = a - b;

            // a = a ^ b;
            // b = a ^ b;
            // a = a ^ b;

            // int temp = a;
            // a = b;
            // b = temp;

            System.out.println("a: " + a + " b: " + b);
        }
}
