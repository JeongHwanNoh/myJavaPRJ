import java.util.Scanner;

public class bigdata09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.printf("20 이하로 원하는 값을 입력하세요. : ");
        a = sc.nextInt();

        if (a > 20) {
            System.out.printf("수가 20을 초과하셨습니다.\n");
        } else if (a < 21) {
            System.out.printf("%d의 값을 입력하셨습니다.\n", a);
            for (b = 0; a > 0; ) {
                if (a > b) {
                    b++;
                    System.out.print("*");
                } else {
                    a--;
                    b = 0;
                    System.out.println();
                }

            }
        }
    }
}



