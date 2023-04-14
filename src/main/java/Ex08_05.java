public class Ex08_05 {
    public static void main(String[] args) {
        int[] aa = new int[100]; //배열 aa,bb 선언
        int bb[] = new int[100];
        int i;

        for (i=0; i<100; i++) {aa[i] = i * 2;} //i에 0대입 i*2를 반복하고 이 값을 a[i]에 대입 그리고 i가 100미만까지 반복 i의 증감식

        for (i = 0; i < 100;  i++) { //i에 0대입 i*2를 반복하고 이 값을 100미만까지 반복 이때 bb[i]에 aa[99-i]
            bb[i] = aa[99-i];
        }
        System.out.printf("bb[0]는 %d, bb[99]는 %d 입력됨\n",bb[0],bb[99]); //bb가 배열이 0의 값 bb가 99일 때의 값이 입력
}
}
