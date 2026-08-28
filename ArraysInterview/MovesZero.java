import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MovesZero {
    public static void main(String[] args) {
        int[] n = { 1, 0, 5, 8, 0, 6, 4, 5, 2, 30, 0, 12, 120, 0, 325, 264 };
        movesZero(n);
    }

    public static void movesZero(int[] n) {
            int i = 0;
            for (int j = 0; j < n.length; j++) {
                if (n[j] != 0) {
                    n[i++] = n[j];
                }
            }

            while (i < n.length) {
                n[i++] = 0;
            }

            for (int in : n) {
                System.out.print(in + " ");
            }
            System.out.println();
        }
}
