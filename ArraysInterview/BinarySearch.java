import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] n1 = { 1, 2, 3, 5, 6, 7, 8 };
        binarySearch(n1, 6);
    }

        public static void binarySearch(int[] n, int key) {
            Arrays.sort(n);
            int left = 0;
            int right = n.length - 1;
    
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (key == n[mid]) {
                    System.out.println("Found");
                    return;
                }
    
                if (n[mid] < key) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            System.out.println("Not Found");
        }
}
