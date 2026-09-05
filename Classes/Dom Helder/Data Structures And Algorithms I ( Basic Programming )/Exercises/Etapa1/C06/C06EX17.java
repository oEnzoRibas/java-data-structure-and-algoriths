package Etapa1.C06;

import javax.swing.*;
import java.util.Objects;

public class C06EX17 {
    public static void main(String[] args) {

        // Questionário de admissão de um empresa
        // Autor: Enzo Rocha Leite Diniz Ribas

        String tecPro, supPro, menos3AnosXp, criativo, liderar, sozinho, autodidata, remuneracao, soBH;

        JOptionPane.showMessageDialog(null,"Responda as perguntas a seguir com V (VERDADEIRO) ou F (FALSO).");

        //Ler informações dadas pelo usuário
        tecPro = JOptionPane.showInputDialog(null,"Você tem curso técnico de programação? ", "Pergunta ", JOptionPane.QUESTION_MESSAGE);
        //Abortar o programa caso o usuário digite uma informação inválida.
        if (!((tecPro.equalsIgnoreCase("V")) || (tecPro.equalsIgnoreCase( "F") ) ) ) {
            JOptionPane.showMessageDialog(null,"INFORME UM VALOR VÁLIDO.","Erro",JOptionPane.WARNING_MESSAGE);
            return;
        }

        supPro = JOptionPane.showInputDialog(null,"Você tem curso superior de programação? ", "Pergunta ", JOptionPane.QUESTION_MESSAGE);
        if (!((supPro.equalsIgnoreCase("V")) || (supPro.equalsIgnoreCase( "F") ) ) ) {
            JOptionPane.showMessageDialog(null,"INFORME UM VALOR VÁLIDO.","Erro",JOptionPane.WARNING_MESSAGE);
            return;
        }

        menos3AnosXp = JOptionPane.showInputDialog(null,"Você tem menos de 3 anos de experiência em programação? ", "Pergunta ", JOptionPane.QUESTION_MESSAGE);
        if (!((menos3AnosXp.equalsIgnoreCase("V")) || (menos3AnosXp.equalsIgnoreCase( "F") ) ) ) {
            JOptionPane.showMessageDialog(null,"INFORME UM VALOR VÁLIDO.","Erro",JOptionPane.WARNING_MESSAGE);
            return;
        }

        criativo = JOptionPane.showInputDialog(null,"Você se considera uma pessoa criativa? ", "Pergunta ", JOptionPane.QUESTION_MESSAGE);
        if (!((criativo.equalsIgnoreCase("V")) || (criativo.equalsIgnoreCase( "F") ) ) ) {
            JOptionPane.showMessageDialog(null,"INFORME UM VALOR VÁLIDO.","Erro",JOptionPane.WARNING_MESSAGE);
            return;
        }

        liderar = JOptionPane.showInputDialog(null,"Você prefere liderar a ser liderado? ", "Pergunta ", JOptionPane.QUESTION_MESSAGE);
        if (!((liderar.equalsIgnoreCase("V")) || (liderar.equalsIgnoreCase( "F") ) ) ) {
            JOptionPane.showMessageDialog(null,"INFORME UM VALOR VÁLIDO.","Erro",JOptionPane.WARNING_MESSAGE);
            return;
        }

        sozinho = JOptionPane.showInputDialog(null,"Você prefere trabalhar sozinho a trabalhar em equipe? ", "Pergunta ", JOptionPane.QUESTION_MESSAGE);
        if (!((sozinho.equalsIgnoreCase("V")) || (sozinho.equalsIgnoreCase( "F") ) ) ) {
            JOptionPane.showMessageDialog(null,"INFORME UM VALOR VÁLIDO.","Erro",JOptionPane.WARNING_MESSAGE);
            return;
        }

        autodidata = JOptionPane.showInputDialog(null,"Você é autodidata? ", "Pergunta ", JOptionPane.QUESTION_MESSAGE);
        if (!((autodidata.equalsIgnoreCase("V")) || (autodidata.equalsIgnoreCase( "F") ) ) ) {
            JOptionPane.showMessageDialog(null,"INFORME UM VALOR VÁLIDO.","Erro",JOptionPane.WARNING_MESSAGE);
            return;
        }

        remuneracao = JOptionPane.showInputDialog(null,"Você aceitaria uma remuneração inicial de R$1500,00? ", "Pergunta ", JOptionPane.QUESTION_MESSAGE);
        if (!((remuneracao.equalsIgnoreCase("V")) || (remuneracao.equalsIgnoreCase( "F") ) ) ) {
            JOptionPane.showMessageDialog(null,"INFORME UM VALOR VÁLIDO.","Erro",JOptionPane.WARNING_MESSAGE);
            return;
        }

        soBH = JOptionPane.showInputDialog(null,"Você só aceitaria trabalhar em escritórios da empresa dentro da granda BH? ", "Pergunta ", JOptionPane.QUESTION_MESSAGE);
        if (!((soBH.equalsIgnoreCase("V")) || (soBH.equalsIgnoreCase( "F") ) ) ) {
            JOptionPane.showMessageDialog(null,"INFORME UM VALOR VÁLIDO.","Erro",JOptionPane.WARNING_MESSAGE);
            return;
        }

        //Comparar Respostas para ver se a pessoa está apta
        if (((soBH.equalsIgnoreCase("V"))) || (sozinho.equalsIgnoreCase("V")) || (autodidata.equalsIgnoreCase("F")) || (criativo.equalsIgnoreCase("F"))){
            JOptionPane.showMessageDialog(null,"Você NÃO está apto a trabalhar na empresa.", "Aptidão", JOptionPane.WARNING_MESSAGE);
        }else if ( supPro.equalsIgnoreCase("F") ){
            //Se não tiver superior, porém tiver tecnico E 3 anos ou mais de experiencia retona verdadeiro
            if (!((tecPro.equalsIgnoreCase("V")) && (menos3AnosXp.equalsIgnoreCase("F")))){

                JOptionPane.showMessageDialog(null,"Você NÃO está apto a trabalhar na empresa.", "Aptidão", JOptionPane.WARNING_MESSAGE);

            }
        } if ( (liderar.equalsIgnoreCase("V")) && (remuneracao.equalsIgnoreCase("V")) ){
            JOptionPane.showMessageDialog(null,"Você NÃO está apto a trabalhar na empresa.", "Aptidão", JOptionPane.WARNING_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null,"Você ESTÁ apto a trabalhar na empresa.", "Aptidão", JOptionPane.WARNING_MESSAGE);
        }
    }
}
