package Etapa2.C08;

import java.util.Scanner;

public class C08EX16 {
    public static void main(String[] args) {

        // Calcular a médias dos numeros ímpares dentro de um intervalo
        // Autor: Enzo Rocha Leite Diniz Ribas

        double soma = 0, media;
        int vezes = 0;

        for (int i = 1000 ; i <= 2000; i+=2){

            soma += i;
            vezes++;

        }
        media = soma/vezes;
        System.out.println("Média: "+media);
    }
}
