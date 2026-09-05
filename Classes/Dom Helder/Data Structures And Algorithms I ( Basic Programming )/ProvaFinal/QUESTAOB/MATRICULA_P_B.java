package ProvaFinal.QUESTAOB;


import java.util.Scanner;

public class MATRICULA_P_B {

    /*
    Autor: Enzo Rocha Leite Diniz Ribas
    Matricula *******
    QUESTÃO B CLASSE PRINCIPAL
     */

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        String frase;
        System.out.println("Informe uma frase: ");
        frase = teclado.nextLine();
        System.out.println(MATRICULA_S_B.criptografa(frase));

    }
}
