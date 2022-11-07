package questoes;

public class Qntpalavras {
    public static void main(String[] args) {
        String frase = "a praia ta cheia";
        System.out.println(qntpalavras(frase));
    }

    public static int qntpalavras(String frase) {
        String[] arrayFrase = frase.split(" ");
        return arrayFrase.length;
    }
}
