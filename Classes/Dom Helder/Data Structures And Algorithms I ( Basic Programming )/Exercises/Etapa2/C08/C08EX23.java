package Etapa2.C08;

public class C08EX23 {
    public static void main(String[] args) {

        // Calcular os palindromos do intervalo 1000 - 9999 e a média entre eles
        // Autor: Enzo Rocha Leite Diniz Ribas

        int d1, d2, d3, d4,somaPal = 0, indice = 0;
        double media;

        for (int i = 1000; i <= 9999; i++){
            d1 = i/1000;
            d2 = i/100%10;
            d3 = i/10%10;
            d4 = i%10;

            String inverso = ""+ d4 + d3 + d2 + d1;
            if (inverso.equalsIgnoreCase(String.valueOf(i))){
                System.out.println("O número "+i+ " é um palíndromo");
                somaPal += i;
                indice++;
            }
        }
        media = (double) somaPal /indice;
        System.out.println("Média dos palíndromos: "+media);
    }
}
