package Etapa2.C11;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C11EX03 {
    public static void main(String[] args) {

    /*
    Relatório de multas do DETRAN
    Autor: Enzo Rocha Leite Diniz Ribas
    */

        String placa;
        int dia, pontos, cont15 = 0;
        double vlrTotMultas = 0, multa = 0;
        Scanner arquivo;

        File file = new File("src/Etapa2/C11/C11EX03.txt");

        try{
            arquivo = new Scanner(file);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,"ARQUIVO NÃO ENCONTRADO","ERRO!!!",JOptionPane.WARNING_MESSAGE);
            throw new RuntimeException(e);
        }

        while(arquivo.hasNextLine()){

            dia = arquivo.nextInt();
            arquivo.nextLine();
            placa = arquivo.nextLine();
            pontos = arquivo.nextInt();
            arquivo.nextLine();


            switch (pontos){
                case 3 ->
                    multa = 42;
                case 5 ->
                    multa = 108;
                case 8 ->
                    multa = 479;
            }

            if (dia <= 15 && pontos == 8){
                cont15++;
            }

            vlrTotMultas += multa;

            JOptionPane.showMessageDialog(null, """
                    PLACA:\s"""+placa+"""
      
                    Valor da Multa:\s""" +multa);

        }
        JOptionPane.showMessageDialog(null,"Quantidade de multas de pontuação 8 na primeira quinzena do mês: "+cont15+
                "\nValor total arrecadado com as multas: "+vlrTotMultas);

    }
}
