package questoes;

public class Mdc {
    public static void main(String[] args) {
        int a = 20;
        int b = 43;
        System.out.println(mdc(a, b));
    }

    public static int mdc(int a, int b) {
        int resto;
        while (b != 0) {
            resto = a % b;
            a = b;
            b = resto;
        }

        return a;
    }
}
