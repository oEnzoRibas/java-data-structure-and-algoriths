package Etapa3.C13.C13EX08Pckg;

import java.util.Scanner;

public class C13EX08 {
    public static void main(String[] args) {

        /*
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        String nome, sobrenome;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu nome completo: ");
        nome = teclado.nextLine().trim();

        String [] nomeVet = nome.split(" ");

        // Transforma o último nome em maiúsculo
        sobrenome = nomeVet[nomeVet.length - 1].toUpperCase();

        // String builder cria uma string de uma maneira mais eficiênte para manipulação
        StringBuilder iniciais = new StringBuilder();
        for (int i = 0; i < nomeVet.length - 1; i++) {
            /* Append adiciona a String iniciais uma substring que contem a posição 0 do nome (i) que está no vetor nomeVet (Inicial do nome)
            concatenado de um ponto de abreviação
            */
            iniciais.append(nomeVet[i].charAt(0)).append(". ");
        }
        String iniciaisFormat = iniciais.toString().toUpperCase().trim();


        System.out.printf("""
                Nome no padrão ABNT:
                %s, %s""",sobrenome,iniciaisFormat);
    }
}
