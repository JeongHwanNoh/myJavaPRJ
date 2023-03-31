public class bigdata07 {
    public static void main(String[] args) {
        int a, b = 0;
        for (a = 5; a > 0; ) {
            if (b < a) {
                b++;
                System.out.print("*");
            } else {
                b = 0;
                a--;
                System.out.println();
            }
        }
    }
}

