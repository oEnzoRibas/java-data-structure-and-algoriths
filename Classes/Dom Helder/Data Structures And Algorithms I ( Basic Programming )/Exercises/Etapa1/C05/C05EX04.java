package Etapa1.C05;

import java.util.Scanner;
// Calcular distancias entre dois pontos no plano cartesiano
// Autor: Enzo Rocha Leite Diniz Ribas

public class C05EX04 {
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a coordenada X do Ponto 1: ");
        x1 = teclado.nextInt();
        System.out.println("Informe a coordenada Y do Ponto 1: ");
        y1 = teclado.nextInt();
        System.out.println("Informe a coordenada X do Ponto 2: ");
        x2 = teclado.nextInt();
        System.out.println("Informe a coordenada Y do Ponto 2: ");
        y2 = teclado.nextInt();
        double distancia = (Math.pow((Math.pow((x1 - x2), 2) + (Math.pow((y1 - y2), 2))), 1.0 / 2));
        System.out.printf("x1 = %d\nx2 = %d\ny1 = %d\ny2 = %d\n\nO ponto 1 está a uma distancia de "+distancia+" unidade(s) do ponto 2",x1,x2,y1,y2);
    }
}
