import java.util.Scanner;

public class bigdata32 {
    public static void main(String[] args) {

        int a, b;

        Scanner s = new Scanner(System.in);

        while (true) {
            a = s.nextInt();
            b = s.nextInt();

            if (a == 0 && b == 0) break;
            if (b % a == 0) {
                System.out.println("factor");
            } else if (a % b == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }


        }
    }
}
