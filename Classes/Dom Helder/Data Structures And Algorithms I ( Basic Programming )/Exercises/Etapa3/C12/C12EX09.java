package Etapa3.C12;

import java.util.Scanner;

public class C12EX09 {
    public static void main(String[] args) {

        /*
        Imprimir quais numeros sao divisores da soma de todos os numeros de um vetor
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        int[] vet = new int[10];

        Scanner teclado = new Scanner(System.in);
        double soma = 0;

        // preencher vetor
        for (int i = 0; i < vet.length; i++) {

            System.out.println("Informe um número inteiro: ");
            vet[i] = teclado.nextInt();
            soma += vet[i];

        }


        for (int j = 0; j < vet.length; j++){

            if ( soma % vet[j] == 0){

                System.out.println(vet[j]);

            }

        }
    }
}