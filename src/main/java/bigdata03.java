import java.util.Scanner;

public class bigdata03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;

        System.out.printf("입력 값 : ");
        a = sc.nextInt();

        if ((a % 2 == 0) && (a % 3 == 0)) {
            System.out.printf("2의 배수와 3의 배수다.");
        } else if (a % 2 == 0) {
            System.out.printf("2의 배수다.");
        } else if (a % 3 == 0) {
            System.out.printf("3의 배수다");
        } else {
            System.out.printf("2의 배수도 3의 배수도 아니다.");
        }
    }
}
