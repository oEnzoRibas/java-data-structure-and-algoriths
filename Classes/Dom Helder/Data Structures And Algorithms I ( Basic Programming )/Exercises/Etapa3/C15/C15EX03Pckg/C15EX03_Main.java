package Etapa3.C15.C15EX03Pckg;

import Etapa3.C15.C15EX01Pckg.C15EX01_Room;
import Etapa3.C15.C15EX02Pckg.C15EX02_BabyRoom;
import TrabalhoCSharp.Switch;

import java.util.Scanner;

public class C15EX03_Main {
    public static void main(String[] args) {

        /*
        Utilização de uma classe criada por herança
        Autor: Enzo Rocha Leite Diniz Ribas
         */

        String nome,cor, piso,arCondicionadoStr,varandaStr;
        int qntPortas, qntJanelas,qntToys, qntFraldas;
        boolean arCondicionado, varanda;

        Scanner teclado = new Scanner(System.in);

        C15EX02_BabyRoom BabyRoom1 = new C15EX02_BabyRoom(), BabyRoom2 = new C15EX02_BabyRoom(), BabyRoom3 = new C15EX02_BabyRoom();

        for (int i = 0; i < 3; i++) {
            System.out.println("Informe o nome do seu quarto: ");
            nome = teclado.nextLine();

            System.out.println("Informe a cor do seu quarto: ");
            cor = teclado.nextLine();

            System.out.println("Informe o tipo do piso do seu quarto: ");
            piso = teclado.nextLine();

            System.out.println("Informe a Quantidade de Portas do seu quarto: ");
            qntPortas = teclado.nextInt();

            System.out.println("Informe a Quantidade de Janelas do seu quarto: ");
            qntJanelas = teclado.nextInt();
            teclado.nextLine();

            System.out.println("Seu Quarto tem ArCondicionado? ");
            arCondicionadoStr = teclado.nextLine();

            System.out.println("Seu Quarto tem Varanda? ");
            varandaStr = teclado.nextLine();

            System.out.println("Quantos brinquedos tem no quarto do bebê? ");
            qntToys = teclado.nextInt(); 

            System.out.println("Quantas fraldas tem no quarto do bebê? ");
            qntFraldas = teclado.nextInt();
            teclado.nextLine();

            if (varandaStr.equalsIgnoreCase("sim")) {
                varanda = true;
            } else {
                varanda = false;
            }
            if (arCondicionadoStr.equalsIgnoreCase("sim")) {
                arCondicionado = true;
            } else {
                arCondicionado = false;
            }

            switch (i) {
                case 0:
                    BabyRoom1.setNome(nome);
                    BabyRoom1.setCor(cor);
                    BabyRoom1.setPiso(piso);
                    BabyRoom1.setQntPortas(qntPortas);
                    BabyRoom1.setQntJanelas(qntJanelas);
                    BabyRoom1.setArCondicionado(arCondicionado);
                    BabyRoom1.setVaranda(varanda);
                    BabyRoom1.setQntToys(qntToys);
                    BabyRoom1.setQntToys(qntFraldas);

                case 1:
                    BabyRoom2.setNome(nome);
                    BabyRoom2.setCor(cor);
                    BabyRoom2.setPiso(piso);
                    BabyRoom2.setQntPortas(qntPortas);
                    BabyRoom2.setQntJanelas(qntJanelas);
                    BabyRoom2.setArCondicionado(arCondicionado);
                    BabyRoom2.setVaranda(varanda);
                    BabyRoom2.setQntToys(qntToys);
                    BabyRoom2.setQntToys(qntFraldas);
                case 2:
                    BabyRoom3.setNome(nome);
                    BabyRoom3.setCor(cor);
                    BabyRoom3.setPiso(piso);
                    BabyRoom3.setQntPortas(qntPortas);
                    BabyRoom3.setQntJanelas(qntJanelas);
                    BabyRoom3.setArCondicionado(arCondicionado);
                    BabyRoom3.setVaranda(varanda);
                    BabyRoom3.setQntToys(qntToys);
                    BabyRoom3.setQntToys(qntFraldas);
            }


        }

        int quartoSel;
        do {

            System.out.printf("""
                                        
                    Qual quarto você deseja informação?
                                        
                    1 - Quarto %s
                    2 - Quarto %s
                    3 - Quarto %s
                                        
                                        
                    Para sair Digite -1
                                        
                    """, BabyRoom1.getNome(), BabyRoom2.getNome(), BabyRoom3.getNome());

            quartoSel = teclado.nextInt();
            switch (quartoSel) {
                case 1:
                    BabyRoom1.BabyroomInfo();
                    break;
                case 2:
                    BabyRoom2.BabyroomInfo();
                    break;
                case 3:
                    BabyRoom3.BabyroomInfo();
                    break;
                default: break;
            }

        }while (quartoSel != -1);

        teclado.close();
    }
}
