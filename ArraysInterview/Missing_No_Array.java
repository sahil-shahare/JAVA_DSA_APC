public class Missing_No_Array {
    public static void main(String[] args) {
        int[] n1 = { 1, 2, 3, 5, 6, 7, 8 };
        missing_No_Array(n1, 5);
    }

    public static void missing_No_Array(int[] n1, int n) {
        int xor = 0;

        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }

        for (int i : n1) {
            xor ^= i;
        }
        System.out.println(xor);
    }
}
