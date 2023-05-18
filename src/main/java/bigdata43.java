import java.util.Scanner;

public class bigdata43 {

    int result;

    public void star(int a, int b) {


        result = a * b;
    }
}

class res {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        bigdata43 result2 = new bigdata43();
        result2.star(a, b);
        System.out.println(result2.result);
    }
}

