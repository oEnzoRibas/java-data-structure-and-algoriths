import java.util.Scanner; 
public class Eleicao {
   public static void main(String[] args) {
     int maxCand = 10, aux, voto, candmaior = 0, quantmaior = 0;
     int cand[] = new int[maxCand];
     Scanner teclado = new Scanner(System.in);
     for (aux=0; aux<maxCand; aux++)
        cand[aux] = 0;
     do {
        System.out.print("Informe o seu voto (1 a "+maxCand+"): ");
        voto = teclado.nextInt();
        if (voto >= 1 && voto <= maxCand)
           cand[voto-1]++;
     } while (voto != 0);
     for (aux=0; aux<maxCand; aux++) {
       System.out.println("Votos do candidato "+(aux+1)+" = "+cand[aux]);
       if (aux == 0 || cand[aux] > quantmaior) {
         candmaior = aux;
         quantmaior = cand[aux];
       }
     }
     System.out.print("Candidato "+(candmaior+1)+" foi vencedor com "+cand[candmaior]+" votos.");
     teclado.close();
   }
}
