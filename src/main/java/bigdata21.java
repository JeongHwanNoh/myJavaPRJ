import java.util.Scanner;

public class bigdata21 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int i;
        int[] a = new int[5];

        System.out.printf("원하는 수를 입력하세요. : ");
        for (i = 0; i < 5; i++) {
            a[i] = s.nextInt();
        }
        int c = 0, d, e = 0;

        for (i = 0; i < 5; i++) {
            c += a[i];
        }
        System.out.printf("모두 더한 값 (중복 포함) : %d", c);
        for (i = 0; i < 5; i++) {
            for (d = 0; d < i; d++) {
                if (a[i] == a[d]) {
                    a[i] = 0;
                }
            }
                e += a[i];
        }
        System.out.printf("\n모두 더한 값 (중복 제외) : %d", e);
    }
}


