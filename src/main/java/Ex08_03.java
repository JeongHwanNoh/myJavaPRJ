import java.util.Scanner;

public class Ex08_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] aa = new int[4];  //선언
        int hap = 0, i; //hap 0 대입 i는 선언

        for (i = 0; i <= 3; i++) { //i에 0 대입 i가 3이하 일 때 반복 , i증감식
            System.out.printf("%d번째 숫자를 입력하세요 : ", i + 1); //i + 1 번재 숫자를 입력하세요 출력
            aa [i] = s.nextInt(); //i[1+i]에 입력
        }

        hap = aa[0] + aa[1] + aa[2] + aa[3]; //입력한 값 더하기

        System.out.printf("합계 ==> %d \n", hap); //합계 출력
    }
}
