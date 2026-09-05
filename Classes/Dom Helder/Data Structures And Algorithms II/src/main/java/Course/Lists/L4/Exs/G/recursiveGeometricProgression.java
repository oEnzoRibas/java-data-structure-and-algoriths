package Course.Lists.L4.Exs.G;

import java.util.Map;
import java.util.Scanner;

public class recursiveGeometricProgression {
    public static void main(String[] args) {
        Scanner kIn = new Scanner(System.in);

        System.out.println("Informe o numero de termos desejado");
        int n = kIn.nextInt();
        System.out.println("Informe o n1");
        int n1  = kIn.nextInt();
        System.out.println("Informe a razao");
        double q  = kIn.nextDouble();

        System.out.println(pgTerm(n,n1,q));

    }
    static double pgTerm(int n, int n1 , double q){
        if (n == 1){
            return n1;
        }
        return q * pgTerm(n-1, n1, q);
    }
}
