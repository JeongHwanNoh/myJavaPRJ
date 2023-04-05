public class bigdata11 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1, j = 2; j < 10; i++) { // i에 1 대입 j는 2에 대입 j가 10보다 작을 경우 i 증감식 반복
            if (i < 9) { //i가 9초과가 아닐경우
                System.out.printf("%d X %d = %d \n", j, i, i * j); //j값 X i값 = j*i를 출력하고 열을 이동
            } //i가 9이상 일 경우

            else {
                System.out.printf("\n"); //열 이동
                i = 0; //i를 초기화
                j++; //j 증감식
            }
        }
    }
}
