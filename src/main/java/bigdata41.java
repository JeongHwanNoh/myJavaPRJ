import java.util.Scanner;

public class bigdata41 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a, c;

        System.out.printf("입력 할 횟수를 정하세요 : ");
        for (a = s.nextInt(); a > 0; a--) {


            c = s.next().charAt(0);
            System.out.println(c);


        }
    }
}


