package Etapa3.C12;

import java.util.Scanner;

public class C12EX10 {
    public static void main(String[] args) {

        /*
        Imprimir quais alunos tiraram uma nota acima da media
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        Scanner teclado = new Scanner(System.in);

        int qntAlun = 8;
        double soma = 0, media;

        String [] nome = new String[qntAlun];
        double [] nota = new double[qntAlun];

        for (int i = 0; i < qntAlun; i++){

            System.out.println("Informe o nome do aluno: ");
            nome[i] = teclado.nextLine();
            System.out.println("Informe a nota do aluno: ");
            nota[i] = teclado.nextDouble();
            teclado.nextLine();

            soma += nota[i];
        }

        media = soma / qntAlun;

        for (int j = 0; j < qntAlun; j++){
            if (nota[j] > media){
                System.out.println(nome[j]);
            }
        }

    }
}
