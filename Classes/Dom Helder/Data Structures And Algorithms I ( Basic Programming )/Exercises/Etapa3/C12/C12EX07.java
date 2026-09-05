package Etapa3.C12;

import java.util.Scanner;

public class C12EX07 {
    public static void main(String[] args) {

        /*
        Ler dois vetores e relacionalos
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        Scanner teclado = new Scanner(System.in);

        String nome[] = new String[5];
        double nota[] = new double[5];
        char conceito;

        for (int i = 0; i < nome.length; i++){

            System.out.println("Informe o nome do aluno: ");
            nome[i] = teclado.nextLine();

            System.out.println("Informe a nota do aluno: ");
            nota[i] = teclado.nextDouble();
            teclado.nextLine();


    }
        for (int i = 0; i < nome.length; i++){
            if (nota[i] <= 30){
                conceito = 'D';
            } else if (nota[i] < 60){
                conceito = 'C';
            } else if (nota[i] < 80){
                conceito = 'B';
            } else {
                conceito = 'A';
            }

            System.out.printf("\nAluno: %s \nConceito: %s",nome[i],conceito);
        }
    }
}
