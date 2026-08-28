public class Swap {
    public static void main(String[] args) {
        swap();
    }

    public static void swap() {
            int a = 10;
            int b = 4;

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println(a);
            System.out.println(b);
        }
}
