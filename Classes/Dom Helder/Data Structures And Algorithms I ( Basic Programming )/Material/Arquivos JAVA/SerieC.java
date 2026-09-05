
public class SerieC {
   public static void main(String[] args) {
      double num, den, serie=0;
      for (int aux=1; aux<=100; aux++) {
         num = Math.pow(aux,2);
         den = aux * 2;
         serie = serie + num / den;
      }
      serie = 375 + Math.pow(serie,4);
      System.out.print("Valor da Série = "+serie);
   }
}
