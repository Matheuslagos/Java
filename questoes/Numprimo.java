package questoes;

public class Numprimo {
    public static void main(String[] args) {
        int i = 3;
        System.out.println(primo(i));
    }

    public static int primo(int i) {
        for (int n = 2; n < i; n++) {
            if (i % n == 0) {
                return 0;
            }

        }
        return 1;
    }
}
