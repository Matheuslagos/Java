package Poo1;

import java.lang.Math;

public class Circulo {
    public static void main(String[] args) {
        double r = 10.0;
        System.out.println("area eh: " + area(r));
        System.out.println("circuferencia eh: " + circunferencia(r));
    }

    public static double area(double r) {
        double area = Math.pow(r, 2) * Math.PI;
        return area;

    }

    public static double circunferencia(double r) {
        double circun = 2 * r * Math.PI;
        return circun;
    }
}
