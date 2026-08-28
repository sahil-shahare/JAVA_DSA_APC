public class LargestNumber {
    public static void main(String[] args) {
        int[] n = { 5, 2, 4, 0, 5, 0, 2, 0, 3, 0, 6, 0, 89, 0, 52, 015, 325, 465, 202, 56, 21, 33 };
        largestNumber(n);
    }

    public static void largestNumber(int[] n) {
            int LN = Integer.MIN_VALUE;

            if (n.length <= 1) {
                return;
            }

            for (int i : n) {
                if (i >= LN) {
                    LN = i;
                }
            }
            System.out.println("Largest Number : " + LN);

        }
}
