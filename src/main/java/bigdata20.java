import java.util.Scanner;

public class bigdata20 {
    public static void main(String[] args) {
        int i;

        Scanner s = new Scanner(System.in);

        int a[] = new int[5];

        System.out.printf("홀수 짝수를 구별하고 싶은 숫자를 5개 입력해주세요 : ");
        for (i = 0; i < 5; i++) {
            a[i] = s.nextInt();
        }
        System.out.print("홀수 : ");
        for (i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                System.out.printf("%d ", a[i]);
            }

        }
        System.out.printf("\n짝수 : ");
        for (i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.printf("%d ", a[i]);
            }
        }
    }
}


