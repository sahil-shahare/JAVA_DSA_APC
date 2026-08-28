import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReverseArray {
    public static void main(String[] args) {
        int[] n = { 25, 0, 35, 0, 68, 0, 21, 0, 54, 95, 21, 356, 48, 21, 20 };
        reverseArray(n);
    }

    public static void reverseArray(int[] n) {
            int left = 0;
            int right = n.length - 1;

            while (left < right) {
                int temp = n[left];
                n[left] = n[right];
                n[right] = temp;

                left++;
                right--;
            }

            for (int i : n) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
}
