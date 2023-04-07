public class bigdata17 {
    public static void main(String[] args) {
        int a = 1, b = 0;

        while (a < 10) {
            if (b < a) {
                System.out.print("*");
                b++;
            } else {
                System.out.println();
                a++;
                b = 0;
            }
        }
    }
}

