package C14EX01Pckg;

public class C14EX01_CalcularEsfera {
        // Calcular Área e Volume da esfera
// Autor: Enzo Rocha Leite Diniz Ribas

        public static String raioStr;
        public static double volume(double raio) {
            return ((Math.PI * (Math.pow(raio, 3))) * (4 / 3.0));
        }
        public static double area(double raio) {
            return ((Math.PI * (Math.pow(raio, 2))));
        }
}
