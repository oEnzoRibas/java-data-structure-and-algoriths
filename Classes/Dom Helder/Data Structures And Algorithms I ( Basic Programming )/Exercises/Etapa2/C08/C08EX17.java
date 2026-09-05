package Etapa2.C08;

public class C08EX17 {
    public static void main(String[] args) {

        // Calcular valores de x para a função f(x)
        // Autor: Enzo Rocha Leite Diniz Ribas


        for (int i = 3; i <= 12; i++){
            double funcao = Math.sqrt(Math.pow(i,2)-3);
            System.out.println("X = "+i+" f(x)= "+funcao);
        }
    }
}
