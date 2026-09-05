package C14EX01Pckg;

// Função : Calcular o fatorial de um número
// Autor : Enzo Rocha Leite Diniz Ribas
public class C14EX01_CalculaFatorial {

    public static double Fatorial(int x) {
        double fatorial = 1;
        for (int i = 2; i <= x; i++) {
            fatorial = fatorial * i;
        }
        return fatorial;
    }
}
