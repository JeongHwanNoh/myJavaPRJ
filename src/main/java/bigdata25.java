import java.util.Scanner;

public class bigdata25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a[] = new int[3];
        int i;

        for (i = 0; i < 3; i++) {
            a[i] = s.nextInt();
        }

        if (a[0] == a[1] && a[1] == a[2] && a[2] == a[0]) {
            System.out.print(10000 + (a[0] * 1000));
        } else if (a[0] == a[1] || a[0] == a[2]) {
            System.out.print(1000 + (a[0] * 100));
        } else if (a[1] == a[2]) {
            System.out.print(1000 + (a[1] * 100));
        } else {
            System.out.print((Math.max(a[0], Math.max(a[1], a[2])) * 100));
        }
    }
}
