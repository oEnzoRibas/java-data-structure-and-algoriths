package Etapa3.C12;

import java.util.Scanner;

public class C12EX21 {
    public static void main(String[] args) {

      /*
    Imprimir as posições pares seguidas das posições ímpares de um vetor
    Autor: Enzo Rocha Leite Diniz Ribas
    */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade de termos que será testada: ");
        int qnt = teclado.nextInt();
        teclado.nextLine();

        double num[] = new double[qnt];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Informe um número: ");
            num[i] = teclado.nextDouble();
            teclado.nextLine();
        }
        System.out.println("Posições Pares:");
        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 1) {
                System.out.print(num[i] + " ");
            }
        }

        System.out.println("\nPosições Ímpares:");
        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 0) {
                System.out.print(num[i] + " ");
            }
        }
    }
}
