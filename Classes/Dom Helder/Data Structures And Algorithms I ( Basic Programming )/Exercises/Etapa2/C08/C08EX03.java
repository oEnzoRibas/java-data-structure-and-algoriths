package Etapa2.C08;

import java.util.Scanner;
// Calcular Se aluno foi aprovado ou reprovado com base nas notas e faltas
// e retornar a quantidade de aprovados e reprovados
// Autor: Enzo Rocha Leite Diniz Ribas
public class C08EX03 {
    public static void main(String[] args) {
        int contAprovado = 0, falta, nota, n=50;
        Scanner teclado = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            System.out.println("Digite sua nota: ");
            nota = teclado.nextInt();
            System.out.println("Digite quantas faltas você possui: ");
            falta = teclado.nextInt();
            if (nota >= 65 && falta <= 16) {
                contAprovado++;
                System.out.println("APROVADO");
            } else {
                System.out.println("REPROVADO\n");
            }

        }
        System.out.println("O Número de Aprovados foi de : "+contAprovado+"\n"+
                "O Número de Reprovados foi de: "+(n-contAprovado));
        teclado.close();
    }
}
