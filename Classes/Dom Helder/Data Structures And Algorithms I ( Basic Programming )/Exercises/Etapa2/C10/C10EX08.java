package Etapa2.C10;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C10EX08 {
    public static void main(String[] args) {

        // Fazer uma planilha analisando dados demográficos do IBGE
        // Autor: Enzo Rocha Leite Diniz Ribas

        String nomeCid, hoMuMaior, menPopStr = null;
        int cont = 0, pop, qntH, qntM, qntEleitor, qntEleitorTot = 0, qntCidades = 0, popTotal = 0, qntCidMaisM = 0, qntHTotal = 0, menPop = 0;


        File file = new File("src/Etapa2/C10/c10ex08.txt");
        Scanner arquivo;

        try{
            arquivo = new Scanner(file);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,"ARQUIVO NÃO ENCONTRADO!!!","ERRO!",JOptionPane.WARNING_MESSAGE);
            throw new RuntimeException(e);
        }

        do {


            cont++;
            nomeCid = arquivo.nextLine();
            pop = Integer.parseInt(arquivo.nextLine());
            qntEleitor = Integer.parseInt(arquivo.nextLine());
            qntH = Integer.parseInt(arquivo.nextLine());
            qntM = Integer.parseInt(arquivo.nextLine());


            qntCidades++;
            popTotal += pop;
            qntHTotal += qntH;
            qntEleitorTot += qntEleitor;

            if (qntM > qntH){
                qntCidMaisM++;
            }

            if (    ( qntH + qntM ) == pop){
                hoMuMaior = "NÃO";
            }else {
                hoMuMaior = "SIM";
            }

            if ((cont == 1) || menPop > pop){
                menPop = pop;
                menPopStr = nomeCid;
            }

            JOptionPane.showMessageDialog(null,"NA CIDADE: '"+nomeCid+"' A SOMA DOS HOMENS E MULHERES É DIFERENTE DA POPULAÇÃO? \n"+hoMuMaior);

        } while (!(nomeCid.equalsIgnoreCase("Zimbabue de Minas")));

        JOptionPane.showMessageDialog(null,"QUANTIDADE DE CIDADES DO ESTADO DE MINAS GERAIS: "+qntCidades+
                "\nPOPULAÇÃO TOTAL DO ESTADO DE MINAS GERAIS: "+popTotal+
                "\nPERCENTUAL DE ELEITORES DO ESTADO DE MINAS GERAIS: "+( ( (qntEleitorTot  * 100 ) / popTotal ))+"%"+
                "\nQUANTIDADE DE CIDADES CUJA POPULAÇÃO TEM MAIS MULHERES DO QUE HOMENS: "+qntCidMaisM+
                "\nMÉDIA DE HOMENS NO ESTADO DE MINAS GERAIS: "+ (qntHTotal/cont)+
                "\nCIDADE COM A MENOR POPULAÇÃO DE ESTADO DE MINAS GERAIS: "+ menPopStr);
    }
}
