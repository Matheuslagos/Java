package Beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1001 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int A;
        int B;
        int res;
        A = input.nextInt();
        B = input.nextInt();
        res = A + B;
        System.out.printf("X = %d\n", res);
    }
}
