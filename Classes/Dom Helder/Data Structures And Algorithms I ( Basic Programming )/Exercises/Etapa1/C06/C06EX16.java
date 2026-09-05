package Etapa1.C06;

import javax.swing.*;
import java.util.Scanner;

public class C06EX16 {
    public static void main(String[] args) {
        //Calcular Boletim de uma escola
        //Autor: Enzo Rocha Leite Diniz Ribas

        int falta, idade, peso1, peso2;
        double notaPrv1, notaPrv2, notaPrv3, notaTrabFi, notaFin, maiorNota, segMaiorNota;


        //Leitura dos dados do usuário
        idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe Sua Idade: ", "Pergunta: ",JOptionPane.QUESTION_MESSAGE));
        falta = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a quantidade de faltas que você possui : ", "Pergunta: ",JOptionPane.QUESTION_MESSAGE));
        notaPrv1 = Double.parseDouble((JOptionPane.showInputDialog(null,"Informe Sua Nota da Prova 1 : ", "Pergunta: ",JOptionPane.QUESTION_MESSAGE)));
        notaPrv2 = Double.parseDouble((JOptionPane.showInputDialog(null,"Informe Sua Nota da Prova 2 : ", "Pergunta: ",JOptionPane.QUESTION_MESSAGE)));
        notaPrv3 = Double.parseDouble((JOptionPane.showInputDialog(null,"Informe Sua Nota da Prova 3 : ", "Pergunta: ",JOptionPane.QUESTION_MESSAGE)));
        notaTrabFi = Double.parseDouble((JOptionPane.showInputDialog(null,"Informe Sua Nota do Trabalho Final : ", "Pergunta: ",JOptionPane.QUESTION_MESSAGE)));

        //Calcular o peso 1
        if (falta <= 5){
            peso1 = 3;
        } else if (falta <= 10){
            peso1 = 2;
        } else {
            peso1 = 1;
        }

        //Calcular peso 2
        if (idade <= 17){
            peso2 = 1;
        } else if (idade <= 50){
            peso2 = 2;
        } else {
            peso2 = 3;
        }


        //Calcular quais são as duas maiores notas
        if (notaPrv1 >= notaPrv2 && notaPrv1 >= notaPrv3) {
            maiorNota = notaPrv1;
            segMaiorNota = Math.max(notaPrv2, notaPrv3);
        } else if (notaPrv2 >= notaPrv1 && notaPrv2 >= notaPrv3) {
            maiorNota = notaPrv2;
            segMaiorNota = Math.max(notaPrv1, notaPrv3);
        } else {
            maiorNota = notaPrv3;
            segMaiorNota = Math.max(notaPrv1, notaPrv2);
        }

        notaFin = (((maiorNota + segMaiorNota) / 2) * peso1) + (notaTrabFi * peso2);

        // Calcular resultado final
        if (notaFin <= 50){
            JOptionPane.showMessageDialog(null,"REPROVADO","Resultado Final", JOptionPane.INFORMATION_MESSAGE);
        } else if (notaFin > 50 && notaFin <= 70){
            JOptionPane.showMessageDialog(null,"REGULAR","Resultado Final", JOptionPane.INFORMATION_MESSAGE);
        } else if (notaFin > 70 && notaFin <= 80){
            JOptionPane.showMessageDialog(null,"BOM","Resultado Final", JOptionPane.INFORMATION_MESSAGE);
        } else if (notaFin > 80 && notaFin <= 90){
            JOptionPane.showMessageDialog(null,"MUITO BOM","Resultado Final", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"EXCENLENTE","Resultado Final", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }