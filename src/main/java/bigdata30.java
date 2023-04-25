public class bigdata30 {
    public static void main(String[] args) {
        int a = 1, b = 0;

        for (int c = 1; c < 8; c++) {
            for (int d = 4; d > a; d--) {
                System.out.print(" ");
            }
            for (int e = 0; e <= b; e++) {
                System.out.print("*");
            }
            System.out.println();
            if (c < 4) {
                a++;
                b = b + 2;
            } else {
                a--;
                b = b - 2;
            }
        }
    }
}
