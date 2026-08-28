public class PrintFloyds {
    public static void main(String[] args) {
        printFloyds(4);
    }

    public static void printFloyds(int n) {
            int counter = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(counter++);
                }
                System.out.println();
            }
        }
}
