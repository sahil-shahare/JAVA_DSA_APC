import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MoveZeros {
    public static void main(String[] args) {
        int[] n = { 25, 0, 35, 0, 68, 0, 21, 0, 54, 95, 21, 356, 48, 21, 20 };
        moveZeros(n);
    }

    public static void moveZeros(int[] n) {
            int insertPosition = 0;

            for (int i = 0; i < n.length; i++) {
                if (n[i] != 0) {
                    n[insertPosition++] = n[i];
                }
            }
            while (insertPosition < n.length) {
                n[insertPosition++] = 0;
            }

            for (int i : n) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
}
