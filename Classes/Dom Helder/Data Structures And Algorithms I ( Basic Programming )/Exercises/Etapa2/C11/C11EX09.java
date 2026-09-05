package Etapa2.C11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C11EX09 {
    public static void main(String[] args) {

        /*
        Calcular Registro Funcional de uma empresa
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        File file = new File("src/Etapa2/C11/C11EX09.txt");

        Scanner arquivo;

        try{
            arquivo = new Scanner(file);
        }catch (FileNotFoundException e) {
            System.out.println("ARQUIVO NÃO ENCONTRADO!!!");
            throw new RuntimeException(e);
        }

        int RF, seq, seqNovo = Integer.MIN_VALUE, seqVelho = Integer.MAX_VALUE, ano, anoMaisVelho = Integer.MAX_VALUE, anoMaisNovo = Integer.MIN_VALUE, cod, qntSetorG = 0, qntSetorA = 0, qntSetorP = 0, qntSetorO = 0, qntAdm10 = 0, setorMais = Integer.MIN_VALUE;
        String nome, setor = null, setorMaisStr = null, stFun = null, lastFun = null;

        while (arquivo.hasNextLine()){

            nome = arquivo.nextLine();

            RF = arquivo.nextInt();
            if (arquivo.hasNextLine()){
                arquivo.nextLine();
            }

            ano = RF / 10000;
            cod = RF / 1000 % 10;
            seq = RF % 1000;

            if (!(RF <= 99999 || RF > 999999 || (ano < 10 || ano > 14 ) || (cod < 1 || cod > 5)) ){
                switch (cod){
                    case 1 -> {
                        qntSetorG++;
                        setor = "Gerência";
                    }
                    case 2 -> {
                        qntSetorA++;
                        setor = "Administração";
                    }
                    case 3 -> {
                        qntSetorP++;
                        setor = "Pesquisa";
                    }
                    case 4 -> {
                        qntSetorO++;
                        setor = "Obras";
                    }
                }

                if (cod == 2 && ano == 10){
                    qntAdm10++;
                }

                // atribuir primeiro funcionario
                if (anoMaisVelho > ano){
                    anoMaisVelho = ano;


                    if (seqVelho > seq){
                        seqVelho = seq;
                        stFun = nome;
                    }
                }

                // atribuir último funcionario
                if (anoMaisNovo < ano){
                    anoMaisNovo = ano;

                    if (seqNovo < seq){
                        seqNovo = seq;
                        lastFun = nome;
                    }
                }

            }else {
                System.out.printf("\nO REGISTRO %d É INVÁLIDO!\n",RF);

            }


        }


        if (setorMais < qntSetorA){
            setorMais = qntSetorA;
            setorMaisStr = setor;
        }
        if (setorMais < qntSetorG){
            setorMais = qntSetorG;
            setorMaisStr = setor;
        }
        if (setorMais < qntSetorP){
            setorMais = qntSetorP;
            setorMaisStr = setor;
        }
        if (setorMais < qntSetorO){
            setorMaisStr = setor;
        }


        System.out.printf("""
                _____________________________________
                Quantidade de funcionários por setor:
                
                Gêrencia: %d
                Administração: %d
                Pesquisa: %d
                Obras: %d
                
                Quantidade de funcionários da Administração que foram admitidos em 2010: %d
                
                Nome do setor que tem mais funcionarios: %s
                Nome do primeiro funcionário admitido: %s
                Nome do último funcionário admitido: %s""",qntSetorG,qntSetorA,qntSetorP,qntSetorO,qntAdm10,setorMaisStr,stFun,lastFun);

    }
}
