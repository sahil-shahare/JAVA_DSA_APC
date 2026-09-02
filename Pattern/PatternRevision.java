public class PatternRevision {
    public static void main(String[] args) {
        int n = 4;
        printStar(n);
        printInvertedStar(n);
        printAlphabets(n);
        printNumber(n);

    }

    public static void printStar(int n) {
        // Rows
        for (int i = 0; i < n; i++) {
            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printInvertedStar(int n) {
        // Rows
        for (int i = 0; i < n; i++) {
            // Stars = n-i+1 => 4-0+1 = 5
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printAlphabets(int n) {
        char ch = 'A';
        // Rows
        for (int i = 0; i < n; i++) {
            // Alphabets
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printNumber(int n) {
        // Rows
        for (int i = 1; i <= n; i++) {
            // Numbers
            for (int j = 1; j <= i; j++) {
                System.out.println(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
