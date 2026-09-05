package Etapa3.C12;

import java.util.Scanner;

public class C12EX11 {
    public static void main(String[] args) {

        /*
        Imprimir o aluno com a maior nota
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        Scanner teclado = new Scanner(System.in);

        int qntAlun = 8;
        String maiorNotaStr = null;

        String [] nome = new String[qntAlun];
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

        System.out.printf("Aluno com a maior nota: %s",maiorNotaStr);
       
        
    }
}
