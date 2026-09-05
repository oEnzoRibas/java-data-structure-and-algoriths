package Etapa2.C08;

import java.util.Scanner;

public class C08EX18 {
    public static void main(String[] args) {

        // Imprimir tabuada de um número
        // Autor: Enzo Rocha Leite Diniz Ribas

        int num;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número INTEIRO entre 1 a 9: ");
        num = teclado.nextInt();
        teclado.nextLine();

        for ( int i = 1; i <= 9; i ++){
            System.out.println(i+" X "+num+" = "+(num*i));
        }

    }
}
