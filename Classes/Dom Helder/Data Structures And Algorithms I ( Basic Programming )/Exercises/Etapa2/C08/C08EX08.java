package Etapa2.C08;

import java.util.Scanner;

public class C08EX08 {

    // Calcular se um aluno foi aprovado ou não baseado nas faltas e notas.
    // Enzo Rocha Leite Diniz Ribas

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double notaFinal, media, soma = 0;
        int totalFaltas, n, numApr = 0, contFaltas16 = 0;

        System.out.println("Informe a quantidade de alunos que serão testados: ");
        n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Informe sua nota final: ");
            notaFinal = teclado.nextDouble();
            System.out.println("Informe a quantidade de faltas que você possui: ");
            totalFaltas = teclado.nextInt();

            if (!(notaFinal >= 65 && totalFaltas <= 16)) {
                System.out.println("ALUNO REPROVADO\n");
                if (totalFaltas <= 16) {
                    contFaltas16++;
                }
            } else {
                System.out.println("ALUNO APROVADO\n");
                soma += notaFinal;
                numApr++;
            }


        }
        System.out.println(soma);
        media = soma / (double) numApr;
        System.out.printf("\nMédia das notas dos aprovados: %.1f\nQuantidade de alunos com mais de 16 faltas: %d", media, contFaltas16);

    }
}
