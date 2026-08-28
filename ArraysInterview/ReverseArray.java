import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ReverseArray {
    public static void main(String[] args) {
        int[] n = { 1, 0, 5, 8, 0, 6, 4, 5, 2, 30, 0, 12, 120, 0, 325, 264 };
        reverseArray(n);
    }

    public static void reverseArray(int[] n) {
            int start = 0;
            int last = n.length - 1;

            while (start <= last) {
                int temp = n[start];
                n[start] = n[last];
                n[last] = temp;

                start++;
                last--;
            }

            for (int i : n) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
}
