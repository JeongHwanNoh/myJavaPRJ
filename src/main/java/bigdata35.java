import java.util.*;

public class bigdata35 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        String[][] arr = new String[a][2];

        for (int i = 0; i < a; i++) {
            arr[i][0] = s.next();
            arr[i][1] = s.next();
        }
        Arrays.sort(arr, new Comparator<String[]>() {
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt((o1[0])) - Integer.parseInt(o2[0]);
            }

        });
        for (int i = 0; i < a; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
