package Etapa2.C08;

import java.util.Scanner;

public class C08EX06 {
    public static void main(String[] args) {
        // Testar se os numeros fornecidos sao pares, divisiveis por 4, e se sao divisiveis por 3.
        // Autor: Enzo Rocha Leite Diniz Ribas
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nInforme a quantidade de números que serão testados: ");
        int sumDiv4 = 0, num, contDiv3 = 0, n = teclado.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("\n\nInforme um número: ");
            num = teclado.nextInt();
            if (num % 2 == 0){
                System.out.printf("\nO número %d é Par",num);
            } else {
                System.out.printf("\nO número %d é Impar",num);
            }
            if (num % 4 == 0){
                sumDiv4 += num;
            } if (num % 3 == 0) {
                contDiv3 ++;
            }
        }
        System.out.printf("\nO somatório dos números divisíveis por 4 é de: %d",sumDiv4);
        System.out.printf("\nA quantidade de números divisíveis por 3 é de: %d",contDiv3);
    }
}

