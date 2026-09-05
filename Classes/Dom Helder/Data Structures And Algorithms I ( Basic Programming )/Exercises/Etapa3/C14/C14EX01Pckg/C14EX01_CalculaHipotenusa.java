package C14EX01Pckg;

public class C14EX01_CalculaHipotenusa {
    // Função: Calcula Hipotenusa
    // Autor: Enzo Rocha Leite Diniz Ribas

    public static double hip(double cateto1, double cateto2) {
        double hipotenusa;
        hipotenusa = Math.pow(Math.pow(cateto1, 2) + Math.pow(cateto2, 2), 1.0 / 2);
        return hipotenusa;
    }
}
