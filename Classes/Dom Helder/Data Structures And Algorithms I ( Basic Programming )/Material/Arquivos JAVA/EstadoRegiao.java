import java.util.Scanner; 
public class EstadoRegiao {
   public static void main(String[] args) {
      String estado;
      Scanner teclado = new Scanner(System.in);
      System.out.print("Entre com o nome de um estado do Brasil: ");
      estado = teclado.nextLine();
      switch (estado) {
          case "Amazonas": case "Pará": case "Acre": // completar com os demais estados
             System.out.println("Região Norte");
             break;
          case "Piauí": case "Ceará": case "Recife": // completar com os demais estados
             System.out.println("Região Nordeste");
             break;
          // completar com as demais regiões
          default: 
             System.out.println("Estado inválido");
             break;
      }
      teclado.close();
   }
}

