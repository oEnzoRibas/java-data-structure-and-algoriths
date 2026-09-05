import javax.swing.JOptionPane; 
public class TelaMensagem2 {
   public static void main(String[] args) {
      String nome = JOptionPane.showInputDialog(null,
         "Digite seu nome:", 
         "Aula de Java",
         JOptionPane.QUESTION_MESSAGE);
      
      System.out.println(nome);
   }
}

