package Etapa2.C09;

public class C09EX11_SerieB {
    public static void main(String[] args) {

        // Fazer a serie serie matematica
        // Autor: Enzo Rocha Leite Diniz Ribas

        int rep;
        double serie = 0, den, num;

        rep = 100;

        for (int aux = 1; aux <= rep; aux++){
            num = ((aux - 1)*3)+1;
            den = Math.sqrt(4 + (aux*3));
            serie += ( num / den );
        }
        System.out.println(( 5.0 / 3 ) * ( serie ));
    }
}
