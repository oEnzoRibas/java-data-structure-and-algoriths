package Etapa1.C06;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C06EX04 {
    public static void main(String[] args) {
        //Calcular Índice de Massa Corporal
        //Autor: Enzo Rocha Leite Diniz Ribas
        Scanner teclado = new Scanner(System.in);
        double imc, peso, altura;
        System.out.println("Informe o peso do paciente: ");
        peso = teclado.nextDouble();
        System.out.println("Informe Altura do paciente: ");
        altura = teclado.nextDouble();

        imc = peso/(Math.pow(altura,2));

        if (imc < 18){
            System.out.println("Paciente está desnutrido");
        } else if (imc < 20){
            System.out.println("Paciente está abaixo do peso ideal");
            } else if (imc >= 20 && imc <= 25){
            System.out.println("Paciente está no peso ideal");
                } else if (imc > 25 && imc <= 27){
            System.out.println("Paciente está acima do peso ideal");
                    } else if (imc > 27){
            System.out.println("Paciente está obeso");
        }
    }
}
