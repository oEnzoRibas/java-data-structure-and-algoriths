package Etapa2.C08;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class C08EX21 {
    public static void main(String[] args) {

        // Fazer uma tabela com o IMC de uma pessoa
        // Autor: Enzo Rocha Leite Diniz Ribas

        Scanner teclado = new Scanner(System.in);

        double altura, imc;
        String sit;

        System.out.println("Informe sua altura: ");
        altura = teclado.nextDouble();

        System.out.println(" PESO         IMC              SITUAÇÃO CORPÓREA");

        for (int peso = 60; peso <= 100; peso++){

            imc = peso/Math.pow(altura,2);

            if (imc < 20){
                sit = "Abaixo do Peso";
            }else if (imc >= 20 && imc <= 25){
                sit = "Peso Ideal";
            } else {
                sit = "Acima do Peso";
            }

            System.out.printf("""
                    %d           %f               %s
                    """,peso,imc,sit);

        }

    }
}
