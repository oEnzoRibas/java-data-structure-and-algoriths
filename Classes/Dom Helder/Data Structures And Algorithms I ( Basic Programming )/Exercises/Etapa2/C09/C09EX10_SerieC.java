package Etapa2.C09;

public class C09EX10_SerieC {
    public static void main(String[] args) {

        // Fazer a serie serie matematica
        // Autor: Enzo Rocha Leite Diniz Ribas

        int rep;
        double serie = 0, den, num;

        rep = 100;

        for (int aux = 1; aux <= rep*2; aux+= 2){
            num = aux;
            den = (aux+1);
            serie += ( num / den );
        }

        System.out.println( ( 1.0 / 3 ) * (Math.pow(serie,2)) );
    }
}
