package Poo1;

public class Arrays {
    public static void main(String[] args) {

        double[] temperatura = new double[365];
        temperatura[0] = 31.4;
        temperatura[1] = 31.4;
        temperatura[2] = 31.4;
        temperatura[3] = 31.4;

        System.out.println(temperatura.length);

        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("o valor da temperatura do dia" + (i + 1) + " eh " + temperatura[i]);
        }
        for (double temp : temperatura) {
            System.out.println(temp);
        }
    }
}
