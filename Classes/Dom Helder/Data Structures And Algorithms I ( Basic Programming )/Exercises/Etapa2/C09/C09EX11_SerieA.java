package Etapa2.C09;

public class C09EX11_SerieA {
    public static void main(String[] args) {

        // Fazer a serie serie matematica
        // Autor: Enzo Rocha Leite Diniz Ribas

        int rep;
        double serie = 0, den, num;

        rep = 100;

        for (int aux = 1; aux <= rep; aux++){
            num = aux + ( ( (aux - 1) * 7 ) + 1);
            den = Math.pow(4,(aux-1));
            serie += ( num / den );
        }
        System.out.println(Math.pow( serie, (1.0 / 3) ));
    }
}
