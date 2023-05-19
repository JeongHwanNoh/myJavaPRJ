import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class bigdata44 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        Integer arr[] = new Integer[a];

        for (int i = 0; i < a; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[b - 1]);

        int arr2[] = new int[a];

        for (int i = 0; i < a; i++) {
            arr2[i] = s.nextInt();
        }
        Arrays.sort(arr2);
        System.out.println(arr2[a - b]);
    }
}

