package Etapa2.C09;

public class C09EX11_SerieE {
    public static void main(String[] args) {

        // Fazer a serie serie matematica
        // Autor: Enzo Rocha Leite Diniz Ribas

        int rep;
        double serie = 0, den, num;

        rep = 100;

        for (int aux = 1; aux <= rep; aux++){
            num = (Math.pow(aux,2)) * Math.sqrt((2 * aux)+3);
            den = Math.pow( (aux+1), aux );
            serie += ( num / den );
        }
        System.out.println( (2.0 / 3) * ( serie ) );
    }
}
