package Etapa2.C09;

public class C09EX06 {
    public static void main(String[] args) {

        // Fazer a serie matematica
        // Autor: Enzo Rocha Leite Diniz Ribas

        int rep = 20;
        double serie = 0, num , den;

        for (int aux = 1; aux <= rep; aux++){
            num = aux;
            den = Math.sqrt(aux*2);
            serie += (num/den);
                    }
        System.out.println(10+(serie));
    }
}
