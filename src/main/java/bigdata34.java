import java.util.Scanner;

public class bigdata34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int c = 0;

        for (int i = 0; i < a; i++) {
            boolean z = true;

            int b = s.nextInt();
            if (b == 1) {
                continue;
            }
            for (int j = 2; j <= Math.sqrt(b); j++) {
                if (b % j == 0) {
                    z = false;
                    break;
                }
            }
            if (z) {
                c++;
            }
        }
        System.out.println(c);
    }
}
