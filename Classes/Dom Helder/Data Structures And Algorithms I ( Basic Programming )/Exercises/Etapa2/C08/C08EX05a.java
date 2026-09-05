package Etapa2.C08;

import java.util.Scanner;

public class C08EX05a {

    // Fazer Eleição considerando empates e votos nulos VERSAO 2
    // Autor: Enzo Rocha Leite Diniz Ribas

    public static void main(String[] args) {
        int contVotosNulos = 0, contCandidato1 = 0, contCandidato2 = 0, contCandidato3 = 0, n = 5;
        int voto, qntVotos;
        Scanner teclado = new Scanner(System.in);

        // Sistema de repetição para a primeira eleição
        for (int i = 1; i <= n; i++) {
            System.out.println("""

                    Candadito Fulano = 1

                    Candidato Ciclano = 2

                    Candidato Beltrano = 3

                    Voto Nulo = 4
                   
                    Digite seu Voto:\s""");

            voto = teclado.nextInt();
            if (voto == 1) {
                contCandidato1++;
            } else if (voto == 2) {
                contCandidato2++;
            } else if (voto == 3) {
                contCandidato3++;
            } else if (voto == 4) {
                contVotosNulos++;
            } else {
                i--;
                System.out.println("\nDigite um número válido");
            }
        }
        qntVotos = contCandidato1 + contCandidato2 + contCandidato3;

        // testes de vencedor, nulidade ou empate

        if (contVotosNulos > qntVotos) {
            System.out.println("Eleição Anulada");
        } else if (contCandidato1 > contCandidato2 && contCandidato1 > contCandidato3) {
            System.out.println("CANDITATO 1 (FULANO) VENCEU");
        } else if (contCandidato2 > contCandidato1 && contCandidato2 > contCandidato3) {
            System.out.println("CANDITATO 2 (CICLANO) VENCEU");
        } else if (contCandidato3 > contCandidato2 && contCandidato3 > contCandidato1) {
            System.out.println("CANDITATO 3 (BELTRANO) VENCEU");
        }
        else{
                System.out.println("Ocorreu um empate \nSerá necessário um segundo turno.");

        // Testar se houve empate tripli
        boolean empateTri = (contCandidato1 == contCandidato2 && contCandidato1 == contCandidato3);

        // Testar se houve empate duplo
        boolean empate12 = (contCandidato1 == contCandidato2);
        boolean empate13 = (contCandidato1 == contCandidato3);
        boolean empate23 = (contCandidato2 == contCandidato3);

        contVotosNulos = 0; contCandidato1 = 0; contCandidato2 = 0; contCandidato3 = 0;

        String msg = """

                    Candadito Fulano = 1

                    Candidato Ciclano = 2

                    Candidato Beltrano = 3

                    Voto Nulo = 4
                   
                    Digite seu Voto:\s""";

        if(!empateTri) {
            if (empate12) {
                msg = """

                    Candadito Fulano = 1

                    Candidato Ciclano = 2

                    Voto Nulo = 4
                   
                    Digite seu Voto:\s""";

            } else if (empate13) {
                msg = """

                    Candadito Fulano = 1

                    Candidato Beltrano = 3

                    Voto Nulo = 4
                   
                    Digite seu Voto:\s""";

            }else {
                msg = """

                    Candidato Ciclano = 2

                    Candadito Beltrano = 3

                    Voto Nulo = 4
                   
                    Digite seu Voto:\s""";

            }
        }
                // eleicao segundo turno
                for (int i = 1; i <= n; i++) {
                    System.out.println(msg);
                    voto = teclado.nextInt();
                    if ((voto == 1 && empate23) || (voto == 2 && empate13) || (voto == 3 && empate12)){
                        i--;
                        continue;
                    }
                    if (voto == 1) {
                        contCandidato1++;
                    } else if (voto == 2) {
                        contCandidato2++;
                    } else if (voto == 3) {
                        contCandidato3++;
                    } else if (voto == 4) {
                        contVotosNulos++;
                    }else {
                        i--;
                        System.out.println("Digite um número válido");
                    }
                }
                qntVotos = contCandidato1 + contCandidato2 + contCandidato3;

                if (contVotosNulos > qntVotos) {
                    System.out.println("Eleição Anulada");
                } else if (contCandidato1 > contCandidato2 && contCandidato1 > contCandidato3) {
                    System.out.println("CANDITATO 1 (FULANO) VENCEU");
                } else if (contCandidato2 > contCandidato1 && contCandidato2 > contCandidato3) {
                    System.out.println("CANDITATO 2 (CICLANO) VENCEU");
                } else if (contCandidato3 > contCandidato2 && contCandidato3 > contCandidato1) {
                    System.out.println("CANDITATO 3 (BELTRANO) VENCEU");
                } else {
                    System.out.println("Empatou novamente, não haverá outra eleição");
                    int x = 1;
                    System.exit(x);
                }
            }
        teclado.close();
    }
}