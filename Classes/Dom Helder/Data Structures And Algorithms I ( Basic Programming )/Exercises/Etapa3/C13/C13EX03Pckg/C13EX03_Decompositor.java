package Etapa3.C13.C13EX03Pckg;

import com.sun.jdi.Value;

public class C13EX03_Decompositor {

    /*
        Autor: Enzo Rocha Leite Diniz Ribas
        */
    public static String decomp (long num, int x) {
        String numStr = String.valueOf(num);
        String[] vetInvert = new String[numStr.length()];
        int cont = 0;

        for (int i = vetInvert.length-1; i >= 0; i--) {
        vetInvert[cont] = numStr.substring(i,i+1);
        cont++;
        }
        return vetInvert[x-1];
    }
}
