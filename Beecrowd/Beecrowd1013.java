package Beecrowd;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Beecrowd1013 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a, b, c, d;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        d = (a + b + Math.abs(a - b)) / 2;
        d = (d + c + Math.abs(d - c)) / 2;
        System.out.printf("%d eh o maior\n", d);

    }

}