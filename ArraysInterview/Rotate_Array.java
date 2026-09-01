import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(rotateArray(arr, 2)));
    }

    // RotateArray
    public static int[] rotateArray(int[] arr, int k) {

        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, arr.length - 1);

        return arr;
    }

    // ReverseArray - helper Function
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}