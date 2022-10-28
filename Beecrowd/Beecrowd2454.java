package Beecrowd;

import java.util.Scanner;

public class Beecrowd2454 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int P = input.nextInt();
        int R = input.nextInt();

        if (P == 0) {
            System.out.println("C");
        }
        if (P == 1 && R == 0) {
            System.out.println("B");
        }
        if (P == 1 && R == 1) {
            System.out.println("A");
        }

    }

}
