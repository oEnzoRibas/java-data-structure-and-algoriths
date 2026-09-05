import javax.swing.JOptionPane; 
public class TelaMensagem4 {
   public static void main(String[] args) {
      int indice = JOptionPane.showConfirmDialog(null,
         "Você gosta de Java?", 
         "Aula de Java",
         JOptionPane.YES_NO_CANCEL_OPTION);
      System.out.println(indice);
   }
}

