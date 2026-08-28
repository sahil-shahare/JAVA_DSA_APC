public class ReverseStar {
    public static void main(String[] args) {
        reverseStar(4);
    }

    public static void reverseStar(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
