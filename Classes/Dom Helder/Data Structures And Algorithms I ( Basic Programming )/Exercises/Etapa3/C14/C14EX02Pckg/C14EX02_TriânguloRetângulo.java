package C14EX02Pckg;

public class C14EX02_TriânguloRetângulo {

    static double altura, base;
    public static double area() {

        System.out.println("Informe a altura do triângulo retângulo: ");
        altura = C14EX02_Main.teclado.nextDouble();

        System.out.println("Informe a base do triângulo retângulo: ");
        base = C14EX02_Main.teclado.nextDouble();
        return (altura * base)/2;
    }

}
