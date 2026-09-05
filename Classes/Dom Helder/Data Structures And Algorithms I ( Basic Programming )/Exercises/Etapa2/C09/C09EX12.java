package Etapa2.C09;

public class C09EX12 {
  public static void main(String[] args) {

    // Fazer a serie serie matematica
    // Autor: Enzo Rocha Leite Diniz Ribas

    int rep;
    double serie = 0, den, num, fracao;

    rep = 10000;

    for (int aux = 1; aux <= rep; aux++) {
      if ( (aux % 2) == 0) {
        num = 1;

        den = ((aux-1) * 2) + 1;

        serie -= (num / den);
      }else {
        num = 1;

        den = ((aux-1) * 2) + 1;

        serie += (num / den);
      }
    }
    System.out.println(4 *  serie  );
  }
}
