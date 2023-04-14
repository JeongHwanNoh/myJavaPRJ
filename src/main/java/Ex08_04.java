public class Ex08_04 {
    public static void main(String[] args) {
        int aa[] = {100, 200, 300, 400}; //배열 선언으로 직접 초깃값 입력
        int bb[] = new int[]{100, 200, 300}; //배열 선언 새로운 연산자 초깃값 대입

        int cc[];
        cc = new int[]{100, 200}; //배열 선언 후 초깃값 대입
        int[] dd = new int[1]; // 베열 선언 동시에 초깃값대입
        dd[0] = 100;
        int i;

        {    System.out.println("aa 몇개? :" + aa.length);
        for (i = 0; i < aa.length; i++)
            System.out.printf("aa[%d]==>%d\t", i, aa[i]);
    }
        System.out.println();

        {  System.out.println("bb 몇개? :" + bb.length);
        for (i = 0; i < bb.length; i++)
            System.out.printf("bb[%d]==>%d\t", i, bb[i]);
    }
        System.out.println();

        {System.out.println("cc 몇개? :" + cc.length);
        for (i = 0; i < cc.length; i++)
            System.out.printf("cc[%d]==>%d\t", i, bb[i]);
    }
        System.out.println();

        {System.out.println("dd 몇개? :" + dd.length);
        for (i = 0; i < dd.length; i++)
            System.out.printf("bb[%d]==>%d\t", i, bb[i]);
    }
        System.out.println();

    }
}
