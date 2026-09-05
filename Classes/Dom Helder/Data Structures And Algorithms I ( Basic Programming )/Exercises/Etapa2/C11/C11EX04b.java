package Etapa2.C11;

import javax.swing.*;

public class C11EX04b {
    public static void main(String[] args) {


        //Calcular dados sobre multas de trânsito com repetição indefinida
        //Autor: Enzo Rocha Leite Diniz Ribas

        String nome, maisVelhoStr = null;
        int idade, pts, contIdade = 0, contH = 0, maisVelho = 0, sexo, i = 0;
        double mlt, somaIdade = 0, mediaIdade = 0, somaMlt = 0, qntM7pts = 0, percHmtds;
        Object[] botGen = {"Mulher","Homem"};

        JOptionPane.showMessageDialog(null,"PARA ENCERRAR O PROGRAMA DIGITE 'X' no NOME","AVISO",JOptionPane.WARNING_MESSAGE);
        nome = JOptionPane.showInputDialog(null,"Informe seu nome:","Pergunta",JOptionPane.QUESTION_MESSAGE);
        while (!(nome.equalsIgnoreCase("x"))){

            idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe sua idade","Pergunta",JOptionPane.QUESTION_MESSAGE));
            sexo = JOptionPane.showOptionDialog(null,
                    "Informe seu sexo:",
                    "Pergunta",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,botGen,botGen[0]);
            pts = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a quantidade de pontos","Pergunta",JOptionPane.QUESTION_MESSAGE));
            mlt = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o valor da multa","Pergunta",JOptionPane.QUESTION_MESSAGE));

            i++; // Var para definir a primeira ocorrencia dentro do próximo if

            // Atribuição da pessoa mais velha
            if (i == 1 || maisVelho < idade){
                maisVelho = idade;
                maisVelhoStr = nome;
            }

            // Calculos média idade
            contIdade++;
            somaIdade += idade;
            mediaIdade = somaIdade/contIdade;

            somaMlt += mlt;

            if (sexo == 1){ // Testa se o gênero selecionado é "Homem"
                contH++;
            }else if (pts >= 7){ // Se o gênero não for "Homem", será "Mulher", então testa se teve 7 pontos na carteira
                qntM7pts++;
            }

            nome = JOptionPane.showInputDialog(null,"Informe seu nome:","Pergunta",JOptionPane.QUESTION_MESSAGE);
        }

        percHmtds = (double) (contH * 100) / i; // Calcula porcentagem de homens que foram multados

        JOptionPane.showMessageDialog(null,"Idade média dos condutores:"+mediaIdade+
                "\nValor total das multas aplicadas: "+somaMlt+
                "\nPercentual de homens multados: "+percHmtds+
                "\nQuantidade de Mulheres que perderam 7 pontos na carteira: "+qntM7pts+
                "\n\nPessoa mais velha:\nNome: "+maisVelhoStr+"\nIdade: "+maisVelho,"Resposta",JOptionPane.INFORMATION_MESSAGE);


    }
}