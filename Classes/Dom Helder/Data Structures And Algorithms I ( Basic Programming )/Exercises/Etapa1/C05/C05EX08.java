package Etapa1.C05;

import javax.swing.*;
import java.util.Scanner;

public class C05EX08 {
    public static void main(String[] args) {
        // Calcular raio de um setor circular
        // Autor: Enzo Rocha Leite Diniz Ribas
        double S, alfa, raio;
        S = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Informe o valor da área do Setor Circular: ", "Informante",
                        JOptionPane.QUESTION_MESSAGE));
        alfa = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Informe o valor do Ângulo do Circular:", "Informante",
                JOptionPane.QUESTION_MESSAGE));
        raio = Math.pow((S*360/(alfa*Math.PI)),1.0/2);
        JOptionPane.showMessageDialog(null,"O Raio do Setor Circular é "+raio, "informante", JOptionPane.INFORMATION_MESSAGE);
    }
}
