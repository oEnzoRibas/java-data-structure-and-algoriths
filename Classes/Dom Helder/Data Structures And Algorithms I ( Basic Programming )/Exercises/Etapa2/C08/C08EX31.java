package Etapa2.C08;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class C08EX31 {
    public static void main(String[] args) {

        // Ler arquivo txt sobre salários de engenheiros
        // Autor: Enzo Rocha Leite Diniz Ribas
        File file = new File("src/Etapa2/C08/C308EX31.txt");

        String nome, cargo,cargoMenSal = null, nomeMenSal = null, descricaoCargo = null, descricaoCargoMenSal = null;
        int rep, contEngSalAcima = 0, contSalAdm = 0, contEngOut5k = 0;
        double salario, salarioMin = 0,somaAdm = 0, medSalAdm, menSal = 0;
        Scanner arquivo = null;

        try{
            arquivo = new Scanner(file);
        }catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "\nArquivo não encontrado: " + e.getMessage() );
        return;
        }
            rep = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o número de pessoas que serão lidas: "));

            for (int i = 1; i <= rep; i++) {

              //assert arquivo != null;
              nome = arquivo.nextLine();

                cargo = arquivo.nextLine();

                salario = Double.parseDouble(arquivo.nextLine().replace(',', '.'));

                switch (cargo){

                    case "C" -> {
                        salarioMin = 2500;
                        descricaoCargo = "Engenheiro Calculista";
                    }
                    case "P" -> {
                        salarioMin = 4600;
                        descricaoCargo = "Engenheiro Projetista";
                    }
                    case "O" -> {
                        salarioMin = 3200;
                        descricaoCargo = "Engenheiro de Obra";
                    }
                    case "A" -> {
                        salarioMin = 5100;
                        somaAdm += salario;
                        contSalAdm++;
                        descricaoCargo = "Engenheiro Administrador";
                    }
                }

                if (!(salario >= salarioMin) && !(cargo.equalsIgnoreCase("X")) ){
                    JOptionPane.showMessageDialog(null,"ENGENHEIRO(A): "+nome+" ABAIXO DO SALÁRIO MÍNIMO");
                }else if(!(cargo.equalsIgnoreCase("X"))){
                    contEngSalAcima++;
                }

                if (cargo.equalsIgnoreCase("X") && salario > 5000){
                    contEngOut5k++;
                }

                if ((i == 1) || menSal > salario){
                    menSal = salario;
                    nomeMenSal = nome;
                    cargoMenSal = cargo;
                    descricaoCargoMenSal = descricaoCargo;
                    if (cargo.equalsIgnoreCase("X")){
                        cargoMenSal = "Outros";
                        descricaoCargoMenSal = cargoMenSal;
                    }
                }

            }

            JOptionPane.showMessageDialog(null,"QUANTIDADE DE ENGENHEIROS CUJO SALÁRIO ESTÁ IGUAL OU ACIMA DO SÁLARIO MÍNIMO: "+contEngSalAcima);

            medSalAdm = somaAdm/contSalAdm;
            JOptionPane.showMessageDialog(null,"MÉDIA DOS SALÁRIOS DOS ENGENHEIROS NO CARGO ADMINISTRADOR : R$"+medSalAdm);

            JOptionPane.showMessageDialog(null,"Quantidade de engenheiros de cargo OUTROS que recebem acima de R$5000: "+contEngOut5k);

            JOptionPane.showMessageDialog(null,"O ENGENHEIRO(A) " + nomeMenSal + "\n CARGO: "+cargoMenSal+" -- "+descricaoCargoMenSal+"\n É O COM MENOR SALÁRIO, NO VALOR DE R$"+menSal);

        

    }
}
