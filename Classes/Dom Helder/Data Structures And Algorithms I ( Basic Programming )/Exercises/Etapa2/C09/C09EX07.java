package Etapa2.C09;

public class C09EX07 {
    public static void main(String[] args) {

        // Fazer a serie serie matematica
        // Autor: Enzo Rocha Leite Diniz Ribas

        int rep = 6, passo = 1;
        double serie = 0, num , den = 0;

        for (int aux = 1; aux <= rep; aux+=passo){
            num = ((aux-1)*2)+(aux*3);
            den = (6*(aux-1))+7;
            serie += (num/den);
        }
        System.out.println(serie);
    }
}
