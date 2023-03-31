public class bigdata05 {
    public static void main(String[] args) {
        int a, b;

        for (a = 2 , b = 1; a < 10; b++) {
            if (b > 9) {
                b = 0;
                a++;
            } else {
                System.out.printf("%d X %d = %d \n", a, b, a * b);
            }
        }
    }
}
