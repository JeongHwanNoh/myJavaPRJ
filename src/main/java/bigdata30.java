import java.util.Scanner;

public class bigdata30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int k = s.nextInt();
        int a = 1, b = 0;
        int p = k/2+1;

        for (int c = 1; c <= k; c++) {
            for (int d = p; d > a; d--) {
                System.out.print(" ");
            }
            for (int e = 0; e <= b; e++) {
                System.out.print("*");
            }
            System.out.println();
            if (c < p) {
                a++;
                b +=2;
            } else {
                a--;
                b -= 2;
            }
        }
    }
}
