public class PrefixMaxSum {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 5 };
        prefixMaxSum(arr);
    }

    public static void prefixMaxSum(int[] arr) {
        int[] prefix = new int[arr.length];
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        prefix[0] = arr[0];

        // calculate prefixSum
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // calculate maxSum
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                maxSum = Math.max(maxSum, currSum);
            }
        }

        System.out.println("MaxSum : " + maxSum);

    }
}
