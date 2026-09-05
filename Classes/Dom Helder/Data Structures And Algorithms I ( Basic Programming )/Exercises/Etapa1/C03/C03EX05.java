package Etapa1.C03;

import java.util.Scanner;
public class C03EX05 {
    // Função: Calcular Idade
// Autor: Enzo Rocha Leite Diniz Ribas
    public static void main(String[] args) {
        String nome;
        int anoNasc, anoAtual, idade;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Digite o ano em que você nasceu: ");
        anoNasc = teclado.nextInt();
        System.out.print("Digite o ano em que estamos: ");
        anoAtual = teclado.nextInt();
        idade = anoAtual - anoNasc;
        System.out.println(nome+", você tem/terá "+idade+" anos em "+anoAtual);
        teclado.close();
    }
}
