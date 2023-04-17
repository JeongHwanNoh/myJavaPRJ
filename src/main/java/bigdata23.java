import java.util.Scanner;

public class bigdata23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int y = s.nextInt();

        if(y%4==0) {
            if (y % 400 == 0) System.out.printf("1");
            else if (y % 100 == 0) System.out.printf("0");
            else System.out.printf("1");
        }
        else System.out.printf("0");
        }
    }

