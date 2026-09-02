import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 5 };
        prefixSum(arr);
    }

    public static void prefixSum(int[] arr) {
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        System.out.println("Prefix : " + Arrays.toString(prefix));
    }
}
