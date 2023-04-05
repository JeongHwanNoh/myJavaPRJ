import java.util.Scanner;

public class bigdata12 {
    public static void main(String[] args) {
        String a;

        Scanner sc = new Scanner(System.in);

        System.out.printf("데이터 형식을 입력하세요 : ");
        a = sc.next();

        switch (a) {
            case "int":
            case "short":
            case "byte":
            case "long":
                System.out.printf("정수형 데이터형식입니다.");
                break;
            case "double":
            case "float":
                System.out.printf("실수형 데이터 형식입니다.");
                break;
            case "char":
            case "String":
            case "boolean":
                System.out.printf("문자형 데이터 형식입니다.");
                break;
        }

    }
}

