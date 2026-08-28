public class PrintIRHP {
    public static void main(String[] args) {
        printIRHP(5);
    }

    public static void printIRHP(int n) {
            for (int i = 1; i <= n; i++) {
                // space
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                // star
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
