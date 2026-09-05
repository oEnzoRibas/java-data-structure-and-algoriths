package Etapa1.C05;

import java.util.Scanner;
// Calcular Área e Volume da esfera
// Autor: Enzo Rocha Leite Diniz Ribas
public class C05EX02 {
    public static void main(String[] args) {
        String raioStr;
        double volume, area;
        int raio;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe o Valor do Raio : ");
        raioStr = teclado.nextLine();
        raio = Integer.valueOf(raioStr);
        volume = ((Math.PI*(Math.pow(raio,3)))*(4/3.0));
        area = ((Math.PI*(Math.pow(raio,3)))*4);
        System.out.println("Área = "+area+"\nVolume: "+volume);
    }
}
