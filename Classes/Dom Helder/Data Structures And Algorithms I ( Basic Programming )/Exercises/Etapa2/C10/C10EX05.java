package Etapa2.C10;

import javax.swing.*;
import java.util.Scanner;

public class C10EX05 {
    public static void main(String[] args) {

        // Pesquisa sobre funcionários da empresa
        // Autor: Enzo Rocha Leite Diniz Ribas

        Scanner teclado = new Scanner(System.in);

        Object[] generoBot = {"Masculino","Femino;"};
        double altura, peso, somaAltH = 0, alturaMedH;
        int genero, contH = 0, contM = 0, contM60 = 0;

        do {

                altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe sua altura:\nInsira '0' para finalizar o programa.", "Pergunta", JOptionPane.QUESTION_MESSAGE));
            if  (altura != 0) {
                peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu peso:", "Pergunta", JOptionPane.QUESTION_MESSAGE));

                genero = JOptionPane.showOptionDialog(null,
                        "Informe seu gênero:",
                        "Pergunta",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null, generoBot, generoBot[0]);

                if (genero == 0){
                    contH++;
                    somaAltH += altura;
                }else if (genero == 1){
                    contM++;
                    if (peso < 60){
                        contM60++;
                    }
                }
            }
        } while (altura != 0);

        alturaMedH = somaAltH / contH;
        
        JOptionPane.showMessageDialog(null, """
                
                QUANTIDADE DE PESSOAS PESQUISADAS:"""+(contH+contM)+"\nQUANTIDADE DE MULHERES: "+(contM)+"\nALTURA MÉDIA DOS HOMENS: "+(alturaMedH)+
                "\nQUANTIDADE DE MULHERES COM PESO MENOR QUE 60: "+(contM60));
    }
}
