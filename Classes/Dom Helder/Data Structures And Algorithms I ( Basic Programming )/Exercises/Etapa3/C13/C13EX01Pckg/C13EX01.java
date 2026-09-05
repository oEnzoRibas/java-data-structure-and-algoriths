package Etapa3.C13.C13EX01Pckg;

import java.util.Scanner;

public class C13EX01 {
    public static void main(String[] args) {

        /*
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        int x1,x2, y1,y2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor de X1: ");
        x1 = teclado.nextInt();
        System.out.println("Informe o valor de Y1: ");
        y1 = teclado.nextInt();
        System.out.println("Informe o valor de X2: ");
        x2 = teclado.nextInt();
        System.out.println("Informe o valor de Y2: ");
        y2 = teclado.nextInt();

        System.out.println(coordenadas(x1,x2,y1,y2));

    }
    static double coordenadas (double x1, double x2,double y1, double y2){
        return Math.sqrt(Math.pow( (x1-x2), 2 ) + Math.pow( (y1-y2), 2 ) );
    }
}
