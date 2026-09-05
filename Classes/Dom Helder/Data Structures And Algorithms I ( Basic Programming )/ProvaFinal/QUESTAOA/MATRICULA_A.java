package ProvaFinal.QUESTAOA;

import java.util.Scanner;

public class MATRICULA_A {
    public static void main(String[] args) {
        /*
    Autor: Enzo Rocha Leite Diniz Ribas
    Matricula *******

    QUESTÃO A CLASSE PRINCIPAL
     */

        int qntQuestoes = 25;
        String [] gabarito = new String[qntQuestoes];
        String [] respostas = new String[qntQuestoes];
        int acertos = 0;

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i <= qntQuestoes-1; i++) {
            System.out.printf("""
                    Informe o gabarito da questão %d""",(i+1));
            gabarito[i] = teclado.nextLine();
            System.out.printf("""
                    Informe a resposta do aluno para a questão %d""",(i+1));
            respostas[i] = teclado.nextLine();
        }

        for (int i = 0; i <= qntQuestoes-1; i++){
            if (gabarito[i].equalsIgnoreCase(respostas[i])){
                acertos++;
            }
        }
        if (acertos < qntQuestoes*0.8){
            System.out.println("ALUNO REPROVADO");
        }else {
            System.out.println("ALUNO APROVADO");
        }
    }
}
