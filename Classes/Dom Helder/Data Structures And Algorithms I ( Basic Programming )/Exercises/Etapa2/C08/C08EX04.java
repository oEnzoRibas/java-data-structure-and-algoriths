package Etapa2.C08;

import java.util.Scanner;
// Ler o nome e idade dos alunos e calcular a quantidade de alunos com maioridade
// Autor: Enzo Rocha Leite Diniz Ribas
public class C08EX04 {
    public static void main(String[] args) {
        String nome;
        int idade, contMenorIdade = 0, n=50;
        for (int i = 1; i <= n; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            nome = teclado.nextLine();
            System.out.println("Digite sua Idade: ");
            idade = teclado.nextInt();
            if (idade <=18){
                contMenorIdade++;
            }
        }
        System.out.println("Quantidade de alunos até 18 anos: "+contMenorIdade+"\n"+
                "Quantidade de alunos com mais de 18 anos: "+(n-contMenorIdade));
    }
}
