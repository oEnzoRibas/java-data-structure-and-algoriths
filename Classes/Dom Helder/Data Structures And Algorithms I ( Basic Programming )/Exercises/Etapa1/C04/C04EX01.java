package Etapa1.C04;

import javax.swing.*;
import java.util.Scanner;

public class C04EX01 {
    public static void main(String[] args) {
       // Programa: Ficha do usuário
        // Autor: Enzo Rocha Leite Diniz Ribas
        String Sobrenome, primeiroNome, segundoNome;
        int idade;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu SOBRENOME: ");
        Sobrenome = teclado.nextLine();
        System.out.println("Digite seu PRIMEIRO nome:");
        primeiroNome = teclado.nextLine();
        System.out.println("Digite seu SEGUNDO nome:");
        segundoNome = teclado.nextLine();
        System.out.println("Digite sua IDADE:");
        idade = teclado.nextInt();
        System.out.printf("Seu nome é: %s %s %s\nSua idade é: %d",primeiroNome,segundoNome,Sobrenome,idade);
        System.out.println();
        teclado.close();
    }
}
