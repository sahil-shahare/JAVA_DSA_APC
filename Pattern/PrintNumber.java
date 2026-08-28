public class PrintNumber {
    public static void main(String[] args) {
        printNumber(5);
    }

    public static void printNumber(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
}
