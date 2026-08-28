public class PrintSubArrays {
    public static void main(String[] args) {
        int[] n1 = { 1, 2, 3, 5, 6, 7, 8 };
        printSubArrays(n1);
    }

    public static void printSubArrays(int[] n) {
            for (int i = 0; i < n.length; i++) {
                for (int j = i; j < n.length; j++) {
                    for (int k = i; k <= j; k++) {
                        System.out.print(n[k] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
}
