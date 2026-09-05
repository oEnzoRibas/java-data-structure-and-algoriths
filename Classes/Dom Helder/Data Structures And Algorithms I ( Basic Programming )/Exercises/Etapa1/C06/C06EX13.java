package Etapa1.C06;

import javax.swing.*;
import java.util.Scanner;

public class C06EX13 {
    public static void main(String[] args) {
        int ht, mt;
        int h0 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a hora que o jogo começou: ","Informante",JOptionPane.QUESTION_MESSAGE));
        int m0 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o minuto que o jogo começou: ","Informante",JOptionPane.QUESTION_MESSAGE));
        int hf = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a hora que o jogo terminou: ","Informante",JOptionPane.QUESTION_MESSAGE));
        int mf = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o minuto que o jogo terminou: ","Informante",JOptionPane.QUESTION_MESSAGE));

            ht = hf-h0;
            mt = mf-m0;

        if (mt < 0){
            ht--;
            mt += 60;
        }
        JOptionPane.showMessageDialog(null,"O Jogo durou "+ht+" horas e "+mt+" minutos");
    }
}
