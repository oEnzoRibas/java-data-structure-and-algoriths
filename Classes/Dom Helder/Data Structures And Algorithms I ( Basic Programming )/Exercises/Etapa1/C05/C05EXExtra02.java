package Etapa1.C05;

import java.util.Scanner;

public class C05EXExtra02 {
    public static void main(String[] args) {
        //Calcular Tempo Relativo
        //Autor: Enzo Rocha Leite Diniz Ribas

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor do tempo em segundos: ");
        double tempo = teclado.nextDouble();
        System.out.println("Informe o valor da velocidade em m/s: ");
        double velocidade = teclado.nextDouble();
        double tempoRelativo, velocidadeLuz = Math.pow(10,8)*3;
        tempoRelativo = tempo/Math.sqrt(1-(Math.pow(velocidade,2)/(Math.pow(velocidadeLuz,2))));
        System.out.println("Tempo relativo = "+tempoRelativo);
    }
}
