public class Palindrome {
    public static void main(String[] args) {
        palindrome("madzam");
    }

    public static void palindrome(String str) {
            int left = 0;
            int right = str.length() - 1;
            boolean flag = true;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    flag = false;
                }

                left++;
                right--;
            }
            System.out.println(flag ? "Palindrome" : "Not Palindrome");
        }
}
