package C14EX02Pckg;

import java.util.Scanner;

public class C14EX02_Quadrado {
    public static double area() {
        System.out.println("Informe o lado do quadrado: ");
        double lado = new Scanner(System.in).nextDouble();
        return lado*lado;
    }
}
