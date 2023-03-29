public class bigdata04 {
    public static void main(String[] args) {
        int a, b;

        for (b = 1; b < 10; b++) {
            for (a = 2; a < 10; a++)
                System.out.printf("%5dX%d=%2d", a, b, a * b);
            System.out.printf("\n");
        }
    }
}
