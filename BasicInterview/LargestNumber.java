public class LargestNumber {
    public static void main(String[] args) {
        largestNumber();
    }

    public static void largestNumber() {
            int arr[] = { 5, 4, 3, 8, 2, 5, 61, 0 };

            int largestNumber = Integer.MIN_VALUE;
            int secondlargestNumber = Integer.MIN_VALUE;

            for (int i : arr) {
                if (i >= largestNumber) {
                    secondlargestNumber = largestNumber;
                    largestNumber = i;
                }

                else if (i > secondlargestNumber && i != largestNumber) {
                    secondlargestNumber = i;
                }
            }
            System.out.println(largestNumber);
            System.out.println(secondlargestNumber);

        }
}
