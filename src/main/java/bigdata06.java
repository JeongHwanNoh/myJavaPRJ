public class bigdata06 { public static void main(String[] args) {
    int a, b = 0;
    for (a = 1; a < 6;) {
        if (b < a) { b++;
            System.out.print ("*");
        } else { b = 0; a++; System.out.println (" ");}
    }
}
}
