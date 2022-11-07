package questoes;

public class Mmc {
    public static void main(String[] args) {
        int a, b;
        a = 20;
        b = 30;
        System.out.println(mmc(a, b));
    }

    public static int mdc(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static int mmc(int a, int b) {
        return a * (b / mdc(a, b));

    }

}
