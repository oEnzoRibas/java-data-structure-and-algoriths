package Etapa1.C05;

import java.util.Scanner;

public class C05EX05 {
    public static void main(String[] args) {
        // Calcular a conversão de temperaturas
        // Autor: Enzo Rocha Leite Diniz Ribas
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        long Fahrenheit, tempCelsius = teclado.nextLong(),Kelvin = (tempCelsius-273);
        Fahrenheit = (((tempCelsius*9)+160)/5);
        System.out.println("Temperatura em Fahrenheit = "+Fahrenheit+"\nTemperatura em Kelvin = "+Kelvin);
    }
}
