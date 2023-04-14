import java.util.Scanner;

public class Ex08_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] aa = new int[4];
        int hap;


        System.out.printf("1번째 숫자를 입력하세요 : ");
        aa [0] = s.nextInt();   //1번째 숫자를 입력
        System.out.printf("2번째 숫자를 입력하세요 : ");
        aa [1] = s.nextInt();  //2번째 숫자를 입력
        System.out.printf("3번째 숫자를 입력하세요 : ");
        aa [2] = s.nextInt();   //3번째 숫자를 입력
        System.out.printf("4번째 숫자를 입력하세요 : ");
        aa [3] = s.nextInt();   //4번쨰 숫자를 입력

        hap = aa[0] + aa[1] + aa[2] + aa[3];    //aa[0] 부터 aa[3]까지 더해라

        System.out.printf("합계 ==> %d \n", hap); //값과 얄이동
    }
}
