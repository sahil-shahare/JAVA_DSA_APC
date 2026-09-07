import java.util.Arrays;

public class FirstLastOccurance {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 7, 8, 10 };
        System.out.println(Arrays.toString(searchRange(arr, 7)));

    }

    public static int[] searchRange(int[] arr, int target) {
        int first = findLeftBound(arr, target);
        int last = findRigthBound(arr, target);
        return new int[] { first, last };
    }

    public static int findLeftBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                index = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return index;
    }

    public static int findRigthBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                index = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return index;
    }

}
