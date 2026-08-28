import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Pairs {
    public static void main(String[] args) {
        int[] n1 = { 1, 2, 3, 5, 6, 7, 8 };
        pairs(n1);
    }

    public static void pairs(int[] n) {
            for (int i = 0; i < n.length; i++) {
                for (int j = i + 1; j < n.length; j++) {
                    System.out.print("(" + n[i] + "," + n[j] + ") ");
                }
                System.out.println();
            }
        }
}
