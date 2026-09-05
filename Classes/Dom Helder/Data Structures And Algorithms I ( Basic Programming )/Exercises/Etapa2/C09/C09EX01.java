package Etapa2.C09;

public class C09EX01 {
    public static void main(String[] args) {

        // Fazer a serie 37?38/1+36?37/2+35?36/3+...+2?3/36+1?2/37
        // Autor: Enzo Rocha Leite Diniz Ribas

        double num, den, serie=0;
        for (int aux=1; aux<=37; aux++) {
            num = (38-aux)*(39-aux);
            den = aux;
            serie += num / den;
        }

        System.out.print("Valor da Série = "+serie);


    }

}
