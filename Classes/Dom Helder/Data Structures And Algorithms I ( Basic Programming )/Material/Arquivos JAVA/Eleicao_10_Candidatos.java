import java.util.Scanner;

public class Eleicao_10_Candidatos {
	public static void main(String[] args) {
		int voto;
		int cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0, cand5 = 0, cand6 = 0, cand7 = 0, cand8 = 0, cand9 = 0,
				cand10 = 0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Informe o seu voto (1 a 10): ");
			voto = teclado.nextInt();
			if (voto == 1)
				cand1++;
			else if (voto == 2)
				cand2++;
			else if (voto == 3)
				cand3++;
			else if (voto == 4)
				cand4++;
			else if (voto == 5)
				cand5++;
			else if (voto == 6)
				cand6++;
			else if (voto == 7)
				cand7++;
			else if (voto == 8)
				cand8++;
			else if (voto == 9)
				cand9++;
			else if (voto == 10)
				cand10++;
		} while (voto != 0);
		System.out.println("Votos do candidato 1" + cand1);
		System.out.println("Votos do candidato 2" + cand2);
		System.out.println("Votos do candidato 3" + cand3);
		System.out.println("Votos do candidato 4" + cand4);
		System.out.println("Votos do candidato 5" + cand5);
		System.out.println("Votos do candidato 6" + cand6);
		System.out.println("Votos do candidato 7" + cand7);
		System.out.println("Votos do candidato 8" + cand8);
		System.out.println("Votos do candidato 9" + cand9);
		System.out.println("Votos do candidato 10" + cand10);
		if (cand1 > cand2 && cand1 > cand3 && cand1 > cand4 && cand1 > cand5 && cand1 > cand6 && cand1 > cand7
				&& cand1 > cand8 && cand1 > cand9 && cand1 > cand10)
			System.out.print("Candidato 1 foi vencedor com " + cand1 + " votos.");
		else if (cand2 > cand1 && cand2 > cand3 && cand2 > cand4 && cand2 > cand5 && cand2 > cand6 && cand2 > cand7
				&& cand2 > cand8 && cand2 > cand9 && cand2 > cand10)
			System.out.print("Candidato 2 foi vencedor com " + cand2 + " votos.");
		else if (cand3 > cand1 && cand3 > cand2 && cand3 > cand4 && cand3 > cand5 && cand3 > cand6 && cand3 > cand7
				&& cand3 > cand8 && cand3 > cand9 && cand3 > cand10)
			System.out.print("Candidato 3 foi vencedor com " + cand3 + " votos.");
		else if (cand4 > cand1 && cand4 > cand2 && cand4 > cand3 && cand4 > cand5 && cand2 > cand6 && cand4 > cand7
				&& cand4 > cand8 && cand4 > cand9 && cand4 > cand10)
			System.out.print("Candidato 4 foi vencedor com " + cand4 + " votos.");
		else if (cand5 > cand1 && cand5 > cand2 && cand5 > cand3 && cand5 > cand4 && cand3 > cand6 && cand5 > cand7
				&& cand5 > cand8 && cand5 > cand9 && cand5 > cand10)
			System.out.print("Candidato 5 foi vencedor com " + cand5 + " votos.");
		else if (cand6 > cand1 && cand6 > cand2 && cand6 > cand3 && cand6 > cand4 && cand2 > cand5 && cand6 > cand7
				&& cand6 > cand8 && cand6 > cand9 && cand6 > cand10)
			System.out.print("Candidato 6 foi vencedor com " + cand6 + " votos.");
		else if (cand7 > cand1 && cand7 > cand2 && cand7 > cand3 && cand7 > cand4 && cand3 > cand5 && cand7 > cand6
				&& cand7 > cand8 && cand7 > cand9 && cand7 > cand10)
			System.out.print("Candidato 7 foi vencedor com " + cand7 + " votos.");
		else if (cand8 > cand1 && cand8 > cand2 && cand8 > cand3 && cand8 > cand4 && cand2 > cand5 && cand8 > cand6
				&& cand8 > cand7 && cand8 > cand9 && cand8 > cand10)
			System.out.print("Candidato 8 foi vencedor com " + cand8 + " votos.");
		else if (cand9 > cand1 && cand9 > cand2 && cand9 > cand3 && cand9 > cand4 && cand3 > cand5 && cand9 > cand6
				&& cand9 > cand7 && cand9 > cand8 && cand9 > cand10)
			System.out.print("Candidato 9 foi vencedor com " + cand9 + " votos.");
		else if (cand10 > cand1 && cand10 > cand2 && cand10 > cand3 && cand10 > cand4 && cand2 > cand5 && cand10 > cand6
				&& cand10 > cand7 && cand10 > cand8 && cand10 > cand9)
			System.out.print("Candidato 10 foi vencedor com " + cand10 + " votos.");
		teclado.close();
	}
}