import java.util.LinkedList;
import java.util.Scanner;

public class pratice01 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        Scanner s = new Scanner(System.in);
        int i;

        for (i = 0; i < 5; i++) {
            list.add(s.nextInt());
        }
        for (int k = 0; k < 5; k++) {
            for (int j = k + 1; j < 5; j++) {
                if (list.get(k) < list.get(j)) {
                    int c = list.get(k);
                    list.set(k, list.get(j));
                    list.set(j, c);
                }
            }
        }
        list.forEach(z -> System.out.print(z + " "));
    }
}

