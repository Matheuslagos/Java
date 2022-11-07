package questoes;

public class Maior5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 13;
        int d = 14;
        int e = 22;
        System.out.println("O maior numero eh: " + maior5(a, b, c, d, e));
    }

    public static int maior5(int a, int b, int c, int d, int e) {

        int x = (a + b + Math.abs(a - b)) / 2;
        x = (x + c + Math.abs(x - c)) / 2;
        x = (x + d + Math.abs(x - d)) / 2;
        x = (x + e + Math.abs(x - e)) / 2;
        return x;
    }

}