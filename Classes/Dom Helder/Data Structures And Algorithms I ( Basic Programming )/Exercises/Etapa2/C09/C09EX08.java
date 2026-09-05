package Etapa2.C09;

public class C09EX08 {
    public static void main(String[] args) {

    // Fazer a serie serie matematica
    // Autor: Enzo Rocha Leite Diniz Ribas

    int rep = 20, passo = 1;
    double serie = 0, num , den, n;

        for (int aux = 1; aux <= rep; aux+=passo){
            n = ( (3 + (2*(aux-1) ) ));
        num = n * Math.sqrt((n*2)-1);
        den = (Math.pow(5,aux));
        serie += (num/den);
        }
        System.out.println(Math.pow(serie,2));
}

}