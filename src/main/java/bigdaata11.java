public class bigdaata11 {
    public static void main(String[] args) {
        int i, j; //변수선언

        for (i = 1, j = 2; j < 10 || i < 9; ) {
            if (j < 10) {
                System.out.printf("%2d X %2d = %2d ", j, i, i * j);
                j++;
            } else {
                System.out.printf("\n"); j =2; i++;
            }
        }
    }
}
