package Etapa2.C11;

import javax.swing.*;

public class C11EX06 {
  public static void main(String[] args) {

    /*
     Pesquisa sobre canais de televisão e seus viewers
     Autor: Enzo Rocha Leite Diniz Ribas
    */

    int i, nCanal, nViewers, nVi4 = 0, nVi7 = 0,nVi12 = 0, maisAss = Integer.MIN_VALUE ,nToViewers = 0, cMaisAss = 0;
    double por4, por7, por12, media;

    for ( i = 1; i <= 78; i++){

      nCanal = Integer.parseInt(JOptionPane.showInputDialog(null,
              "Informe o número do canal assistido: ","Pergunta",JOptionPane.QUESTION_MESSAGE));

      nViewers = Integer.parseInt(JOptionPane.showInputDialog(null,
              "Informe o número de pessoas assistido: ","Pergunta",JOptionPane.QUESTION_MESSAGE));

      switch (nCanal){
        case 4 -> nVi4 += nViewers;
        case 7 -> nVi7 += nViewers;
        case 12 -> nVi12 += nViewers;
      }

      nToViewers += nViewers;

      // atribuir o canal com maior número de viewers
      if (nViewers > maisAss){

        maisAss = nViewers;
        cMaisAss = nCanal;

      }
    }

    // calcular porcentagem de viwers por canal
    por4 = (double) (nVi4 * 100) / nToViewers;
    por7 = (double) (nVi7 * 100) / nToViewers;
    por12 = (double) (nVi12 * 100) / nToViewers;


    media = (double) nToViewers / i;

    JOptionPane.showMessageDialog(null,"Audiência de cada canal:"+
            "\n Canal 4: "+nVi4+
            "\n Canal 7: "+nVi7+
            "\n Canal 12: "+nVi12,"Resposta",JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null,"Porcentagem de audiência por canal:"+
            "\n Canal 4: "+por4+
            "\n Canal 7: "+por7+
            "\n Canal 12: "+por12,"Resposta",JOptionPane.INFORMATION_MESSAGE);

    JOptionPane.showMessageDialog(null,"Canal mais assitido: "+cMaisAss);
    JOptionPane.showMessageDialog(null,"Média de pessoas que estavam assistindo TV: "+media);
  }

}
