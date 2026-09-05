package Etapa2.C11;

import java.util.Scanner;

public class C11EX07 {
    public static void main(String[] args) {

        /*
        Análise de uma planilha de registros de temperaturas
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        double temp, mnrTemp = Integer.MAX_VALUE, maiorTemp = Integer.MIN_VALUE, mediaTemp, somaTemps = 0;
        int i, diasMaiorTemp = 1;

        Scanner teclado = new Scanner(System.in);

        for ( i = 1; i <= 10; i++){

            System.out.println("Informe a temperatura do dia: "+i);
            temp = teclado.nextDouble();


            //Definir menor e maior temperatura
            if (mnrTemp > temp){
                mnrTemp = temp;
            }

            if (maiorTemp < temp){
                maiorTemp = temp;
                diasMaiorTemp = 1;
            }else if (maiorTemp == temp){
                diasMaiorTemp++;
            }

            somaTemps += temp;
        }
        mediaTemp = somaTemps / i;

        System.out.println("Menor temperatura registrada: "+mnrTemp);
        System.out.println("Maior temperatura registrada: "+maiorTemp);
        System.out.println("Média das temperaturas registradas: "+mediaTemp);
        System.out.println("Quantidade de dias que ocorreu a maior temperatura: "+diasMaiorTemp);
    }
}
