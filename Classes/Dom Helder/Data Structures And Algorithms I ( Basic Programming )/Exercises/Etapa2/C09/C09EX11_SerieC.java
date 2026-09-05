package Etapa2.C09;

public class C09EX11_SerieC {
    public static void main(String[] args) {

        // Fazer a serie serie matematica
        // Autor: Enzo Rocha Leite Diniz Ribas

        int rep;
        double serie = 0, den, num;

        rep = 100;

        for (int aux = 1; aux <= rep; aux++){
            num = (( aux * 2) + 1) * Math.sqrt( (aux * 4) + 1);
            den = Math.pow( 5, aux);
            serie += ( num / den );
        }
        System.out.println(Math.pow( serie, 2 ));
    }
}
