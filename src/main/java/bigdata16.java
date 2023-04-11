import java.util.Scanner;

public class bigdata16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i; //정수 선언
        int[] a = new int[5]; //배열 선언

        System.out.printf("5개의 숫자를 입력하세요."); //값을 입력
        for (i = 0; i < 5; i++) { //i에 0대입, 5미만이 될때 까지 반복 +  i 증감식
            a[i] = s.nextInt(); //스캔
        }
        int max = a[0], min = a[0], sum = 0; //max , min 에 a[0]값 대입 , sum 에 0선언

        for (i = 0; i < a.length; i++) { //i에 0대입 i가 배열 요소 갯수보다 작을 때 반복 + i 증감식
            if (a[i] > max) { //만약 a[i]값이 max 보다 크면
                max = a[i]; //max 에 그 값을 대입해라
            }
        }
        System.out.printf("가장 큰 값 : %d \n", max); //가장 큰 값 출력
        for (i = 0; i < a.length; i++) {  //i에 0대입 i가 배열 요소 갯수보다 작을 때 반복 + i 증감식
            if (a[i] < min) { //a[i]값이 min 보다 작으면
                min = a[i]; //min 에 그값을 대입하라
            }
        }
        System.out.printf("가장 작은 값 : %d \n", min); //가장 작은 값 출력
        for (i = 0; i < a.length; i++) { //i에 0대입 i가 배열 요소 갯수보다 작을 때 반복 + i 증감식
            sum += a[i]; //sum = sum + a[i]
        }
        int c = sum / a.length; //c에 sum 값 대입 이후 배열 요소 갯수를 나누어라
        System.out.printf("평균값 : %d \n", c); //평균값 출력

    }
}



