public class PrincipalTabelaHash {

    public static void main(String[] args) throws Exception {

        TabelaHash tabela=new TabelaHash(11);

        for (int i=0; i<11; i++)
            tabela.inserir(i);

        tabela.mostrar();

        tabela.remover(3);

        tabela.mostrar();

    }
}
