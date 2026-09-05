package C14EX02Pckg;

public class C14EX02_Círculo {

    static double raio;
    public static double area() {

        System.out.println("Informe o raio do círculo: ");
        raio = C14EX02_Main.teclado.nextDouble();

        return Math.pow(raio,2) * Math.PI;
    }
}
