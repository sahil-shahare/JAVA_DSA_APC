import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] n = { 25, 0, 35, 0, 68, 0, 21, 0, 54, 95, 21, 356, 48, 21, 20 };
        secondLargestElement(n);
    }

    public static void secondLargestElement(int[] n) {
            int largestNumber = Integer.MIN_VALUE;
            int secondLargestNumber = Integer.MIN_VALUE;

            for (int i : n) {
                if (largestNumber < i) {
                    secondLargestNumber = largestNumber;
                    largestNumber = i;
                }

                else if (i > secondLargestNumber && i != largestNumber) {
                    secondLargestNumber = i;
                }
            }

            System.out.println("secondLargestNumber: " + secondLargestNumber);
            System.out.println("largestNumber: " + largestNumber);
        }
}
