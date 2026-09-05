package Etapa1.C07;

import javax.swing.*;
import java.util.Scanner;

public class C07EX04 {
    public static void main(String[] args) {
        String nome, estado;

        nome = JOptionPane.showInputDialog(null,"Informe o nome da equipe de futebol: ", "Pergunta", JOptionPane.QUESTION_MESSAGE);

        switch (nome){
            case "América", "Atlético", "Cruzeiro", "Villa Nova" ->
                estado = "Minas Gerais";
            case "Botafogo", "Flamengo","Fluminense", "Vasco" ->
                estado = "Rio de Janeiro";
            case "Corinthians", "Palmeiras", "Santos", "São Paulo" ->
                estado = "São Paulo";
            case "Grêmio", "Internacional", "Juventudo" ->
                estado = "Rio Grande do Sul";
            case "Náutico", "Santa Cruz", "Sport" ->
                estado = "Pernambuco";
            default -> {
                    JOptionPane.showMessageDialog(null,"Insira um nome válido!","ERRO!",JOptionPane.WARNING_MESSAGE);
            return;
            }
        }
        JOptionPane.showMessageDialog(null,"O time pertence ao estado: "+estado, "Pergunta", JOptionPane.QUESTION_MESSAGE);
    }
}
