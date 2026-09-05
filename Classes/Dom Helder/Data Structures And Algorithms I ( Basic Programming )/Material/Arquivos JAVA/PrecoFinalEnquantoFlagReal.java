import java.util.Scanner;

public class PrecoFinalEnquantoFlagReal {
	public static void main(String[] args) {
		double qua, pru, cus, prf = 0, bdi;
		String nome = "";
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe taxa do BDI em %: ");
		bdi = teclado.nextDouble();
		teclado.nextLine();
		while (!nome.equalsIgnoreCase("FIM")) {
			System.out.print("Informe nome do material (FIM para finalizar): ");
			nome = teclado.nextLine();
			System.out.print("Informe quantidade consumida: ");
			qua = teclado.nextDouble();
			System.out.print("Informe preço unitário: ");
			pru = teclado.nextDouble();
			teclado.nextLine();
			cus = qua * pru;
			System.out.println("Custo Parcial = " + cus);
			prf += cus;
		}
		prf += prf * bdi / 100;
		System.out.println("Preço Final = " + prf);
		teclado.close();
	}
}