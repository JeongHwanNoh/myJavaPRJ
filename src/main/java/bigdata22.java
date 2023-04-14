import java.util.Scanner;

public class bigdata22 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int H = s.nextInt();
        int M = s.nextInt();
        s.close();

        if (M < 45) {
            H--;
            M = 60 - (45 - M);
            if (H < 0) {
                H = 23;
            }
            System.out.printf("%d %d", H, M);
        } else {
            System.out.printf("%d %d", H, M - 45);
        }
    }
}

