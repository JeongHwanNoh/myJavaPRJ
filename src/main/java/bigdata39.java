import java.util.Scanner;

public class bigdata39 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a, b = 0;
        int t = 24;
        while (t > 0) {
            System.out.printf("무엇을 하시겠습니까? \n1.공부하기 2.게임하기 3.밥먹기 4.잠자기 \n");
            a = s.nextInt();

            switch (a) {

                case 1:
                    --t;
                    System.out.printf("당신은 1시간을 공부하셧습니다. 정말 부지런 하시군요. [남은 시간 : %d]\n", t);
                    break;
                case 2:
                    t = t -2;
                    System.out.printf("당신은 2시간 동안 게임을 하셨습니다. [남은 시간 : %d]\n", t);
                    break;
                case 3:
                    b++;
                    if (b < 4) { --t;
                        System.out.printf("당신은 1시간 동안 밥을 먹었습니다. \n [남은 시간 : %d]\n", t);
                    } else {
                        System.out.printf("당신은 더 이상 배불러서 못먹습니다.\n");
                    }
                    break;
                case 4:
                    System.out.printf("당신은 잠을 자다 하루를 전부 보내버렸습니다\n");
                    t = 0;
                    break;
            }
            if(t <= 0) { System.out.printf("당신은 하루 일과를 마쳤습니다.");
            }

        }
    }
}
