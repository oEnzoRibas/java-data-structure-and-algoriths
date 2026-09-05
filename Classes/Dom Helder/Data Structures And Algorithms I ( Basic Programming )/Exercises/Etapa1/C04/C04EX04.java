package Etapa1.C04;

import javax.swing.*;

public class C04EX04 {
    public static void main(String[] args) {
        // Programa: Ficha do usuário com caixa de diálogo
        // Autor: Enzo Rocha Leite Diniz Ribas

        String sobrenome = JOptionPane.showInputDialog(null,
                "Qual é o seu sobrenome?:",
                "Pergunta 01",
                JOptionPane.QUESTION_MESSAGE);
        String nome = JOptionPane.showInputDialog(null,
                "Qual é o seu primeiro nome?:",
                "Pergunta 02",
                JOptionPane.QUESTION_MESSAGE);
        String segnome = JOptionPane.showInputDialog(null,
                "Qual é o seu segundo nome?:",
                "Pergunta 03",
                JOptionPane.QUESTION_MESSAGE);
        String idadeStr = JOptionPane.showInputDialog(null,
                "Qual é a sua idade:",
                "Pergunta 04",
                JOptionPane.QUESTION_MESSAGE);
        int idade = Integer.valueOf(idadeStr);

        JOptionPane.showMessageDialog(null,
                "\tSeu nome é "+sobrenome+", "+nome+" "+segnome+"\nSua idade é " +idade,
                "Ficha",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
