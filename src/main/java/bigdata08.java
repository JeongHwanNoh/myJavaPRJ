public class bigdata08 {
    public static void main(String[] args) {
        int a, b = 0, c = 10;
        for (a = 1; a < 10; ) {
            if (a > b && a < 6) {
                b++;
                System.out.print("*");
            } else if (a < c && a > 5) {
                c--;
                System.out.print("*");
            } else {
                a++;
                b = 0;
                c = 10;
                System.out.println();
            }
        }
    }
}