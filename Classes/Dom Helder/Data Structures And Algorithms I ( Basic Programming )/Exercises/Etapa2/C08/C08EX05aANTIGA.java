package Etapa2.C08;

import java.util.Scanner;

public class C08EX05aANTIGA {

    // Fazer Eleição considerando empates e votos nulos
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
        else
            //teste empate triplo
            if ((contCandidato1 == contCandidato2 && contCandidato1 == contCandidato3)){
                System.out.println("Ocorreu um empate triplo\nSerá necessário um segundo turno.");

                contVotosNulos = 0; contCandidato1 = 0; contCandidato2 = 0; contCandidato3 = 0;

                // eleicao segundo turno

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

            //Se o teste Triplo Falhou só pode ter ocorrido um empate duplo
            //Teste Empate duplo

            else {
                System.out.println("Ocorreu um empate duplo\nSerá necessário um segundo turno.");
                int candidato1SegundoTurno, candidato2SegundoTurno;
                String nomeCandidato1SegundoTurno, nomeCandidato2SegundoTurno;

                //teste quais candidatos empataram

                if (contCandidato1 == contCandidato2) {
                    candidato1SegundoTurno = 1;
                    candidato2SegundoTurno = 2;
                    nomeCandidato1SegundoTurno = "Candidato 1 (FULANO)";
                    nomeCandidato2SegundoTurno = "Candidato 2 (CICLANO)";
                }
                else if (contCandidato1 == contCandidato3) {
                    candidato1SegundoTurno = 1;
                    candidato2SegundoTurno = 2;
                    nomeCandidato1SegundoTurno = "Candidato 1 (FULANO)";
                    nomeCandidato2SegundoTurno = "Candidato 2 (BELTRANO)";
                }
                else {
                    candidato1SegundoTurno = 1;
                    candidato2SegundoTurno = 2;
                    nomeCandidato1SegundoTurno = "Candidato 2 (BELTRANO)";
                    nomeCandidato2SegundoTurno = "Candidato 3 (CICLANO)";
                }

                // eleicao segundo turno
                contVotosNulos = 0; contCandidato1 = 0; contCandidato2 = 0;
                for (int i = 1; i <= n; i++) {
                    System.out.printf("\n %s = %d\n\n %s = %d\n\nVoto Nulo = 4\nDigite seu Voto: ", nomeCandidato1SegundoTurno, candidato1SegundoTurno, nomeCandidato2SegundoTurno, candidato2SegundoTurno);
                    voto = teclado.nextInt();
                    if (voto == 1) {
                        contCandidato1++;
                    } else if (voto == 2) {
                        contCandidato2++;
                    } else if (voto == 4) {
                        contVotosNulos++;
                    } else {
                        i--;
                        System.out.println("\nDigite um número válido");
                    }
                }
                qntVotos = contCandidato1 + contCandidato2;

                if (contVotosNulos > qntVotos) {
                    System.out.println("Eleição Anulada");
                } else if (contCandidato1 > contCandidato2) {
                    System.out.printf("\n%s VENCEU", nomeCandidato1SegundoTurno);
                } else if (contCandidato1 < contCandidato2) {
                    System.out.printf("\n%s VENCEU", nomeCandidato2SegundoTurno);
                } else {
                    System.out.print("\n Empatou novamente, não haverá outra eleição");
                }
            }
        teclado.close();
    }
}