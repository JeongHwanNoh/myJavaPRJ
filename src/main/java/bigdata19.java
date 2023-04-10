import java.util.Scanner;

public class bigdata19 {
    public static void main(String[] args) {
        int a [] = new int[4];
        Scanner s = new Scanner(System.in);

        System.out.printf("4개의 숫자를 입력하세요. : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();}
        int result = a[0] + a[1] + a[2] + a[3];

        System.out.printf ("%d + %d + %d + %d = %d \n", a[0] , a[1], a[2], a[3], result);


        }
    }

