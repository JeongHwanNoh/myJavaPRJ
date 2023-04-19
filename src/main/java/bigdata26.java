import java.util.Scanner;

public class bigdata26 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a, b;
        while (true) {
            System.out.printf("숫자를 입력해주세요 (0을 입력시 중단) : ");
            a = s.nextInt();
            if (a == 0) {
                System.out.printf("중단합니다.");
                return; }
            System.out.printf("%d단\n", a);

            for (b = 1; b < 10; b++) {
                System.out.printf("%d X %d = %d\n", a, b, a * b);
            }
        }
    }
}
