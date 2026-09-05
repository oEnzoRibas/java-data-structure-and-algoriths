package Etapa2.C09;

public class C09EX13 {
    public static void main(String[] args) {

        // Fazer a serie serie matematica
        // Autor: Enzo Rocha Leite Diniz Ribas

        int rep;
        double serie = 0, den = 0, num = 1;

        rep = 10;

        for (int aux = 1; aux <= rep; aux++){
            if ( aux % 2 == 0) {
                num *= aux;
                den = (den*2)+1;
                serie -= (num / den);
            } else {
                num *= aux;
                den = (den*2)+1;
                serie += ( num / den );
            }
        }
        System.out.println( serie );
    }
}
