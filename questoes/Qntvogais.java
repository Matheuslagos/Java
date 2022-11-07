public class Qntvogais {
    public static void main(String[] args) {
        String frase = "pamonha social";
        System.out.println(vogais(frase));
    }

    public static int vogais(String str) {
        int qtdVogais = 0;
        str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char letra = str.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                qtdVogais++;
            }
        }
        return qtdVogais;
    }
}
