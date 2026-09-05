import java.util.Arrays;
import java.util.Scanner;
public class ProcuraArraysNomes {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String Nomes[] = new String[5];
    for (int aux=0; aux<5; aux++) {
       System.out.print("Digite um nome: ");
       Nomes[aux] = teclado.nextLine();
    }
    System.out.print("Digite um nome a procurar: ");
    String nome = teclado.nextLine();
    int pos = Arrays.binarySearch(Nomes, nome);
    if (pos < 0)
       System.out.println("Nome não encontrado");
    else
       System.out.println("Nome encontrado no índice "+pos);
    teclado.close();
  }
}
