import java.util.Scanner; 
public class PesquisaGasolina3 {
   public static void main(String[] args) {
     String nome, nomeMaior = ""; 
     double preco, precoMaior = 0;
     Scanner teclado = new Scanner(System.in);
     for (int aux=1; aux<=68; aux++) {
        System.out.print("Informe nome do posto de gasolina: ");
        nome = teclado.nextLine();
        System.out.print("Informe preço da gasolina neste posto: ");
        preco = teclado.nextDouble();
        if (aux == 1 || preco > precoMaior) {
           precoMaior = preco;
           nomeMaior = nome;
        }
     }
     System.out.println("Posto que cobra mais caro pela gasolina:"+nomeMaior);
     teclado.close();
   }
}

