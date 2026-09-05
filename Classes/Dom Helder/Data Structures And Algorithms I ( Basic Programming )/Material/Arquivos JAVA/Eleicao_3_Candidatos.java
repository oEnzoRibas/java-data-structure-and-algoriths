import java.util.Scanner;
public class Eleicao_3_Candidatos {
	public static void main(String[] args) {
		int voto;
		int cand1=0, cand2=0, cand3=0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Informe o seu voto (1 a 3): ");
			voto = teclado.nextInt();
			if (voto == 1) cand1++;
			else if (voto == 2) cand1++;
			else if (voto == 3) cand1++;
		} while (voto != 0);
     	System.out.println("Votos do candidato 1"+cand1);
     	System.out.println("Votos do candidato 2"+cand1);
     	System.out.println("Votos do candidato 3"+cand1);
     	if (cand1>cand2 && cand1>cand3)
		   System.out.print("Candidato 1 foi vencedor com "+cand1+" votos.");
     	else if (cand2>cand1 && cand2>cand3)
		   System.out.print("Candidato 2 foi vencedor com "+cand2+" votos.");
     	else if (cand3>cand1 && cand3>cand2)
		   System.out.print("Candidato 3 foi vencedor com "+cand2+" votos.");
		teclado.close();
	}
}
