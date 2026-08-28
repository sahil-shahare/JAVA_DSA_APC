import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LargestElement {
    public static void main(String[] args) {
        int[] n = { 25, 0, 35, 0, 68, 0, 21, 0, 54, 95, 21, 356, 48, 21, 20 };
        largestElement(n);
    }

    public static void largestElement(int[] n) {
            int largestNumber = Integer.MIN_VALUE;

            for (int i : n) {
                if (largestNumber < i) {
                    largestNumber = i;
                }
            }
            System.out.println("largestNumber: " + largestNumber);
        }
}
