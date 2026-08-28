public class CheckPalindrome {
    public static void main(String[] args) {
        checkPalindrome("madam");
    }

    public static boolean checkPalindrome(String str) {
            int start = 0;
            int last = str.length() - 1;

            while (start < last) {
                if (str.charAt(start) != str.charAt(last)) {
                    return false;
                }
                start++;
                last--;
            }

            return true;
        }
}
