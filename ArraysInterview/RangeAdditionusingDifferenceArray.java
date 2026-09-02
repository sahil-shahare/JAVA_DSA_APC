import java.util.Arrays;

public class RangeAdditionusingDifferenceArray {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 7, 2, 6, 4 };
        rangeAdditionusingDifferenceArray(arr, 1, 3, 4);
    }

    public static void rangeAdditionusingDifferenceArray(int[] arr, int L, int R, int value) {
        int[] diff = new int[arr.length];

        diff[L] += value;

        if (diff[R + 1] < arr.length) {
            diff[R + 1] -= value;
        }

        for (int i = 1; i < diff.length; i++) {
            diff[i] = diff[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] += diff[i];
        }
        System.out.println(Arrays.toString(arr));
    }

}
