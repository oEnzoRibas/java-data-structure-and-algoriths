package Etapa3.C12;

import java.util.Scanner;

public class C12EX23 {
    public static void main(String[] args) {

        /*
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        int vet[] = new int[10];
        int vet3[] = new int[vet.length];

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Informe um número: ");
            vet[i] = teclado.nextInt();
        }

        for (int j = 0; j < vet.length; j++) {
            if (vet[j] % 3 == 0) {
                vet3[j] = vet[j];
                System.out.print(vet3[j]);
            }
        }
    }
}
