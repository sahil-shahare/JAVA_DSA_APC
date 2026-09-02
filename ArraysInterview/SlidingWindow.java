public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 1, 3, 2 };
        int k = 7;
        slidingWindowLength(arr, k);
    }

    // Find the length of the longest contiguous subarray whose sum is ≤ 7.
    public static void slidingWindowLength(int[] arr, int k) {
        int left = 0;
        int sum = 0;
        int maxLength = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > k) {
                sum -= arr[left++];
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength + "," + sum);
        // return new int[] { maxLength, sum };

    }
}
