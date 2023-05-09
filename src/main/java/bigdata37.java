import java.util.*;

public class bigdata37 {
    public static void main(String[] args) {

        String a;

        Scanner s = new Scanner(System.in);

        System.out.printf("문자열을 입력하세요. : ");
        a = s.nextLine();

        System.out.println(" " + a.replace(" ", "$"));
        System.out.println(" " + a.trim());
        System.out.println(" " + a.toUpperCase() + " ");
        System.out.println(" " + a.toLowerCase() + " ");
    }
}
