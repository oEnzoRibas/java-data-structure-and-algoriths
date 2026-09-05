package Etapa3.C13.C13EX02Pckg;

public class C13EX02Funcao {
    public static double funcao(double x){

        /*
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        if(x < 4){
            return (5*x+3)/(Math.sqrt((16-(Math.pow(x,2)))));
        }else if (x == 4){
            return 0;
        }else{
            return (5*x+3)/(Math.sqrt(((Math.pow(x,2)-16))));
        }

    }
}
