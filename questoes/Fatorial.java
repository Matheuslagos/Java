package questoes;

public class Fatorial {
    public static void main(String[] args) {
        int a = 7;
        System.out.println(fatorial(a));
    }

    public static int fatorial(int a) {
        int fat = 1;
        for (int i = 1; i <= a; i++) {
            fat *= i;
        }
        return fat;

    }
}
