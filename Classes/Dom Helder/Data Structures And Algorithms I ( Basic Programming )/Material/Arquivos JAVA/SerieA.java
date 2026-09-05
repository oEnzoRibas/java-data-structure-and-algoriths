public class SerieA {
   public static void main(String[] args) {
      double num, den, serie=0;
      for (int aux=1; aux<=50; aux++) {
         num = aux;
         den = 51 - aux;
         serie += num / den;
      }
      System.out.print("Valor da Série = "+serie);
   }
}
