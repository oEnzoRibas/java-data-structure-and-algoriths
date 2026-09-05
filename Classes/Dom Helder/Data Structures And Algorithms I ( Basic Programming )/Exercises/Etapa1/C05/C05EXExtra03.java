package Etapa1.C05;

import javax.swing.*;
import java.util.Scanner;

public class C05EXExtra03 {
    public static void main(String[] args) {


        //Calcular a produção de mudas de uma fazenda de eucaliptos
        //Autor: Enzo Rocha Leite Diniz Ribas

        //Cada CxPapelao comporta   7un de mudas
        //Cada CxMadeira comporta   15un de CxPapelao
        //Cada Caminhao  comporta   50un de CxMadeira


        int restoMudas, perdaMudas, qntMudasTotal, qntMudasLiq;
        int qntCxPapelao, qntCxMadeira, restoCxMadeira, qntCaminhao, restoCaminhao;


        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade de mudas que foram produzidas: ");
        if (!teclado.hasNextInt()) {
            System.out.println("O valor inserido é inválido. Insira um número inteiro.");
        }
        qntMudasTotal = teclado.nextInt();

        System.out.println("Informe a quantidade de mudas que foram perdidas: ");
        if (!teclado.hasNextInt()) {
            System.out.println("O valor inserido é inválido. Insira um número inteiro.");
        }
        perdaMudas = teclado.nextInt();

        qntMudasLiq = qntMudasTotal-perdaMudas;

        restoMudas = qntMudasLiq%7;
        qntCxPapelao = qntMudasLiq/7;
        qntCxMadeira = qntCxPapelao/15;
        restoCxMadeira = qntCxPapelao%15;
        if (restoCxMadeira >= 1){
            qntCxMadeira++;
        }
        qntCaminhao = qntCxMadeira/50;
        restoCaminhao = qntCxMadeira%50;
        if (restoCaminhao >=1){
            qntCaminhao++;
        }

        double precoCxPapelao, precoCxMadeira, precoFreteCaminhao, custoCxPapelao, custoCxMadeira, custoFreteCaminhao, custoTotal;

        System.out.println("Informe o custo unitário da Caixa de Papelão: ");
        precoCxPapelao = teclado.nextDouble();

        System.out.println("Informe o custo unitário da Caixa de Madeira: ");
        precoCxMadeira = teclado.nextDouble();

        System.out.println("Informe o custo do frete de cada Caminhão: ");
        precoFreteCaminhao = teclado.nextDouble();

        custoCxPapelao = qntCxPapelao * precoCxPapelao;
        custoCxMadeira = qntCxMadeira * precoCxMadeira;
        custoFreteCaminhao = qntCaminhao * precoFreteCaminhao;

        custoTotal = custoCxPapelao+custoCxMadeira+custoFreteCaminhao;

        String precoCxPapelaoFormat = String.format("%.2f", precoCxPapelao);
        String custoCxPapelaoFormat = String.format("%.2f", custoCxPapelao);
        String precoCxMadeiraFormat = String.format("%.2f", precoCxMadeira);
        String custoCxMadeiraFormat = String.format("%.2f", custoCxMadeira);
        String precoFreteCaminhaoFormat = String.format("%.2f", precoFreteCaminhao);
        String custoFreteCaminhaoFormat = String.format("%.2f", custoFreteCaminhao);
        String custoTotalFormat = String.format("%.2f", custoTotal);

        JOptionPane.showMessageDialog(null,
                "\nQuantidade de mudas produzidas: "+qntMudasTotal+
                        "\nQuantidade de mudas perdidas: "+perdaMudas+
                        "\nQuantidade de mudas aproveitadas: "+qntMudasLiq+
                        "\nQuantidade de mudas que sobraram: "+restoMudas+
                        "\n\nCustos:\n"+
                        "Item\t\t Qnt x Valor \t\t Total"+
                        "\nCaixas De Papelão:\t\t "+qntCxPapelao+" x "+precoCxPapelaoFormat+"\t\t R$"+custoCxPapelaoFormat+
                        "\nCaixas De Madeira:\t\t "+qntCxMadeira+" x "+precoCxMadeiraFormat+"\t\t R$"+custoCxMadeiraFormat+
                        "\nFrete do Caminhão:\t\t "+qntCaminhao+" x "+precoFreteCaminhaoFormat+"\t\t R$"+custoFreteCaminhaoFormat+
                        "\nCusto Total:\t\t R$"+custoTotalFormat,
                "Ficha de Custos",
                JOptionPane.INFORMATION_MESSAGE);

        System.out.println("\nQuantidade de mudas produzidas: "+qntMudasTotal+
        "\nQuantidade de mudas perdidas: "+perdaMudas+
                "\nQuantidade de mudas aproveitadas: "+qntMudasLiq+
                "\nQuantidade de mudas que sobraram: "+restoMudas+
                "\n\nCustos:\n"+
                "Item\t\t Qnt x Valor \t\tTotal"+
                "\nCaixas De Papelão:\t\t"+qntCxPapelao+"x"+precoCxPapelaoFormat+"\t\tR$"+custoCxPapelaoFormat+
                "\nCaixas De Madeira:\t\t"+qntCxMadeira+"x"+precoCxMadeiraFormat+"\t\tR$"+custoCxMadeiraFormat+
                "\nFrete do Caminhão:\t\t"+qntCaminhao+"x"+precoFreteCaminhaoFormat+"\t\tR$"+custoFreteCaminhaoFormat+
                "\n\nCusto Total:\t\tR$"+custoTotalFormat);

        teclado.close();
        }
}
