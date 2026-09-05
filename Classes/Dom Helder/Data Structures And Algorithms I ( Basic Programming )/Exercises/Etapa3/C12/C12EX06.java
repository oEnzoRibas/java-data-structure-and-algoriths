package Etapa3.C12;

import java.util.Scanner;

public class C12EX06 {
    public static void main(String[] args) {

        /*
        Imprimit vetor de trás pra frente
        Autor: Enzo Rocha Leite Diniz Ribas
         */

        Scanner teclado = new Scanner(System.in);

        String[] mesesVec = new String[12];

        for (int i = 0; i < mesesVec.length; i++){
            System.out.println("Informe um mês: ");
            mesesVec[i] = teclado.nextLine();
        }

        for (int k = mesesVec.length; k > 0; k--){
            System.out.println(mesesVec[k-1]);
        }
    }
}
