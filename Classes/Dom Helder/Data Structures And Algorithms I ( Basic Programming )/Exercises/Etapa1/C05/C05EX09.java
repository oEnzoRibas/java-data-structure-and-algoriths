package Etapa1.C05;

import javax.swing.*;

public class C05EX09 {
    public static void main(String[] args) {
        // Calcular Média Ponderada das Notas
        // Autor: Enzo Rocha Leite Diniz Ribas
        int nota1, nota2, nota3;
        nota1= Integer.parseInt(JOptionPane.showInputDialog(null,"Informe sua primeira nota: ","Informante",JOptionPane.QUESTION_MESSAGE));
        nota2= Integer.parseInt(JOptionPane.showInputDialog(null,"Informe sua segunda nota: ","Informante",JOptionPane.QUESTION_MESSAGE));
        nota3= Integer.parseInt(JOptionPane.showInputDialog(null,"Informe sua terceira nota: ","Informante",JOptionPane.QUESTION_MESSAGE));
        double mediaPon = ((double)((nota1*2)+(nota2*3)+(nota3*5))/(2+3+5));
        JOptionPane.showMessageDialog(null,
                "A Média Ponderada Das Notas é de: "+mediaPon);
    }
}
