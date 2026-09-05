import javax.swing.JOptionPane; 
public class TelaMensagem3 {
   public static void main(String[] args) {
      String[] botoes = {"Solteiro","Casado","Viúvo","Outro"};
      int indice = JOptionPane.showOptionDialog(null,
         "Selecione seu estado civil:", 
         "Aula de Java",
         JOptionPane.INFORMATION_MESSAGE,
         JOptionPane.QUESTION_MESSAGE, 
         null,
         botoes,
         "Solteiro");
      System.out.println(botoes[indice]);
   }
}

