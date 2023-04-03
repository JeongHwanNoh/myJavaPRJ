public class bigdata05 {
    public static void main(String[] args) {
        int a, b; //변수설정

        for (a = 1, b= 2; b < 10; a++) { //a에 1대입 b에는 2대입. b 보다 작을 경우 실행. 실행되고 난 후 증감식
            if (a > 9) { //만약 a가 9를 초과하였을경우
                a = 0; //a에 0 대입
                b++; // b 증감식
            } else { //a의 조건이 안될경우
                System.out.printf("%d X %d = %d \n", b, a, a * b); // b * a 를 실행한다.
            }
        }
    }
}
