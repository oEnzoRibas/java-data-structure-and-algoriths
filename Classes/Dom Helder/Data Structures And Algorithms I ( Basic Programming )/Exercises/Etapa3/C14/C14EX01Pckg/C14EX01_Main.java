package C14EX01Pckg;

import java.util.Scanner;

public class C14EX01_Main {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        /*
        Sistema de Classes com Menu em POO
        Autor: Enzo Rocha Leite Diniz Ribas
         */


        int opcao = 0;

            System.out.println("""
                    Selecione a opção desejada:
                    1 - Calcular Fatorial
                    2 - Calcular Distância entre dois pontos
                    3 - Calcula Hipotenusa
                    4 - Calcula Idade
                    5 - Calculadora da Esfera 
                    """);
            opcao = teclado.nextInt();


        switch (opcao){
            case 1 -> {

                System.out.println("Informe o número que você deseja calcular o Fatorial: ");
                int numFat = teclado.nextInt();
                System.out.println(C14EX01_CalculaFatorial.Fatorial(numFat));

            }
            case 2 -> {

                System.out.println("Infomre o X do ponto 1:");
                int x1 = teclado.nextInt();
                System.out.println("Infomre o X do ponto 2:");
                int x2 = teclado.nextInt();
                System.out.println("Infomre o X do ponto 1:");
                int y1 = teclado.nextInt();
                System.out.println("Infomre o Y do ponto 2:");
                int y2 = teclado.nextInt();

                C14EX01_CalculaDistancia2Pontos.DistXY(x1,y1,x2,y2);

            }
            case 3 -> {
                System.out.println("Informe o valor do cateto 1:");
                double cat1 = teclado.nextDouble();
                System.out.println("Informe o valor do cateto 2:");
                double cat2 = teclado.nextDouble();
                System.out.println(C14EX01_CalculaHipotenusa.hip(cat1,cat2));
            }
            case 4 -> {
                System.out.println("Informe o ano de Nascimento: ");
                int anoNasc = teclado.nextInt();
                System.out.println("Informe o ano Atual: ");
                int anoAtual = teclado.nextInt();
                System.out.println(C14EX01_CalcularIdade.idade(anoNasc,anoAtual));
            }
            case 5 -> {
                System.out.println("""
                        Calculadora da Esfera
                                                
                        Selecione o que você gostaria de calcular:
                                                
                        Volume da Esfera - 1
                        Área da Esfera - 2
                                                
                        """);
                int resp = teclado.nextInt();

                System.out.println("Informe o valor do Raio");
                double raio = teclado.nextDouble();

                switch (resp) {
                    case 1 -> {
                        System.out.println("Volume: "+ C14EX01_CalcularEsfera.volume(raio));
                    }
                    case 2 ->{
                        System.out.println("Área: "+ C14EX01_CalcularEsfera.area(raio));
                    }
                }
            }
        }

    }
}