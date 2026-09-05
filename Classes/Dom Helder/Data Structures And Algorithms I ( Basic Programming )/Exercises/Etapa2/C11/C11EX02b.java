package Etapa2.C11;

import javax.swing.*;

public class C11EX02b {
    public static void main(String[] args) {

        // Calcular classificação de clientes de uma financeira com número de repetições indefinido e flag real
        // Autor: Enzo Rocha Leite Diniz Ribas

        String clas, nome, nomeMnrApl = null;
        double vlrApl, somaVlrAplBro = 0, vlmTotalApl = 0, mnrApl = 0, mediaBro;
        int qntCliPra = 0, qntCliOur = 0, qntCliBro = 0, i = 1;

        do{

            nome = JOptionPane.showInputDialog(null,
                    "Informe seu NOME: ","Pergunta",JOptionPane.QUESTION_MESSAGE);
            vlrApl = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Informe o VALOR APLICADO: ","Pergunta",JOptionPane.QUESTION_MESSAGE));

            // Atribuição das classes ao cliente
            if (vlrApl <= 1000){
                clas = "Bronze";
                qntCliBro++;
                somaVlrAplBro += vlrApl;
            } else if (vlrApl > 1000 && vlrApl <= 5000) {
                clas = "Prata";
                qntCliPra++;
            } else {
                clas = "Ouro";
                qntCliOur++;
            }

            vlmTotalApl += vlrApl;
            mediaBro = somaVlrAplBro / qntCliBro;

            //Calculo da menor aplicação, ocorrendo apenas quando o valor atual for menor ou for a primeira repetição
            if ( i == 1 || mnrApl > vlrApl ){
                mnrApl = vlrApl;
                nomeMnrApl = nome;
            }

            //Comando para impedir que a variável i some mais de uma vez, por não ser necessário.
            if (i == 1){
                i++;
            }

            JOptionPane.showMessageDialog(null,
                    "Nome: "+nome+"\nClassificação: "+clas);
        }while (!(nome.equalsIgnoreCase("Reynaldo Duarte")) );

        JOptionPane.showMessageDialog(null,
                "Quantidade de clientes Classificação: Bronze: "+qntCliBro+
                        "\nQuantidade de clientes Classificação: Prata: "+qntCliPra+
                        "\nQuantidade de clientes Classificação: Ouro: "+qntCliOur,"Ficha",JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,
                "Média dos valores Aplicados em Bronze: "+mediaBro,"Ficha",JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,
                "Volume total de aplicações: "+vlmTotalApl,"Ficha",JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,
                "Cliente com a menor aplicação: "+nomeMnrApl,"Ficha",JOptionPane.INFORMATION_MESSAGE);

    }
}
