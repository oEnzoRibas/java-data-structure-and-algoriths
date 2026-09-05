package Etapa1.C05;

import java.util.Scanner;

public class C05EX06 {
    public static void main(String[] args) {
        // Calcular distância entre o ponto P e uma reta R
        // Enzo Rocha Leite Diniz Ribas
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int a = teclado.nextInt();
        System.out.println("Digite o valor de B: ");
        int b = teclado.nextInt();
        System.out.println("Digite o valor de C: ");
        int c = teclado.nextInt();
        System.out.println("Digite o valor da coordenada X: ");
        int x = teclado.nextInt();
        System.out.println("Digite o valor da coordenada Y: ");
        int y = teclado.nextInt();
        double R = ((a*x)+(b*y)+c);
        double distancia = ((R)/Math.pow((Math.pow(a,2)+(Math.pow(b,2))),1.0/2));
        System.out.println("A distancia entre o ponto P e a Reta é de "+distancia+" unidades");
    }
}
