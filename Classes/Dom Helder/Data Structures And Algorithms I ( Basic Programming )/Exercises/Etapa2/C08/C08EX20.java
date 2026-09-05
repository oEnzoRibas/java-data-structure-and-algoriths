package Etapa2.C08;

public class C08EX20 {
    public static void main(String[] args) {

        // Calcular a soma dos 100 primeiros termos da Progressão matemática 2^n
        // Autor: Enzo Rocha Leite Diniz Ribas

        double soma = 0, pn;


        for (int i = 0; i <= 99; i++){

            pn = Math.pow(2,i);
            System.out.println(" "+pn);
            soma += pn;
        }
        System.out.println("Soma dos 100 primeiros termos da Progressão: "+soma);
    }
}
