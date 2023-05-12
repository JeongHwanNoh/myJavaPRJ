import java.util.Scanner;

public class bigdata40 {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        int x= s.nextInt();
        int y = s.nextInt();

        if (x > 0) {
            if(y > 0) {
                System.out.print(1);
            }
            else {
                System.out.print(4);
            }
        }
        else {
            if (y > 0) {
                System.out.print(2);
            }
            else {
                System.out.print(3);
            }
        }

    }
}
