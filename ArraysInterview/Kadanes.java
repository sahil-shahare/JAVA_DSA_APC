import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Kadanes {
    public static void main(String[] args) {
        int[] n1 = { 1, 2, 3, 5, 6, 7, 8 };
        kadanes(n1);
    }

    public static void kadanes(int[] n) {
            int currSum = 0;
            int maxSum = Integer.MIN_VALUE;

            for (int i = 0; i < n.length; i++) {
                currSum = Math.max(n[i], currSum + n[i]);
                maxSum = Math.max(currSum, maxSum);
            }
            System.out.println("Kadanes MaxSum: " + maxSum);
        }
}
