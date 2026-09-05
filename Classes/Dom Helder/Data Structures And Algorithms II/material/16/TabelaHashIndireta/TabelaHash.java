/**
 * Arvore tabela hash
 * @author Diego Rocha
 * Hash indireta com lista flexível
 *
 */


public class TabelaHash {

    private Lista []tabela;

    /**
     * Construtor da tabela Hash
     * @param m
     */
    public TabelaHash(int m) throws Exception{

        if (m<=0) {
            throw new Exception("Não é possível criar Tabela Hash");
        }
        tabela= new Lista[m];
        for (int i=0; i< tabela.length; i++)
            tabela[i]=new Lista();
    }

    /***
     * meto que calcula a função hash de armazenamento de valor
     * @param x
     * @return
     */
    private int hash(int x){
        if(x<0)
            return -x%tabela.length;
        return x% tabela.length;
    }

    /**
     * insere elemento na Tabela Hash
     * @param x isere elemento na tabela hash
     */
    public void inserir(int x){
        tabela[hash(x)].inserirFim(x);
    }


    /***
     * mé4todo que verifica se existe elemento na tabela Hash
     * @param x
     * @return elemento
     */
    public boolean Pesquisar (int x){
        return tabela[hash(x)].pesquisar(x);
    }

    /**
     * metodo que remove elemento da tabela hash
     * @param x elemento
     * @throws Exception
     */
    public void remover(int x) throws Exception {
        tabela[hash(x)].removeBusca(x);
    }

    /**
     *  mostra todos elementos da tabela hash
     */
    public void mostrar ()
    {
        for (int i=0; i<tabela.length;i++){

            System.out.print(" ["+i+"] -> ");
            tabela[i].mostrar();

        }
    }


    public float mediaId(int i){

        return (float) tabela[hash(i)].soma()/tabela[hash(i)].tamanho() ;

    }



}
