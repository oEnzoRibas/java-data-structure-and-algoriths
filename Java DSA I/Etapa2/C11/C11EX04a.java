package Etapa2.C11;

import javax.swing.*;
import java.util.Scanner;

public class C11EX04a {
    public static void main(String[] args) {

        //Calcular dados sobre multas de tr�nsito com repeti��o definida
        //Autor: Enzo Rocha Leite Diniz Ribas

        String nome, maisVelhoStr = null;
        int idade, pts, contIdade = 0, contH = 0, maisVelho = 0, sexo;
        double mlt, somaIdade = 0, mediaIdade = 0, somaMlt = 0, qntM7pts = 0, percHmtds;
        Object[] botGen = {"Mulher","Homem"};

        int rep = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a quantidade de multas que ser�o lidas:","Pergunta",JOptionPane.QUESTION_MESSAGE));


        for (int i = 1; i <= rep; i++){

            nome = JOptionPane.showInputDialog(null,"Informe seu nome:","Pergunta",JOptionPane.QUESTION_MESSAGE);
            idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe sua idade","Pergunta",JOptionPane.QUESTION_MESSAGE));
            sexo = JOptionPane.showOptionDialog(null,
                    "Informe seu sexo:",
                    "Pergunta",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,botGen,botGen[0]);
            pts = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a quantidade de pontos","Pergunta",JOptionPane.QUESTION_MESSAGE));
            mlt = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o valor da multa","Pergunta",JOptionPane.QUESTION_MESSAGE));

            // Atribui��o da pessoa mais velha
            if (i == 1 || maisVelho < idade){
                maisVelho = idade;
                maisVelhoStr = nome;
            }

            // Calculos m�dia idade
            contIdade++;
            somaIdade += idade;
            mediaIdade = somaIdade/contIdade;

            somaMlt += mlt;

            if (sexo == 1){ // Testa se o g�nero selecionado � "Homem"
                contH++;
            }else if (pts >= 7){ // Se o g�nero n�o for "Homem", ser� "Mulher", ent�o testa se teve 7 pontos na carteira
                qntM7pts++;
            }

        }

        percHmtds = (double) (contH * 100) / rep; // Calcula porcentagem de homens que foram multados

        JOptionPane.showMessageDialog(null,"Idade m�dia dos condutores:"+mediaIdade+
                "\nValor total das multas aplicadas: "+somaMlt+
                "\nPercentual de homens multados: "+percHmtds+
                "\nQuantidade de Mulheres que perderam 7 pontos na carteira: "+qntM7pts+
                "\n\nPessoa mais velha:\nNome: "+maisVelhoStr+"\nIdade: "+maisVelho,"Resposta",JOptionPane.INFORMATION_MESSAGE);


    }
}
