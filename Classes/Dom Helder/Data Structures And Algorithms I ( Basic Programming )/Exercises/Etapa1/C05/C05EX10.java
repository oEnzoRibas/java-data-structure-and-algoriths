package Etapa1.C05;

import javax.swing.*;

public class C05EX10 {
    public static void main(String[] args) {
        // Separar número verticalmente
        // Autor: Enzo Rocha Leite Diniz Ribas
        int d1,d2,d3,d4,d5, num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número inteiro de 5 digitos: ",
                "Informante", JOptionPane.QUESTION_MESSAGE));
        d1 = num / 10000;
        d2 = num / 1000 % 10;
        d3 = num / 100 % 10;
        d4 = num / 10 % 10;
        d5 = num % 10;
        JOptionPane.showMessageDialog(null,"Seu número é:\n"+d1+"\n"+d2+"\n"+d3+"\n"+d4+"\n"+d5);
    }
}
