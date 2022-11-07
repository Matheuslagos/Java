package questoes;

public class Maior2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        System.out.println("O maior numero entre os dois é: " + maior2(x, y));
    }

    public static int maior2(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

}