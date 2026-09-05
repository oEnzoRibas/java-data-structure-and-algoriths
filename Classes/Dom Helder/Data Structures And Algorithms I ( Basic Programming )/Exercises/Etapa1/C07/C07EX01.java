package Etapa1.C07;

import javax.swing.*;
import java.util.Scanner;

public class C07EX01 {
    public static void main(String[] args) {
        // Calcular a quantidade de jogos acertados e retornar a premiação de um site de apostas
        // Autor: Enzo Rocha Leite Diniz Ribas

        String nome, premio;
        int acertos;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu nome: "); //Le e atribui nome à var
        nome = teclado.nextLine();
        System.out.println("Informe a quantidade de jogos que você acertou: "); //Lê e atribui a qnt de jogos acertados à var
        acertos = teclado.nextInt();
        if (acertos > 13 || acertos < 0){
            System.out.println("Informe um valor válido");
            return;
        }
    switch (acertos){
     case 0,1,2,3,4,5 ->
         premio = "Nada";
        case 6,7,8,9,10->
            premio = "1 cartão para apostar!";
        case 11 ->
            premio = "R$100,00";
        case 12 ->
            premio = "R$1.000,00";
        case 13 ->
            premio = "R$50.000,00";
        default -> {
            System.out.println("Informe um valor válido!");
            return;
        }
    }
        JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nO seu prêmio é : "+premio, "PARABÉNS!", JOptionPane.INFORMATION_MESSAGE);
    }
}
