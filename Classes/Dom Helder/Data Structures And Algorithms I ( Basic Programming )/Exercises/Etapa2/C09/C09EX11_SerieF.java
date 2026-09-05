package Etapa2.C09;

public class C09EX11_SerieF {
    public static void main(String[] args) {

        // Fazer a serie serie matematica
        // Autor: Enzo Rocha Leite Diniz Ribas

        int rep;
        double serie = 0, den, num;

        rep = 100;

        for (int aux = 1; aux <= rep; aux++){
            num = ( ((aux - 1) * 2)  + 1 ) * Math.pow(2,aux+1);
            den = Math.pow( ( (aux * 5)-3 ), 2 );
            serie += ( num / den );
        }
        System.out.println( (5) * Math.sqrt( serie ) );
    }
}
