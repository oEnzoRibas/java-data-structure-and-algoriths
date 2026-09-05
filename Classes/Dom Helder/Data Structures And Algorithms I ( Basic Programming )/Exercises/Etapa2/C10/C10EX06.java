package Etapa2.C10;

import javax.swing.*;

public class C10EX06 {
    public static void main(String[] args) {

        // Calcular se um Ponto P pertence a Reta R
        // Autor: Enzo Rocha Leite Diniz Ribas

        double a, b, c, x0, y0, R, P, d;

        do{

            a = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o valor de A: ","Pergunta",JOptionPane.QUESTION_MESSAGE));
            b = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o valor de B: ","Pergunta",JOptionPane.QUESTION_MESSAGE));
            c = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o valor de C: ","Pergunta",JOptionPane.QUESTION_MESSAGE));
            x0 = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o valor da coordenada X do ponto P: ","Pergunta",JOptionPane.QUESTION_MESSAGE));
            y0 = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o valor da coordenada Y do ponto P: ","Pergunta",JOptionPane.QUESTION_MESSAGE));

            d = ( (a * x0) + (b * y0) + c ) / Math.sqrt( ( Math.pow(a,2) + Math.pow(b,2) ) );

            JOptionPane.showMessageDialog(null,"D = "+d,"Resposta",JOptionPane.QUESTION_MESSAGE);

        }while (d != 0);
    }
}
