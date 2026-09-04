import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 4, 3, 2, 5, 3 };
        System.out.println("Element is : " + firstNonRepeatingElement(arr));

    }

    public static int firstNonRepeatingElement(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                return arr[i];
            } 
        }

        return -1;

    }

    public static int firstNonRepeatingElementMore(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (set.contains(i)) {
                return i;
            }
            set.add(i);
        }
        return -1;
    }
}