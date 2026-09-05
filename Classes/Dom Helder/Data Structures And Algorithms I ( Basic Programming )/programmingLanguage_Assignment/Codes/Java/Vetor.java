package TrabalhoCSharp;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {

        // Exemplo de um Vetor em Java.
        // @Autores: Enzo R. L. D. Ribas && Ana Luiza

        Scanner teclado = new Scanner(System.in);
        int qnt;

        System.out.println("Informe a quantidade de dados a serem guardados: ");
        qnt = teclado.nextInt();

        int[] vet = new int[qnt];

        for (int aux = 0; aux < vet.length; aux++) {
            System.out.println("Informe o valor a ser guardado: ");
            vet[aux] = teclado.nextInt();
        }

        System.out.println("Valores guardados: ");
        for (int aux = 0; aux < vet.length; aux++) {
            System.out.println(vet[aux] + " ");
        }

        System.out.println("\r\n Valores guardados ao quadrado: ");
        for (int i : vet) {
            System.out.println(Math.pow(i, 2) + " ");
        }
    }

}
