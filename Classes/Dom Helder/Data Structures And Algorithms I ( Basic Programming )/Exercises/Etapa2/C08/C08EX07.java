package Etapa2.C08;

import java.util.Scanner;

public class C08EX07 {

    // Ficha de alunos baseada nas idades
    // Enzo Rocha Leite Diniz Ribas


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        int idade, n, contMenor12 = 0, contMaior30 = 0;
        double media, somaIdades = 0;

        System.out.println("Informe a quantidade de alunos que serão testados: ");
        n = teclado.nextInt();

        for ( int i = 1; i <= n; i++ ){

            System.out.println("Informe o nome do aluno: ");
            teclado.next();
            System.out.println("Informe a Idade do aluno: ");
            idade = teclado.nextInt();

            if (idade <= 12){

                contMenor12++;

            } else if (idade > 30){

                contMaior30++;

            }

            somaIdades += idade;

        }
        media = somaIdades / (double) n;

                System.out.printf("Quantidade de alunos até 12 anos: %d \nQuantidade de alunos acima de 30 anos: %d \nMédia das idades dos alunos: %.1f ", contMenor12,contMaior30,media);

    }
}
