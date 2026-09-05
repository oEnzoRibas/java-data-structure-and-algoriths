package Etapa1.C07;

import javax.swing.*;
import java.util.Scanner;

public class C07EX02 {
    public static void main(String[] args) {
        // Calcular o conceito de um boletim de aluno
        // Autor: Enzo Rocha Leite Diniz Ribas

        int n1, n2, n3, notaFinal;
        char conceito = 'x';


        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe sua primeira nota: "); // recebe a nota da prova e atribui à var
        n1 = teclado.nextInt();

        if (n1 < 0 || n1 > 10) {
            System.out.println("Insira um valor válido!"); // testa se o valor recebido é válido
            return;
        }

        System.out.println("Informe sua segunda nota: ");
        n2 = teclado.nextInt();
        if (n2 < 0 || n2 > 10) {
            System.out.println("Insira um valor válido!");
            return;
        }
        System.out.println("Informe sua terceira nota: ");
        n3 = teclado.nextInt();
        if (n3 < 0 || n3 > 10) {
            System.out.println("Insira um valor válido!");
            return;
        }

        notaFinal = (n1+n2+n3)/3; //calcula a média das notas

        switch (notaFinal){
            case 0, 1, 2, 3, 4 ->
                conceito = 'E';
            case 5,6 ->
                conceito = 'D';
            case 7 ->
                conceito = 'C';
            case 8 ->
                conceito = 'B';
            case 9,10 ->
                conceito = 'A';
        }
        JOptionPane.showMessageDialog(null,"Seu conceito é "+conceito,"Resultado", JOptionPane.INFORMATION_MESSAGE);
        teclado.close();
    }
}
