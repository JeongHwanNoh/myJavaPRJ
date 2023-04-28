import java.util.Scanner;

public class bigdata33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = 0;
        while (true) {
            a = s.nextInt();
            if (a == -1) break;
            int arr[] = new int[a];
            int sum = 0;
            int index = 0;
            for (int i = 1; i < a; i++) {
                if (a % i == 0) {
                    arr[index++] = i;
                    sum += i;
                }
            }
            if (sum != a) {
                System.out.println(a + " is NOT perfect.");
                continue; }
            System.out.print(a + " = ");
            for (int i = 0; i < index; i++) {
                if (i == index - 1)
                    System.out.print(arr[i]);
                else
                    System.out.print(arr[i] + " + ");
            }
            System.out.println();
        }
        s.close();
    }
}