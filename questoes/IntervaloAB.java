import java.util.ArrayList;

public class IntervaloAB {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = 20;
        System.out.println(intervaloab(a, b));
    }

    public static ArrayList<Integer> intervaloab(int n1, int n2) {
        ArrayList<Integer> intervalo = new ArrayList<Integer>();
        for (int i = n1; i < n2; i++) {
            intervalo.add(i);
        }
        return intervalo;
    }

}
