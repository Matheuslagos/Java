package Poo1;

public class Notas {

    public static void main(String[] args) {

        int nota1 = 100, nota2 = 60, nota3 = 100, nota4 = 40;
        String disciplina = "poo";
        System.out.println("media parcial: " + parcial(nota1, nota2, nota3, nota4));
        // checa se a media esta abaixo de 60//
        if (parcial(nota1, nota2, nota3, nota4) < 60) {

            System.out.println("media final do aluno: " + mediafinal(parcial(nota1, nota2, nota3, nota4)));
        }
    }

    // como salvar o resultado do return para fazer uma comparaçao? gostaria de
    // salvar o return fim em uma variavel.//
    public static int parcial(int nota1, int nota2, int nota3, int nota4) {
        int a = (nota1 * 2 + nota2 * 2 + nota3 * 3 + nota4 * 3) / 10;
        return a;
    }

    public static int mediafinal(int a) {
        int nfinal = 90;
        int fim = (nfinal + a) / 2;
        return fim;
    }
}
