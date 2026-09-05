import java.util.Scanner; 
public class NomeFilhos {
   public static void main(String[] args) {
      String nome;
      int numFilhos;
      Scanner teclado = new Scanner(System.in);
      System.out.print("Qual seu seu nome? ");
      nome = teclado.nextLine();
      System.out.print("Quantos filhos você tem? ");
      numFilhos = teclado.nextInt();
      System.out.println("Nome: "+nome);
      System.out.println("Quantidade de filhos: "+numFilhos);
      teclado.close();
   }
}
