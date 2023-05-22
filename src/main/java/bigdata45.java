import java.util.Random;
import java.util.Scanner;

public class bigdata45 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Random r = new Random();

        for(int a = s.nextInt(); a > 0; a--) {
            System.out.print("["+(r.nextInt(20))+"]");
        }

    }
}
