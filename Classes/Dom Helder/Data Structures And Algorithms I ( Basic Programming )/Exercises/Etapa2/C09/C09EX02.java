package Etapa2.C09;

import java.util.Scanner;

public class C09EX02 {
    public static void main(String[] args) {

        // Fazer a serie matematica
        // Autor: Enzo Rocha Leite Diniz Ribas

        Scanner teclado = new Scanner(System.in);

        int rep = 100;
        double serie = 0;

        for (int aux = 1; aux <= rep; aux++){
            serie += ( (aux) / ( ( Math.pow(aux,2) ) + (aux-1) ) );
        }
        System.out.println("Valor da série: "+serie);
    }
}
