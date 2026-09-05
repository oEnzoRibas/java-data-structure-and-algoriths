package Etapa2.C09;

import java.util.Scanner;

public class C09EX09 {
    public static void main(String[] args) {
        // Fazer a serie serie matematica
        // Autor: Enzo Rocha Leite Diniz Ribas
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o número de termos que você quer testar: ");

        int rep = teclado.nextInt(), passo = 1;
        double serie = 0, num , den;

        for (int aux = 1; aux <= (rep*passo); aux+=passo){
            num = Math.pow( 3,(aux+1) );
            den = (9+aux) * Math.sqrt (Math.pow( (aux) ,4) );
            serie += ( num / den );
        }
        System.out.println(Math.pow(serie,3));
    }
}
