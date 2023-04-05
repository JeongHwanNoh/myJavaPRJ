public class bigdata13 {
    public static void main(String[] args) {
        int a = 1, b = 2;

        while (b < 10) {
            System.out.printf("%d X %d = %d \n", b, a, a * b);
            a++;
            if (a == 10) {
                System.out.printf("\n");
                a = 1;
                b++;
            }
        }
    }
}
