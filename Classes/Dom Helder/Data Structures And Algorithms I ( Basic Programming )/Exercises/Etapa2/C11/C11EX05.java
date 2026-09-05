package Etapa2.C11;

import javax.swing.*;

public class C11EX05 {
  public static void main(String[] args) {

    /*
     Análise de alunos de uma escola de Linguas
     Autor: Enzo Rocha Leite Diniz Ribas
    */

      String nome;
    int qntAluIng = 0, cod, cont = 0;
    double vlrmen, vlrToIng = 0, vlrToEsp = 0, vlrToFra = 0, soma = 0, media = 0;

    nome = JOptionPane.showInputDialog(null,"Informe seu nome: ",
            "Pergunta",JOptionPane.QUESTION_MESSAGE);

    while (!(nome.equalsIgnoreCase("fim"))){

      cod = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe seu código: ","Pergunta",JOptionPane.QUESTION_MESSAGE));

      switch (cod){
        case 1 -> {
          vlrmen = 100;
          qntAluIng++;
          vlrToIng += vlrmen;
        }
        case 2 -> {
          vlrmen = 150;
          vlrToFra += vlrmen;
        }
        case 3 -> {
          vlrmen = 120;
          vlrToEsp += vlrmen;
        }
        default -> {
          JOptionPane.showMessageDialog(null,"Informe um código válido!","ERRO!",JOptionPane.WARNING_MESSAGE);
          return;
        }
      }

      cont++;
      soma += vlrmen;
      media = soma/cont;

      JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nValor da Mensalidade: "+vlrmen,
              "Resposta",JOptionPane.INFORMATION_MESSAGE);

      nome = JOptionPane.showInputDialog(null,"Informe seu nome: ",
              "Pergunta",JOptionPane.QUESTION_MESSAGE);
    }

    JOptionPane.showMessageDialog(null,"Quantidade de alunos matriculas nas turmas de Inglês: "+qntAluIng,
            "Resposta",JOptionPane.INFORMATION_MESSAGE);

    JOptionPane.showMessageDialog(null,"Mensalidade média da escola: "+media,
            "Resposta",JOptionPane.INFORMATION_MESSAGE);

    JOptionPane.showMessageDialog(null,"Valor total por mensalidade: "+
            "\nInglês: "+vlrToIng+
            "\nFrancês: "+vlrToFra+
            "\nEspanhol: "+vlrToEsp,
            "Resposta",JOptionPane.INFORMATION_MESSAGE);
  }
}
