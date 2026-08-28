import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args) {
        int[] n1 = { 0, 1, 2, 4, 5 }; // always start with zero
        missingNumber(n1);
    }

    public static void missingNumber(int[] n1) {
            int xor = 0;

            for (int i = 0; i <= n1.length; i++) {
                xor = xor ^ i;
            }

            for (int i : n1) {
                xor ^= i;
            }
            System.out.println(xor);
        }
}
