public class PrintIRHPN {
    public static void main(String[] args) {
        printIRHPN(5);
    }

    public static void printIRHPN(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
}
