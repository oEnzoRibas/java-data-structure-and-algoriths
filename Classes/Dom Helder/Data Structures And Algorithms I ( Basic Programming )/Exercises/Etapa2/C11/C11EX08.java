package Etapa2.C11;

import java.util.Scanner;

public class C11EX08 {
    public static void main(String[] args) {

        /*
        Calcular Folha de Pagamento de uma empresa
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        double qtdHrs = 0, vlrHr, pgmnt, premio, media, maiorSal = Integer.MIN_VALUE, vlrTotalFolha = 0;
        String nome, funcao, nomeMaiorSal = null, funcaoMaiorSal = null;
        int qntFun = 0, qntPremio1 = 0, qntPremio2 = 0, qntPremio3 = 0;


        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor da hora trabalhada: ");
        vlrHr = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("Para finalizar o programa informe: 'ZZZ' ");
        System.out.println("\nInforme seu nome: ");
        nome = teclado.nextLine();

        while (!nome.equalsIgnoreCase("zzz")){
            qntFun++;

            System.out.println("Informe sua função: ");
            funcao = teclado.nextLine();

            System.out.println("Informe a quantidade de horas trabalhadas: ");
            qtdHrs = teclado.nextDouble();
            teclado.nextLine();

            //Validação do valor informado nas horas trabalhadas
            while(qtdHrs < 0) {


                System.out.println("\nInforme um valor válido para a quantidade de horas");

                System.out.println("Informe a quantidade de horas trabalhadas: ");
                qtdHrs = teclado.nextDouble();
                teclado.nextLine();
            }

            // Atribuição do valor do prêmio
            if (qtdHrs <= 100){
                premio = 1000;
                qntPremio1++;
            } else if (qtdHrs < 500){
                premio = (10 * qtdHrs);
                qntPremio2++;
            } else {
                premio = 100 * (int) (qtdHrs / 10);
                qntPremio3++;
            }

            pgmnt = (qtdHrs*vlrHr) + premio;

            System.out.printf("""
                    Funcionario: %s
                    Horas Trabalhadas: %f
                    Prêmio: %f
                    Total a receber: %f""",nome,qtdHrs,premio,pgmnt);

            // Atribuição do menor salário
            if (maiorSal < pgmnt){
                maiorSal = pgmnt;
                nomeMaiorSal = nome;
                funcaoMaiorSal = funcao;
            }

            vlrTotalFolha += pgmnt;

            //Pergunta o nome novamente, para validar a condição do while
            System.out.println("\n\nInforme seu nome: ");
            nome = teclado.nextLine();

        }

        media = qtdHrs / qntFun;

        System.out.printf("""
                Média de horas trabalhada por pessoa: %f
                Pessoa com maior salário: %s - Função: %s
                
                Quantidade de pessoas por faixa do prêmio de produtividade:
                Até 100: %d
                Acima de 100 e até 500: %d
                Acima de 500: %d
                Valor total da folha de pagamento: %f""",media,nomeMaiorSal,funcaoMaiorSal,qntPremio1,qntPremio2,qntPremio3,vlrTotalFolha);

        System.out.println("\n\nPrograma finalizado");
    }
}

