package Etapa2.C09;

public class C09EX10_SerieD {
    public static void main(String[] args) {

        // Fazer a serie serie matematica
        // Autor: Enzo Rocha Leite Diniz Ribas

        int rep;
        double serie = 0, den, num;

        rep = 100;

        for (int aux = 1; aux <= rep; aux++){
            num = aux + ( aux - 1 );
            den = Math.pow(aux,2);
            serie += ( num / den );
        }
        System.out.println(serie);
    }
}
