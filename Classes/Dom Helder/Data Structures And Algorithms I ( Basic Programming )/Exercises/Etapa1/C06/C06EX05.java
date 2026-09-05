package Etapa1.C06;

import java.util.Scanner;

public class C06EX05 {
    public static void main(String[] args) {

        // Calcular se um número inteiro é divisível por 5 e 7
        // Autor: Enzo Rocha Leite Diniz Ribas

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número Inteiro: ");
        int test5, test7, numero = teclado.nextInt();

        test5 = numero%5;
        test7 = numero%7;

        if ( test5 == 0 && test7 == 0 ){
            System.out.println("O Número é divisível por 5 e 7");
        } else {
            System.out.println("O Número não é divisível por 5 e 7");
        }


    }
}
