package Etapa2.C08;

import java.util.Scanner;
// Calcular Se aluno foi aprovado ou reprovado com base nas notas e faltas
// Autor: Enzo Rocha Leite Diniz Ribas
public class C08EX02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 1; i <= 50; i++) {
            System.out.println("Digite sua nota: ");
            double nota = teclado.nextDouble();
            System.out.println("Digite quantas faltas você possui: ");
            double falta = teclado.nextDouble();
            if (nota >= 65 && falta<=16)
                System.out.println("APROVADO");
            else System.out.println("REPROVADO\n");
            teclado.close();
        }
    }
}
