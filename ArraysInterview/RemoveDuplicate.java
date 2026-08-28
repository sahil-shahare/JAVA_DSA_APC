import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] n = { 1, 0, 5, 8, 0, 6, 4, 5, 2, 30, 0, 12, 120, 0, 325, 264 };
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
