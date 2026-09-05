public class Divisor13_Cont {
	public static void main(String[] args) {
		int cont = 0;
		for (int divisor = 100; divisor <= 500; divisor++)
			if (divisor % 13 == 0)
				cont++;
		System.out.println("Quantidade de divisores por 13 = " + cont);
	}
}
