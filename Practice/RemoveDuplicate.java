import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] n = { 25, 0, 35, 0, 68, 0, 21, 0, 54, 95, 21, 356, 48, 21, 20 };
        removeDuplicate(n);
    }

    public static void removeDuplicate(int[] n) {
            Set<Integer> set = new LinkedHashSet<>();

            for (int i : n) {
                set.add(i);
            }

            System.out.println(set);
        }
}
