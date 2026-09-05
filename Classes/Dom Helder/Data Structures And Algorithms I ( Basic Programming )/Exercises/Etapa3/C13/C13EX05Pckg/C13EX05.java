package Etapa3.C13.C13EX05Pckg;

import java.util.Scanner;

public class C13EX05 {
    public static void main(String[] args) {

        /*
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        Scanner teclado = new Scanner(System.in);
        double ang, angRad, sin, cos, tan, arcoSin, arcoCos, arcoTan;

        System.out.println("Informe um ângulo:");
        ang = teclado.nextDouble();

        angRad = Math.toRadians(ang);

        sin = Math.sin(angRad);
        cos = Math.cos(angRad);
        tan = Math.tan(angRad);
        arcoSin = 1/sin;
        arcoCos = 1/cos;
        arcoTan = 1/tan;


        System.out.printf("""
                
                Ângulo: %f
                Radianos: %f
                Seno: %f
                Cosseno: %f
                Tangente: %f
                Arco Seno: %f
                Arco Cosseno: %f
                Arco Tangente: %f
                
                """,ang,angRad,sin,cos,tan,arcoSin,arcoCos,arcoTan);

    }
}
