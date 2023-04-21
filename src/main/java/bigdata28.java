public class bigdata28 {
    public static void main(String[] args) {

        int a;
        int b = 0, c = 10;

        for (a = 1; a < 10;) {
            if (a > b && a < 5) {
                b++;
                System.out.print("*");
            } else if (a < c && a > 4) {
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
