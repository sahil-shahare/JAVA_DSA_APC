public class Printchar {
    public static void main(String[] args) {
        printchar(5);
    }

    public static void printchar(int n) {
            char ch = 'A';

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(ch++);
                }
                System.out.println();
            }
        }
}
