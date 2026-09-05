package Etapa2.C11;

import java.util.Scanner;

public class C11EX14 {
    public static void main(String[] args) {

        /*
        Calcular valor de PI
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        double serie = 0, den, num = 1, cont = 1, vlr = 0;

        new Scanner(System.in);

        while (!(vlr > 3.1416 && vlr < 3.1417)){

            if ( cont % 2 == 0) {
                den = (cont*2)-1;
                serie -= (num / den);
            } else {
                den = (cont*2)-1;
                serie += ( num / den );
            }
            vlr = 4 * (serie);
            cont++;
        }

        System.out.println( "Valor de Pi: "+vlr+" \nQuantidade de termos para ficar entre 3.1416 e 3.1417: "+(cont - 1));


    }
}
