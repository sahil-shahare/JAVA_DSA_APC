import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReverseString {
    public static void main(String[] args) {
        reverseString("Hello Java");
    }

    public static void reverseString(String str) {
            StringBuilder sb = new StringBuilder();

            for (int i = str.length() - 1; i >= 0; i--) {
                sb.append(str.charAt(i));
            }
            System.out.println(sb);
        }
}
