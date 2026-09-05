package Etapa1.C05;

import java.util.Scanner;
        //calcular se um número é um palindromo
        // Não funciona com numéros com zeros à esquerda
        // Autor Enzo Rocha Leite Diniz Riabs
public class C05EXExtra01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número de 4 digitos: ");
        String numeroInformadoStr = teclado.nextLine();

        if (numeroInformadoStr.length() != 4) {
            System.out.println("Número inválido. Digite um número de 4 dígitos");
            return;
        }

        int d1, d2, d3, d4, numeroInvertido, numeroInformado = Integer.parseInt(numeroInformadoStr);
        d1 = numeroInformado / 1000;
        d2 = numeroInformado / 100 % 10;
        d3 = numeroInformado / 10 % 10;
        d4 = numeroInformado % 10;

        numeroInvertido = d4 * 1000 + d3 * 100 + d2 * 10 + d1;

        System.out.println("Número Informado: "+numeroInformado+"\nNúmero Invertido: "+numeroInvertido+"\n");

        if (numeroInformado == numeroInvertido) {
            System.out.printf("%d é um Palíndromo", numeroInformado);
        } else {
            System.out.printf("%d não é um palíndromo.", numeroInformado);
        }
    }
}
