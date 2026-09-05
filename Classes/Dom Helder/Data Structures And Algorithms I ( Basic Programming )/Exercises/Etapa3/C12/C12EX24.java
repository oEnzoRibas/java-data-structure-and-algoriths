package Etapa3.C12;

import java.util.Scanner;

public class C12EX24 {
    public static void main(String[] args) {

        /*
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        Scanner teclado = new Scanner(System.in);

        int ptsEqpsTemp;
        String nomeEqpsTemp, nomePsq, pos = null;
        int ptsEqps[] = new int[20];
        String nomeEqps[] = new String[ptsEqps.length];

        for (int i = 0; i < ptsEqps.length; i++) {
            System.out.println("Informe o nome da equipe: ");
            nomeEqps[i] = teclado.nextLine();
            System.out.println("Informe a pontuação da equipe: ");
            ptsEqps[i] = teclado.nextInt();
            teclado.nextLine();
        }

        for (int k = 0; k < ptsEqps.length - 1; k++) {
            for (int i = 0; i < ptsEqps.length - 1; i++) {
                if (ptsEqps[i] < ptsEqps[i + 1]) {

                    ptsEqpsTemp = ptsEqps[i];
                    ptsEqps[i] = ptsEqps[i + 1];
                    ptsEqps[i + 1] = ptsEqpsTemp;

                    nomeEqpsTemp = nomeEqps[i];
                    nomeEqps[i] = nomeEqps[i + 1];
                    nomeEqps[i + 1] = nomeEqpsTemp;
                }
            }
        }
        int found = 0;
        do {

            System.out.println("Informe o nome da equipe a ser pesquisada: ");
            nomePsq = teclado.nextLine();

            for (int i = 0; i < ptsEqps.length; i++) {

                switch (i){
                    case 0,1,2,3 ->{
                        pos = "Copa Libertadores";
                    }
                    case 4,5,6,7,8,9,10,11 ->{
                        pos = "Copa Sul-americana";
                    }
                    case 16,17,18,19 ->{
                        pos = "Rebaixada";
                    }
                }

                if (nomeEqps[i].equalsIgnoreCase(nomePsq)) {
                    System.out.printf("Nome da equipe: %s\nPosição: %d\nSituação: %s", nomeEqps[i], i, pos);
                    found = -1;
                    break;
                } else if (i == nomeEqps.length-1){
                    System.out.println("Equipe não encontrada!!!\n");
                }
            }

        } while (found != -1);
    }
}
