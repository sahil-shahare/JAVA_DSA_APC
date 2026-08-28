import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class BinarySearch {
    public static void main(String[] args) {
        int[] n = { 25, 0, 35, 0, 68, 0, 21, 0, 54, 95, 21, 356, 48, 21, 20 };
        binarySearch(n, 95);
    }

    public static void binarySearch(int[] n, int key) {
            // Sorted Array
            Arrays.sort(n);

            int start = 0;
            int end = n.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (n[mid] == key) {
                    System.out.println("Key Found at index: " + mid);
                    return;
                }

                if (n[mid] < key) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            System.out.println("Not Found");

        }
}
