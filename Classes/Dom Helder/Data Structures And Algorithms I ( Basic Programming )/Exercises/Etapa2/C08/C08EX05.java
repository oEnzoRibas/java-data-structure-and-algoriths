package Etapa2.C08;

import java.util.Scanner;

public class C08EX05 {
    public static void main(String[] args) {

        // Fazer Eleição
        // Autor: Enzo Rocha Leite Diniz Ribas


        int contCandidato1 = 0, contCandidato2 = 0, contCandidato3 = 0, n = 100;
        int voto;
        for (int i = 1; i <= n; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("\nCandadito Fulano = 1\n\nCandidato Ciclano = 2\n\n" +
                    "Candidato Beltrano = 3\n\n" +
                    "Digite seu Voto: ");
            voto = teclado.nextInt();
            if (voto == 1) {
                contCandidato1++;
            } else if (voto == 2) {
                contCandidato2++;
            } else if (voto == 3) {
                contCandidato3++;
            } else {
                i--;
                System.out.println("Digite um número válido");
            }
        }
            if (contCandidato1 > contCandidato2 && contCandidato1 > contCandidato3) {
                System.out.println("CANDITATO 1 VENCEU");
            } else if (contCandidato2 > contCandidato1 && contCandidato2 > contCandidato3) {
                System.out.println("CANDITATO 2 VENCEU");
            } else if (contCandidato3 > contCandidato2 && contCandidato3 > contCandidato1) {
                System.out.println("CANDITATO 3 VENCEU");
            } else
                System.out.println("Ocorreu um empate");
        }
    }

