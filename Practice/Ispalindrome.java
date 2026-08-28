import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ispalindrome {
    public static void main(String[] args) {
        ispalindrome("madam");
    }

    public static void ispalindrome(String str) {
            boolean flag = true;

            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    flag = false;
                    break;
                }
                left++;
                right--;
            }

            System.out.println(flag ? "Palindrome" : "Not Palindrome");

        }
}
