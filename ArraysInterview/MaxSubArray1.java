import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MaxSubArray1 {
    public static void main(String[] args) {
        int[] n1 = { 1, 2, 3, 5, 6, 7, 8 };
        maxSubArray1(n1);
    }

    public static void maxSubArray1(int[] n) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n.length; i++) {
            for (int j = i; j < n.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += n[k];
                }
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("MaxSum: " + maxSum);
    }
}
