import java.util.Scanner;

public class bigdata27 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        int c = s.nextInt();

        for (int i = 0; i < c; i++) {
            int p = s.nextInt();
            int n = s.nextInt();

            t = t - (p * n);
        }
        if (t == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
