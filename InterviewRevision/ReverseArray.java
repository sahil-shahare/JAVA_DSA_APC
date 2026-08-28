public class ReverseArray {
    public static void main(String[] args) {
        int[] n = { 5, 2, 4, 0, 5, 0, 2, 0, 3, 0, 6, 0, 89, 0, 52, 015, 325, 465, 202, 56, 21, 33 };
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
        }
}
