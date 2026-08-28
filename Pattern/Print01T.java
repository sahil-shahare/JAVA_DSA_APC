public class Print01T {
    public static void main(String[] args) {
        print01T(4);
    }

    public static void print01T(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    if ((i + j) % 2 == 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                }
                System.out.println();
            }
        }
}
