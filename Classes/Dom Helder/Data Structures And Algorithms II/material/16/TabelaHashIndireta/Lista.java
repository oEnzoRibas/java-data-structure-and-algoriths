/**
 * Lista dinamica
 * @author @author Diego Rocha
 *
 */
class Lista {
	private Celula primeiro;
	private Celula ultimo;


	/**
	 * Construtor da classe que cria uma lista sem elementos (somente no cabeca).
	 */
	public Lista() {
		primeiro = new Celula();
		ultimo = primeiro;
	}


	/**
	 * Insere um elemento na primeira posicao da lista.
    * @param x int elemento a ser inserido.
	 */
	public void inserirInicio(int x) {
		Celula tmp = new Celula(x);
        tmp.setProx( primeiro.getProx());
		primeiro.setProx(tmp);
		if (primeiro == ultimo) {                 
			ultimo = tmp;
		}
      tmp = null;
	}


	/**
	 * Insere um elemento na ultima posicao da lista.
    * @param x int elemento a ser inserido.
	 */
	public void inserirFim(int x) {
		ultimo.setProx( new Celula(x));
		ultimo = ultimo.getProx();
	}


	/**
	 * Remove um elemento da primeira posicao da lista.
    * @return resp int elemento a ser removido.
	 * @throws Exception Se a lista nao contiver elementos.
	 */
	public int removerInicio() throws Exception {
		if (primeiro == ultimo) {
			throw new Exception("Erro ao remover (vazia)!");
		}

      Celula tmp = primeiro;
	  primeiro = primeiro.getProx();
	  int resp = primeiro.getElemento();
      tmp.setProx( null);
      tmp = null;
	  return resp;
	}


	/**
	 * Remove um elemento da ultima posicao da lista.
    * @return resp int elemento a ser removido.
	 * @throws Exception Se a lista nao contiver elementos.
	 */
	public int removerFim() throws Exception {
		if (primeiro == ultimo) {
			throw new Exception("Erro ao remover (vazia)!");
		} 

		// Caminhar ate a penultima celula:
      Celula i;
      for(i = primeiro; i.getProx() != ultimo; i = i.getProx());

      int resp = ultimo.getElemento();
      ultimo = i;
	  ultimo.setProx(null);
      i = ultimo.getProx();
      
	  return resp;
	}


	/**
    * Insere um elemento em uma posicao especifica considerando que o 
    * primeiro elemento valido esta na posicao 0.
    * @param x int elemento a ser inserido.
	 * @param pos int posicao da insercao.
	 * @throws Exception Se <code>posicao</code> invalida.
	 */
   public void inserir(int x, int pos) throws Exception {

      int tamanho = tamanho();

      if(pos < 0 || pos > tamanho){
			throw new Exception("Erro ao inserir posicao (" + pos + " / tamanho = " + tamanho + ") invalida!");
      } else if (pos == 0){
         inserirInicio(x);
      } else if (pos == tamanho){
         inserirFim(x);
      } else {
		   // Caminhar ate a posicao anterior a insercao
         Celula i = primeiro;
         for(int j = 0; j < pos; j++, i = i.getProx());
		
         Celula tmp = new Celula(x);
         tmp.setProx( i.getProx());
         i.setProx(tmp);
         tmp = i = null;
      }
   }


	/**
    * Remove um elemento de uma posicao especifica da lista
    * considerando que o primeiro elemento valido esta na posicao 0.
	 * @param pos Meio da remocao.
    * @return resp int elemento a ser removido.
	 * @throws Exception Se <code>posicao</code> invalida.
	 */
	public int remover(int pos) throws Exception {
      int resp;
      int tamanho = tamanho();

		if (primeiro == ultimo){
			throw new Exception("Erro ao remover (vazia)!");

      } else if(pos < 0 || pos >= tamanho){
			throw new Exception("Erro ao remover (posicao " + pos + " / " + tamanho + " invalida!");
      } else if (pos == 0){
         resp = removerInicio();
      } else if (pos == tamanho - 1){
         resp = removerFim();
      } else {
		   // Caminhar ate a posicao anterior a insercao
         Celula i = primeiro;
         for(int j = 0; j < pos; j++, i = i.getProx());
		
         Celula tmp = i.getProx();
         resp = tmp.getElemento();
         i.setProx( tmp.getProx());
         tmp.setProx( null);
         i = tmp = null;
      }

		return resp;
	}

	/**
	 * Mostra os elementos da lista separados por espacos.
	 */
	public void mostrar() {
		System.out.print("[ ");
		for (Celula i = primeiro.getProx(); i != null; i = i.getProx()) {
			System.out.print(i.getElemento() + " ");
		}
		System.out.println("] ");
	}

	/**
	 * Procura um elemento e retorna se ele existe.
	 * @param x Elemento a pesquisar.
	 * @return <code>true</code> se o elemento existir,
	 * <code>false</code> em caso contrario.
	 */
	public boolean pesquisar(int x) {
		boolean resp = false;
		for (Celula i = primeiro.getProx(); i != null; i = i.getProx()) {
         if(i.getElemento() == x){
            resp = true;
            i = ultimo;
         }
		}
		return resp;
	}


	/**
	 * Procura um elemento e remove se ele existe.
	 * @param x Elemento a remover
	 *
	 * <code>false</code> em caso contrario.
	 */
	public void removeBusca(int x) throws Exception {
		boolean resp = false;
		int contador=0;

		for (Celula i = primeiro.getProx(); i != null; i = i.getProx()) {
			contador++;
			if(i.getElemento() == x){
				resp = true;
				i = ultimo;
			}

		}

		if(resp)
			remover(contador-1);
	}

	/**
	 * Calcula e retorna o tamanho, em numero de elementos, da lista.
	 * @return resp int tamanho
	 */
   public int tamanho() {
      int tamanho = 0; 
      for(Celula i = primeiro; i != ultimo; i = i.getProx(), tamanho++);
      return tamanho;
   }



	/**
	 * Calcula e retorna a soma de numeros de elementos, da lista.
	 * @return resp int tamanho
	 */
	public int soma() {
		int soma = 0;
		for(Celula i = primeiro; i != ultimo; i = i.getProx())
			soma=soma+i.getElemento();
		return soma;
	}
}
