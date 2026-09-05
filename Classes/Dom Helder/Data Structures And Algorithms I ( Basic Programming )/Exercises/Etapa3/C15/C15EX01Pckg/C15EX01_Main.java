package Etapa3.C15.C15EX01Pckg;

import java.util.Scanner;

public class C15EX01_Main {
    public static void main(String[] args) {

        /*
        Utilização da Classe PAI
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        String nome,cor,piso, arCondicionadoStr,varandaStr;
        int qntPortas, qntJanelas;
        boolean arCondicionado,varanda;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o nome do seu quarto: ");
        nome = teclado.nextLine();

        System.out.println("Informe a cor do seu quarto: ");
        cor = teclado.nextLine();

        System.out.println("Informe o tipo do piso do seu quarto: ");
        piso= teclado.nextLine();

        System.out.println("Informe a Quantidade de Portas do seu quarto: ");
        qntPortas = teclado.nextInt();

        System.out.println("Informe a Quantidade de Janelas do seu quarto: ");
        qntJanelas = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Seu Quarto tem ArCondicionado? ");
        arCondicionadoStr = teclado.nextLine();

        System.out.println("Seu Quarto tem Varanda? ");
        varandaStr = teclado.nextLine();

        if(varandaStr.equalsIgnoreCase("sim")){
            varanda = true;
        } else {
            varanda = false;
        }
        if (arCondicionadoStr.equalsIgnoreCase("sim")){
            arCondicionado = true;
        }else {
            arCondicionado = false;
        }

        C15EX01_Room quarto = new C15EX01_Room(nome,cor,piso,qntPortas,qntJanelas,arCondicionado,varanda);

        System.out.println("""
                
                1 - Informações sobre o Quarto
                2 - Meu Quarto é Premium?
                
                """);
        int resp = teclado.nextInt();

        switch (resp){
            case 1: quarto.roomInfo();break;
            case 2: if(quarto.premium()) System.out.println("Sim"); else System.out.println("Não");break;
        }

        teclado.close();
    }
}
