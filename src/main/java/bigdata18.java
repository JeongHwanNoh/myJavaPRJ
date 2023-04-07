import java.util.Scanner;

public class bigdata18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[5];
        int c = 0;

        System.out.printf("5개의 숫자를 입력하세요. : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
            for (i = 0; i < a.length; i++) {
                for (int b = i + 1; b < a.length; i++) {
                    if (a[i] == a[b]) {
                        System.out.printf("다시 시도하세요");
                        c = 1;
                    }
                }
            }
        }
                    if (c == 0) {

                        for (int i = 0; i < a.length - 1; i++) {
                            int m = i;

                            for (int j = i + 1; j < a.length; j++) {
                                if (a[j] < a[m]) {
                                    m = j;
                                }
                            }
                            int temp = a[i];
                            a[i] = a[m];
                            a[m] = temp;
                        }
                        System.out.printf("결과값 : ");
                        for (int i = 0; i < a.length; i++) {
                            System.out.print(a[i]);
                        }
                    }
                }
            }



