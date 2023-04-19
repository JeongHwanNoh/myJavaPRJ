import java.util.Scanner;

public class bigdata24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a[] = new int[5];
        int i = 0, b = 0;
        int c[] = new int[5];

        System.out.printf("입력값 : ");
        for (i = 0; i < 5; i++) {
            a[i] = s.nextInt();
        }
        System.out.printf("저장된 값은 ");
        for (i = 0; i < 5; i++) {
            for (b = 0; b < i; b++) {
                if (a[i] == a[b]) { i++;
                }
            } System.out.printf("%d ",a[i]);
        }
    }
}
