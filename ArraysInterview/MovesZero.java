import java.util.Arrays;

public class MovesZero {
    public static void main(String[] args) {
        int[] arr1 = { 0, 1, 0, 3, 12 };
        int[] arr2 = { 0, 1, 0, 3, 12, 0, 0 };
        System.out.println(Arrays.toString(movesZeroRigth(arr1)));
        System.out.println(Arrays.toString(movesZeroLeft(arr2)));
    }

    public static int[] movesZeroRigth(int[] arr) {
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }

        while (j < arr.length) {
            arr[j++] = 0;
        }

        return arr;
    }

    public static int[] movesZeroLeft(int[] arr) {
        int j = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j--;
            }
        }

        return arr;
    }
}
