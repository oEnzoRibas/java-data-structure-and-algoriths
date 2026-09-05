/**
 * Lista dupla dinamica
 *
 * @author Diego Silva Caldeira Rocha
 * @version 2 02/2023
 */
class ListaDupla<T> {
    private CelulaDupla primeiro;
    private CelulaDupla ultimo;


    /**
     * Construtor da classe que cria uma lista dupla sem elementos (somente no cabeca).
     */
    public ListaDupla() {
        primeiro = new CelulaDupla();
        ultimo = primeiro;
    }


    /**
     * Insere um elemento na primeira posicao da lista.
     *
     * @param x int elemento a ser inserido.
     */
    public void inserirInicio(T x) {
        CelulaDupla tmp = new CelulaDupla(x);

        tmp.setAnt(primeiro);
        tmp.setProx(primeiro.getProx());
        primeiro.setProx(tmp);
        if (primeiro == ultimo) {
            ultimo = tmp;
        } else {
            tmp.getProx().setAnt(tmp);
        }
        tmp = null;
    }


    /**
     * Insere um elemento na ultima posicao da lista.
     *
     * @param x int elemento a ser inserido.
     */
    public void inserirFim(T x) {
        ultimo.setProx(new CelulaDupla(x));
        ultimo.getProx().setAnt(ultimo);
        ultimo = ultimo.getProx();
    }


    /**
     * Remove um elemento da primeira posicao da lista.
     *
     * @return resp int elemento a ser removido.
     * @throws Exception Se a lista nao contiver elementos.
     */
    public T removerInicio() throws Exception {
        if (primeiro == ultimo) {
            throw new Exception("Erro ao remover (vazia)!");
        }

        CelulaDupla tmp = primeiro;
        primeiro = primeiro.getProx();
        T resp = (T) primeiro.getElemento();
        tmp.setProx(null);
        primeiro.setAnt(null);
        tmp = null;
        return resp;
    }


    /**
     * Remove um elemento da ultima posicao da lista.
     *
     * @return resp int elemento a ser removido.
     * @throws Exception Se a lista nao contiver elementos.
     */
    public T removerFim() throws Exception {
        if (primeiro == ultimo) {
            throw new Exception("Erro ao remover (vazia)!");
        }
        T resp = (T) ultimo.getElemento();
        ultimo = ultimo.getAnt();
        ultimo.getProx().setAnt(null);
        ultimo.setProx(null);
        return resp;
    }


    /**
     * Insere um elemento em uma posicao especifica considerando que o
     * primeiro elemento valido esta na posicao 0.
     *
     * @param x   int elemento a ser inserido.
     * @param pos int posicao da insercao.
     * @throws Exception Se <code>posicao</code> invalida.
     */
    public void inserir(T x, int pos) throws Exception {

        int tamanho = tamanho();

        if (pos < 0 || pos > tamanho) {
            throw new Exception("Erro ao inserir posicao (" + pos + " / tamanho = " + tamanho + ") invalida!");
        } else if (pos == 0) {
            inserirInicio(x);
        } else if (pos == tamanho) {
            inserirFim(x);
        } else {
            // Caminhar ate a posicao anterior a insercao
            CelulaDupla i = primeiro;
            for (int j = 0; j < pos; j++, i = i.getProx()) ;

            CelulaDupla tmp = new CelulaDupla(x);
            tmp.setAnt( i);
            tmp.setProx(i.getProx());
            tmp.getAnt().setProx(tmp);
            tmp.getProx().setAnt(tmp);
            tmp = i = null;
        }
    }


    /**
     * Remove um elemento de uma posicao especifica da lista
     * considerando que o primeiro elemento valido esta na posicao 0.
     *
     * @param pos Meio da remocao.
     * @return resp int elemento a ser removido.
     * @throws Exception Se <code>posicao</code> invalida.
     */
    public T remover(int pos) throws Exception {
        T resp;
        int tamanho = tamanho();

        if (primeiro == ultimo) {
            throw new Exception("Erro ao remover (vazia)!");

        } else if (pos < 0 || pos >= tamanho) {
            throw new Exception("Erro ao remover (posicao " + pos + " / " + tamanho + " invalida!");
        } else if (pos == 0) {
            resp = removerInicio();
        } else if (pos == tamanho - 1) {
            resp = removerFim();
        } else {
            // Caminhar ate a posicao anterior a insercao
            CelulaDupla i = primeiro.getProx();
            for (int j = 0; j < pos; j++, i = i.getProx()) ;

            //i.ant.prox = i.prox;
            i.getAnt().setProx(i.getProx());
         // i.prox.ant = i.ant;
            i.getProx().setAnt(i.getAnt());
            resp =(T) i.getElemento();

            i.setProx(null);
            i.setAnt(null);
            i = null;
        }

        return resp;
    }


    /**
     * Mostra os elementos da lista separados por espacos.
     */
    public void mostrar() {
        System.out.print("[ "); // Comeca a mostrar.
        for (CelulaDupla i = primeiro.getProx(); i != null; i = i.getProx()) {
            System.out.print(i.getElemento() + " ");
        }
        System.out.println("] "); // Termina de mostrar.
    }


    /**
     * Mostra os elementos da lista de forma invertida
     * e separados por espacos.
     */
    public void mostrarInverso() {
        System.out.print("[ ");
        for (CelulaDupla i = ultimo; i != primeiro; i = i.getAnt()) {
            System.out.print(i.getElemento() + " ");
        }
        System.out.println("] "); // Termina de mostrar.
    }


    /**
     * Procura um elemento e retorna se ele existe.
     *
     * @param x Elemento a pesquisar.
     * @return <code>true</code> se o elemento existir,
     * <code>false</code> em caso contrario.
     */
    public boolean pesquisar(T x) {
        boolean resp = false;
        for (CelulaDupla i = primeiro.getProx(); i != null; i = i.getProx()) {
            if (i.getElemento() == x) {
                resp = true;
                i = ultimo;
            }
        }
        return resp;
    }

    /**
     * Calcula e retorna o tamanho, em numero de elementos, da lista.
     *
     * @return resp int tamanho
     */
    public int tamanho() {
        int tamanho = 0;
        for (CelulaDupla i = primeiro; i != ultimo; i = i.getProx(), tamanho++) ;
        return tamanho;
    }


    public void removePorFila(Fila<Integer> fila) throws Exception
    {
        Pilha<Integer>pilha= new Pilha<>();

        while (fila.getTamanho()!=0)
            pilha.inserir(fila.remover());

        while (!pilha.vazio())
            remover(pilha.remover());



    }
}
