import java.util.Scanner;

public class bigdata31 {
    public static void main(String[] args) {
        int e;

        Scanner s = new Scanner(System.in);

        e = s.nextInt();

        for (int i = 1; i <= e; i++) {
            for (int j = i; j < e; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



