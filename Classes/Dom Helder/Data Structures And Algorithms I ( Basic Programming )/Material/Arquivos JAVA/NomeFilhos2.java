import javax.swing.JOptionPane; 
public class NomeFilhos2 {
   public static void main(String[] args) {
      String nome = JOptionPane.showInputDialog(null,
         "Qual seu nome?", 
         "Aula de Java",
         JOptionPane.QUESTION_MESSAGE);
      String numFilhosStr = JOptionPane.showInputDialog(null,
         "Quantos filhos você tem?", 
         "Aula de Java",
         JOptionPane.QUESTION_MESSAGE);      
      int numFilhos = Integer.valueOf(numFilhosStr).intValue();
      JOptionPane.showMessageDialog(null,
         "Nome: "+nome+"\nQuantidade de filhos: "+numFilhos, 
         "Aula de Java",
         JOptionPane.INFORMATION_MESSAGE);
   }
}

