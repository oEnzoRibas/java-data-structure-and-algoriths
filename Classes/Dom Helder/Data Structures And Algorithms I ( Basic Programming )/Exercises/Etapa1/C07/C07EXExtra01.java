package Etapa1.C07;

import javax.swing.*;

public class C07EXExtra01 {
    public static void main(String[] args) {
        // Interrogatório sobre um assassinato
        // Autor: Enzo Rocha Leite Diniz Ribas

        String telefonou, local, mora, devia, trabalhou, classificacao;
        int cont = 0;

        JOptionPane.showMessageDialog(null,"RESPONDA AS PERGUNTAS APENAS COM S (SIM) OU N (NÃO)");

        telefonou = JOptionPane.showInputDialog(null,"Você telefonou para a vítima?", "Pergunta", JOptionPane.QUESTION_MESSAGE);
        if ( !(telefonou.equalsIgnoreCase("S") || telefonou.equalsIgnoreCase("N")) ){
         JOptionPane.showMessageDialog(null,"RESPONDA AS PERGUNTAS APENAS COM S (SIM) OU N (NÃO)");
        return;
        }
        local = JOptionPane.showInputDialog(null,"Você esteve no local do crime?", "Pergunta", JOptionPane.QUESTION_MESSAGE);
        if ( !(local.equalsIgnoreCase("S") || local.equalsIgnoreCase("N")) ){
            JOptionPane.showMessageDialog(null,"RESPONDA AS PERGUNTAS APENAS COM S (SIM) OU N (NÃO)");
            return;
        }
        mora = JOptionPane.showInputDialog(null,"Você mora perto da vítima?", "Pergunta", JOptionPane.QUESTION_MESSAGE);
        if ( !(mora.equalsIgnoreCase("S") || mora.equalsIgnoreCase("N")) ){
            JOptionPane.showMessageDialog(null,"RESPONDA AS PERGUNTAS APENAS COM S (SIM) OU N (NÃO)");
            return;
        }
        devia = JOptionPane.showInputDialog(null,"Você Devia para a vítima?", "Pergunta", JOptionPane.QUESTION_MESSAGE);
        if ( !(devia.equalsIgnoreCase("S") || devia.equalsIgnoreCase("N")) ){
            JOptionPane.showMessageDialog(null,"RESPONDA AS PERGUNTAS APENAS COM S (SIM) OU N (NÃO)");
            return;
        }
        trabalhou = JOptionPane.showInputDialog(null,"Você já trabalhou com a vítima?", "Pergunta", JOptionPane.QUESTION_MESSAGE);
        if ( !(trabalhou.equalsIgnoreCase("S") || trabalhou.equalsIgnoreCase("N")) ){
            JOptionPane.showMessageDialog(null,"RESPONDA AS PERGUNTAS APENAS COM S (SIM) OU N (NÃO)");
            return;
        }
        if (telefonou.equalsIgnoreCase("S")){
            cont++;
        }
        if (local.equalsIgnoreCase("S")){
            cont++;
        }
        if (mora.equalsIgnoreCase("S")){
            cont++;
        }
        if (devia.equalsIgnoreCase("S")){
            cont++;
        }
        if (trabalhou.equalsIgnoreCase("S")){
            cont++;
        }
        switch (cont){
            case 2 ->
                classificacao = "SUSPEITO";
            case 3, 4 ->
                classificacao = "CÚMPLICE";
            case 5 ->
                classificacao = "ASSASSINO";
            default ->
                classificacao = "INOCENTE";
        }
        JOptionPane.showMessageDialog(null, "VOCÊ ESTÁ CLASSIFICADO COMO: "+classificacao, "RESULTADO",JOptionPane.WARNING_MESSAGE);
    }
}
