package questoes;

public class Parimpar {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(imparpar(a));
    }

    public static int imparpar(int a) {

        if (a % 2 == 0) {
            a = 1;
        } else {
            a = 0;
        }
        return a;
    }
}
