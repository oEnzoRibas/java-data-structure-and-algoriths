package Etapa1.C05;

import javax.swing.*;
// 123456789
public class C05EX11 {
    public static void main(String[] args) {
        // Separar dados de um cheque
        // Autor: Enzo Rocha Leite Diniz Ribas
        int banco, agencia, sequencial, cheque = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o número do Cheque ", "Informante", JOptionPane.QUESTION_MESSAGE));
        banco = cheque / 1000000;
        agencia = cheque /1000 % 1000;
        sequencial = cheque % 1000;JOptionPane.showMessageDialog(null,"Banco: "+banco+"\nAgência: "+agencia+"\nSequencial: "+sequencial, "Dados Do Cheque",JOptionPane.INFORMATION_MESSAGE);
    }
}
