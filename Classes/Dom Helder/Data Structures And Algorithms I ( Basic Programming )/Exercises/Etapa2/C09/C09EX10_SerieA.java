package Etapa2.C09;

import java.util.Scanner;

public class C09EX10_SerieA {
    public static void main(String[] args) {

        // Fazer a serie serie matematica
        // Autor: Enzo Rocha Leite Diniz Ribas

        int rep;
        double serie = 0, den, num;

        rep = 100;

        for (int aux = 1; aux <= rep; aux++){
            num = aux;
            den = Math.sqrt(aux*2);
            serie += ( num / den );
        }
        System.out.println(serie);
    }
}
