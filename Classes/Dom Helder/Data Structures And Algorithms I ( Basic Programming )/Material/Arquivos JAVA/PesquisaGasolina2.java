import java.util.Scanner;

public class PesquisaGasolina2 {
	public static void main(String[] args) {
		String nome;
		double preco, precoMenor = 0;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1; aux <= 68; aux++) {
			System.out.print("Informe nome do posto de gasolina: ");
			nome = teclado.nextLine();
			System.out.print("Informe preço da gasolina neste posto: ");
			preco = teclado.nextDouble();
			if (aux == 1 || preco < precoMenor)
				precoMenor = preco;
		}
		System.out.println("Preço da gasolina mais barata de BH:" + precoMenor);
		teclado.close();
	}
}
