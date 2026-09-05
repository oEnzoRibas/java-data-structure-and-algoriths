package Etapa1.C06;

import java.util.Scanner;

public class C06EX09 {
    public static void main(String[] args) {
        // Calcular Peso ideal com base no sexo;
        // Autor: Enzo Rocha Leite Diniz Ribas
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu Sexo (F - Feminino e M - Masculino): ");
        String f = "f", m = "m", sexo = teclado.nextLine();

        System.out.println("Informe sua altura: ");
        double altura = teclado.nextDouble();

        if (sexo.equalsIgnoreCase(f)){
            double pesoIdeal = 62.1*altura-44.7;
            System.out.printf("Seu sexo é: %s\nPeso Ideal é %1.3f",sexo,pesoIdeal);
        } else if (sexo.equalsIgnoreCase(m)){
            double pesoIdeal = 72.7*altura-58;
            System.out.printf("Seu sexo é: %s\nPeso Ideal é %1.3f",sexo,pesoIdeal);
        }
    }
}
