package Beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1151 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int N, atual = 1, prx, ant = 0;
        N = input.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i == N) {
                System.out.println(ant);
            } else {
                System.out.print(ant + " ");
                prx = ant + atual;
                ant = atual;
                atual = prx;
            }
        }

    }

}
