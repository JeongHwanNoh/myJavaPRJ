import java.util.Random;
import java.util.Scanner;

public class bigdata14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b;
        System.out.printf("확률을 입력하세요 (5를 입력시 5분의 1) : ");
        b = s.nextInt();

        Random a = new Random();

        if (a.nextInt(b) == 0) {
            System.out.printf("당첨되셨습니다!!");
        } else {
            System.out.printf("꽝...");
        }

    }
}
