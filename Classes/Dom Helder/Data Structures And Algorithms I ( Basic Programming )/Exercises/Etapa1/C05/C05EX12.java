package Etapa1.C05;

import java.util.Scanner;

public class C05EX12 {
    // Calcular HORAS MINUTOS E SEGUNDOS com input em Segundos
    // Enzo Rocha Leite Diniz Ribas
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o tempo em segundos: ");
        int tempoSeg = teclado.nextInt();
        int tempoHr, tempoHrResto, tempoMin, tempoSegundos;
        tempoHr = tempoSeg / 3600;
        tempoHrResto = tempoSeg % 3600;
        tempoMin = tempoHrResto / 60;
        tempoSegundos = tempoHrResto % 60;
        System.out.printf("Tempo Informado: %d\nHoras: %d\nMinutos: %d\nSegundos: %d", tempoSeg, tempoHr, tempoMin, tempoSegundos);
    }
}
