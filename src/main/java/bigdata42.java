import java.io.*;
import java.util.*;

public class bigdata42 {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(b.readLine());

        int number = Integer.parseInt(s.nextToken());
        int index = Integer.parseInt(s.nextToken()) -1;

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                list.add(i);
                if (number / i != i) list.add(number / i);
            }
        }
        Collections.sort(list);

        System.out.println(list.size() > index ? list.get(index) : "0");
    }
}
