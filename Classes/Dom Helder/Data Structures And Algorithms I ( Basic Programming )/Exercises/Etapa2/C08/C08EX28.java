package Etapa2.C08;

public class C08EX28 {
    public static void main(String[] args) {

        // Imprimir numeros triangulares entre 1 e 1000
        // Autor: Enzo Rocha Leite Diniz Ribas

        double media, num , somaN = 0, contN = 0 ;

        for (int i = 1; i <= 1000; i++){


            for (int j = 1; j <= 1000; j++){

                if (i == j*(j+1)*(j+2)){
                    num = i;
                    System.out.println(num);
                    
                    somaN += num;
                    contN++;
                }
            }
        }
        media = somaN/contN;
        System.out.println("\nMédia: "+media);
    }
}
