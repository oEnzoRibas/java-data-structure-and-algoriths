package Etapa2.C11;

import java.util.Scanner;

public class C11EX10 {
    public static void main(String[] args) {

        /*
        Printar Escada
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        int num;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número entre 1 e 9");
        num = teclado.nextInt();
        teclado.nextLine();

        // Validação do número inserido
        while (num < 1 || num > 9){

            System.out.println("NÚMERO VÁLIDO!");
            System.out.println("\nInforme um número entre 1 e 9");
            num = teclado.nextInt();
            teclado.nextLine();

        }

        for (int i = 1; i <= num; i++){

            for (int j = 1; j <= i; j++){
                System.out.print(" EMGE ");
            }
            System.out.println();
        }

    }
}
