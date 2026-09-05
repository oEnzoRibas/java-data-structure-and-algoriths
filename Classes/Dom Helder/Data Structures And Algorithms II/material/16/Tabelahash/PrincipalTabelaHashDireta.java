public class PrincipalTabelaHashDireta {

    public static void main(String[] args) throws Exception {

        TabelaHashDireta tabela=new TabelaHashDireta(11);

        for (int i=0; i<11; i++)
            tabela.inserir(i);

        tabela.mostrar();

        tabela.remover(3);

        tabela.mostrar();

    }

}
