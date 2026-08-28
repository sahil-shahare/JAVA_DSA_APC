import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] n = { 25, 0, 35, 0, 68, 0, 21, 0, 54, 95, 21, 356, 48, 21, 20 };
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
