import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] n = { 1, 0, 5, 8, 0, 6, 4, 5, 2, 30, 0, 12, 120, 0, 325, 264 };
        duplicateElement(n);
    }

    public static void duplicateElement(int[] n) {
            Set<Integer> seen = new HashSet<>();
            Set<Integer> duplicate = new LinkedHashSet<>();

            for (int i : n) {
                if (!seen.add(i)) {
                    duplicate.add(i);
                }
            }

            System.out.println(duplicate);
        }
}
