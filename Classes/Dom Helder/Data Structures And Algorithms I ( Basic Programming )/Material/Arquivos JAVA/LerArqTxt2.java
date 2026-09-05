import java.util.Scanner; 
public class LerArqTxt2 {
   public static void main(String[] args) {
      String linha;
      Scanner arquivo = new Scanner(
              LerArqTxt2.class.getResourceAsStream("nomes.txt"));
      while (arquivo.hasNextLine()) {   
         linha = arquivo.nextLine();
         System.out.println(linha);
      }
      arquivo.close();
   }
}

