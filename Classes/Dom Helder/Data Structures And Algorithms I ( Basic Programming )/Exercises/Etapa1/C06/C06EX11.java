package Etapa1.C06;

import java.util.Scanner;

public class C06EX11 {

    // Fazer ficha sobre Jogo de vôlei
    // Autor: Enzo Rocha Leite Diniz Ribas

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o nome da equipe 1: ");
        String equipe1 = teclado.nextLine();
        System.out.println("Informe o nome da equipe 2: ");
        String equipe2 = teclado.nextLine();
        System.out.println("Informe a quantidade de sets ganhos da Equipe 1: ");
        int setsEquip1 = teclado.nextInt();
        System.out.println("Informe a quantidade de sets ganhos da Equipe 2: ");
        int setsEquip2 = teclado.nextInt();
        if (setsEquip1 == 3 && (setsEquip2 == 0 || setsEquip2 == 1)){
            int ptsEquipe1 = 3, ptsEquipe2 = 0;
            System.out.printf("\nEquipe 1: %s\tEquipe 2:%s\nSets Ganhos Equipe 1: %d\nSets Ganhos Equipe 1: %d\nPontos %s = %d\tPontos %s = %d",equipe1,equipe2,setsEquip1,setsEquip2,equipe1,ptsEquipe1,equipe2,ptsEquipe2);
        }else if (setsEquip1 == 3 && setsEquip2 == 2){
            int ptsEquipe1 = 2, ptsEquipe2 = 1;
            System.out.printf("\nEquipe 1: %s\tEquipe 2:%s\nSets Ganhos Equipe 1: %d\nSets Ganhos Equipe 1: %d\nPontos %s = %d\tPontos %s = %d",equipe1,equipe2,setsEquip1,setsEquip2,equipe1,ptsEquipe1,equipe2,ptsEquipe2);
        }else if (setsEquip2 == 3 && (setsEquip1 == 0 || setsEquip1 == 1)){
            int ptsEquipe2 = 3, ptsEquipe1 = 0;
            System.out.printf("\nEquipe 1: %s\tEquipe 2:%s\nSets Ganhos Equipe 1: %d\nSets Ganhos Equipe 1: %d\nPontos %s = %d\tPontos %s = %d",equipe1,equipe2,setsEquip1,setsEquip2,equipe1,ptsEquipe1,equipe2,ptsEquipe2);
        }else if (setsEquip2 == 3 && setsEquip1 == 2){
            int ptsEquipe2 = 2, ptsEquipe1 = 1;
            System.out.printf("\nEquipe 1: %s\tEquipe 2:%s\nSets Ganhos Equipe 1: %d\nSets Ganhos Equipe 1: %d\nPontos %s = %d\tPontos %s = %d",equipe1,equipe2,setsEquip1,setsEquip2,equipe1,ptsEquipe1,equipe2,ptsEquipe2);
        }
}
}
