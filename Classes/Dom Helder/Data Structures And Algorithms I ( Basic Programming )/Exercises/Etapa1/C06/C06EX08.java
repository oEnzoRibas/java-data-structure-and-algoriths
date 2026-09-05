package Etapa1.C06;

import java.util.Scanner;

public class C06EX08 {
    public static void main(String[] args) {
        // Calcular Peso Max e Min com base na altura para ficar dentro do peso ideal
        // Autor: Enzo Rocha Leite Diniz Ribas
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("Informe sua altura: ");
        double altura = teclado.nextDouble();
        double pesoMax = 25*(Math.pow(altura,2)), pesoMin = 20*(Math.pow(altura,2));

        System.out.println("Nome:"+nome+"\nPeso Min: "+pesoMin+"Peso Max: "+pesoMax);

    }
}
