public class MovesZero {
    public static void main(String[] args) {
        int[] n = { 5, 2, 4, 0, 5, 0, 2, 0, 3, 0, 6, 0, 89, 0, 52, 015, 325, 465, 202, 56, 21, 33 };
        movesZero(n);
    }

        public static void movesZero(int[] n) {
            int i = 0;
            for (int j = 0; j < n.length; j++) {
                if (n[j] != 0) {
                    n[i++] = n[j];
                }
            }
    
            while (i < n.length) {
                n[i++] = 0;
            }
    
            for (int in : n) {
                System.out.print(in + " ");
            }
        }
}
