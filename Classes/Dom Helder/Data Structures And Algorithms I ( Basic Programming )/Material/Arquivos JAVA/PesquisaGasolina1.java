import java.util.Scanner;

public class PesquisaGasolina1 {
	public static void main(String[] args) {
		String nome;
		double preco, precoMaior = 0;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1; aux <= 68; aux++) {
			System.out.print("Informe nome do posto de gasolina: ");
			nome = teclado.nextLine();
			System.out.print("Informe preço da gasolina neste posto: ");
			preco = teclado.nextDouble();
			if (aux == 1 || preco > precoMaior)
				precoMaior = preco;
		}
		System.out.println("Preço da gasolina mais cara em BH:" + precoMaior);
		teclado.close();
	}
}