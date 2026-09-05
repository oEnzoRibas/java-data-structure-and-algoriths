/**
 * Principal para Arvore Binaria de Pesquisa
 * @author Diego Silva Caldeira Rocha
 */
public class Principal {
    public static void main(String[] args) throws Exception {
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
       /* for(int i=-10; i<30; i++){
            arvoreBinaria.inserir(i);
            System.out.print("No. nos: " + i);
            System.out.print("\t Altura: " + arvoreBinaria.getAltura());
            System.out.println("\t log(2): " + Math.log(i)/Math.log(2));
        }*/

        String jose="rsrs";
        arvoreBinaria.inserir(-12);
        arvoreBinaria.inserir(-2);
        arvoreBinaria.inserir(-23);

        /*System.out.print(arvoreBinaria.pesquisarInterativo(12));
        System.out.print(arvoreBinaria.pesquisarInterativo(1000));

        System.out.print("impares" + arvoreBinaria.numeroImpares() );*/

        System.out.print("nrgsatibod" + arvoreBinaria.calculaSomaNegativos() );
    }
}
