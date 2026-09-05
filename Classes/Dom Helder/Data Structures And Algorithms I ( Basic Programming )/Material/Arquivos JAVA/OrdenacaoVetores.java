import java.util.Scanner; 
public class OrdenacaoVetores {
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);      
      int aux, x;
      String temp;
      String NOME[] = new String[10];
      for (aux=0; aux<10; aux++) {
        System.out.print("Informe um nome:  ");
        NOME[aux] = teclado.nextLine();
      }
      for (aux=0; aux<9; aux++)
        for (x=0; x<9; x++)
          if (NOME[x].compareToIgnoreCase(NOME[x+1]) > 1) {
             temp = NOME[x];
             NOME[x] = NOME[x+1];
             NOME[x+1] = temp;
          }
      for (aux=0; aux<10; aux++)
        System.out.println(aux+" - "+NOME[aux]);
   }
}

