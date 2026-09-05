package Etapa3.C12;

import java.util.Scanner;

public class C12EX12 {
    public static void main(String[] args) {

        /*
        Imprimir todos os alunos com a maior nota
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        Scanner teclado = new Scanner(System.in);

        int qntAlun = 3;
        String maiorNotaStr = null;

        String nome [] = new String[qntAlun];
        String [] alunosMaiorNota = new String[qntAlun];
        double [] nota = new double[qntAlun];
        double maiorNota = Double.MIN_VALUE;

        for (int i = 0; i <qntAlun; i++){
            System.out.println("Informe o nome do aluno: ");
            nome[i] = teclado.nextLine();
            System.out.println("Informe a nota do aluno: ");
            nota[i] = teclado.nextDouble();
            teclado.nextLine();

            if (nota[i] > maiorNota){
                maiorNota = nota[i];
                maiorNotaStr = nome [i];
            }
        }

        for (int i = 0; i <qntAlun; i++) {
            if (nota[i] == maiorNota) {
                alunosMaiorNota[i] = nome[i];
            } else{
                alunosMaiorNota[i] = " ";
            }
        }

        System.out.println("\nAlunos com a maior nota: ");

        for (int k = 0; k < qntAlun; k++){
            System.out.println(alunosMaiorNota[k]);
        }

    }
}