package Etapa2.C08;

public class C08EX19 {
    public static void main(String[] args) {

        // 100 primeiros termos da progressão numérica abaixo.
        // Autor: Enzo Rocha Leite Diniz Ribas

        double n, soma = 0;

        for (int i = 1; i <= 100; i++){
            n = Math.pow(i,2);
            System.out.println(" "+n);

            soma += n;

        }
        System.out.println("\nA soma dos termos é igual a: "+soma);

    }
}
