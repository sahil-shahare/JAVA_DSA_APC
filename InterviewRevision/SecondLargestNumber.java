public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] n = { 5, 2, 4, 0, 5, 0, 2, 0, 3, 0, 6, 0, 89, 0, 52, 015, 325, 465, 202, 56, 21, 33 };
        secondLargestNumber(n);
    }

    public static void secondLargestNumber(int[] n) {
            int LN = Integer.MIN_VALUE;
            int SLN = Integer.MIN_VALUE;

            for (int i : n) {
                if (i >= LN) {
                    SLN = LN;
                    LN = i;
                } else if (i > SLN && i != LN) {
                    SLN = i;
                }
            }
            System.out.println("Largest Number : " + LN);
            System.out.println("Second Largest Number : " + SLN);

        }
}
