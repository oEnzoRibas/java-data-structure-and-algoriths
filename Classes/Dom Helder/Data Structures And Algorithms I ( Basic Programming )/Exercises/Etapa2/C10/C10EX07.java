package Etapa2.C10;

import javax.swing.*;

public class C10EX07 {
    public static void main(String[] args) {

        // Calcular tempo de infecção de uma população
        // Autor: Enzo Rocha Leite Diniz Ribas

        double popSau, popInf = 1;
        int dias = 0, meses, anos;

        popSau = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe a quantidade de habitantes que vivem em uma determinada região"));

        do {

            if ((popSau > popInf)){
                popInf += (popInf *  0.003);
                dias++;
            }

        }while (popSau > popInf);

        anos = dias / 365;
        meses = (dias % 365) / 30;
        dias = (dias % 365) % 30;

        JOptionPane.showMessageDialog(null,"Tempo para toda a população ser infectada:\nAnos: "+anos+"\nMeses: "+meses+"\nDias: "+dias,"Tempo",JOptionPane.INFORMATION_MESSAGE);
    }
}
