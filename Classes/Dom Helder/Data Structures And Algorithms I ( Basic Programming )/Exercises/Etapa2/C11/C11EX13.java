package Etapa2.C11;

import java.util.Scanner;

public class C11EX13 {
    public static void main(String[] args) {

        /*
        Calcular serie matemática
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        int rep;
        double vlr, serie = 0, den = 0, num = 1, cont = 1;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade de termos: ");
        rep = teclado.nextInt();

        while (cont <= rep){

                num = (cont) * Math.pow( (cont * 9) + 1, 2 * cont );
                den = Math.pow( 7,(cont - 1) );
                serie += (num / den);

            cont++;
        }
        vlr = 71 + Math.cbrt(serie);
        System.out.println( vlr );
    }
}
