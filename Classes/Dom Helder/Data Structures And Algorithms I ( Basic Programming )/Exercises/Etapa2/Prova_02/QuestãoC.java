package Etapa2.Prova_02;

import java.util.Scanner;

public class QuestãoC {
  public static void main(String[] args) {

    /*

    Questão C da Segunda Prova de AEDI
    Autor: Enzo Rocha Leite Diniz Ribas

     */
    
    String nome, mnrSalStr = null;
    double mnrSal = Integer.MAX_VALUE, media, somaSlrNovo = 0, competencia, trbEquip, regras, slrAtual, slrNovo, avFinal;
    int qntAnos, contFun = 0, faixa1 = 0, faixa2 = 0, faixa3 = 0, faixa4 = 0, maiorfaixa = 0;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe seu nome: " +
            "");
    nome = teclado.nextLine();
    
    while ((!nome.equalsIgnoreCase("x"))) {
      System.out.println("Informe seu salário atual:");
      slrAtual = teclado.nextDouble();
      teclado.nextLine();
      System.out.println("Informe a quantos anos você trabalha na empresa: ");
      qntAnos = teclado.nextInt();
      teclado.nextLine();
      System.out.println("Informe o resultado da prova de competencia:");
      competencia = teclado.nextDouble();
      System.out.println("Informe o resultado da prova de trabalho em equipe:");
      trbEquip = teclado.nextDouble();
      System.out.println("Informe o resultado da prova cumprimento de regras:");
      regras = teclado.nextDouble();
      teclado.nextLine();

      avFinal = ((competencia*3) + (trbEquip*1) + (regras*2)) / 6;

      if (avFinal <= 50){
        slrNovo = slrAtual;
        faixa1++;

      }else if (avFinal <= 70){
        slrNovo = slrAtual + ( ((double) 5 /100) * slrAtual);
        faixa2++;

      }else if (avFinal <= 90){
        slrNovo = 100 + slrAtual + ( ((double) 10 /100) * slrAtual);
        faixa3++;

      }else {
        slrNovo = (100*qntAnos) + slrAtual + ( ((double) 15 /100) * slrAtual);
        faixa4++;
      }

      if (mnrSal > slrNovo){
        mnrSal = slrNovo;
        mnrSalStr = nome;
      }
      somaSlrNovo += slrNovo;
      contFun++;

      System.out.printf("\nNovo salário do %s : R$%f\n",nome,slrNovo);

      System.out.println("\nInforme seu nome");
      nome = teclado.nextLine();

      if (faixa1 > faixa2 && faixa1 > faixa3 && faixa1 > faixa4){
        maiorfaixa = faixa1;
      } if (faixa2 > faixa1 && faixa2 > faixa3 && faixa2 > faixa4){
        maiorfaixa = faixa2;
      } if (faixa3 > faixa2 && faixa3 > faixa1 && faixa3 > faixa4){
        maiorfaixa = faixa3;
      } if (faixa4 > faixa1 && faixa4 > faixa2 && faixa4 > faixa3){
        maiorfaixa = faixa4;
      }

    }
    
    media = somaSlrNovo/contFun;
    System.out.println("Nova Media salarial dos funcionários: R$"+media);
    System.out.println("Faixa salaria com maior quantidade de reajustes: "+maiorfaixa);
    System.out.println("Funcionario com o menor salário: "+mnrSalStr);

  }
}
