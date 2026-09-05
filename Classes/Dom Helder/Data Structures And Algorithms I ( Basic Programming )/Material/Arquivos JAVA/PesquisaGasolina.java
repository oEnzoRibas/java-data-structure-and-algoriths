import java.util.Scanner;

public class PesquisaGasolina {
	public static void main(String[] args) {
		int contMenor = 0, contMaior = 0;
		String nome;
		double preco;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1; aux <= 68; aux++) {
			System.out.print("Informe nome do posto de gasolina: ");
			nome = teclado.nextLine();
			System.out.print("Informe preço da gasolina neste posto: ");
			preco = teclado.nextDouble();
			if (preco < 3)
				contMenor++;
			if (preco > 4)
				contMaior++;
		}
		System.out.println("Quant. de postos que cobram abaixo de R$3: " + contMenor);
		System.out.println("Quant. de postos que cobram acima de R$4: " + contMaior);
		teclado.close();
	}

}
