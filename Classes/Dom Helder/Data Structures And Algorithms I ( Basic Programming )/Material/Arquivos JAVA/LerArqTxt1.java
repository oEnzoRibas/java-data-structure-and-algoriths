import java.util.Scanner; 
public class LerArqTxt1 {
   public static void main(String[] args) {
      String linha;
      Scanner arquivo = new Scanner(
         LerArqTxt1.class.getResourceAsStream("nomes.txt"));
      linha = arquivo.nextLine();
      System.out.println("Linha 1: "+linha);
      linha = arquivo.nextLine();
      System.out.println("Linha 2: "+linha);
      arquivo.close();
   }
}

