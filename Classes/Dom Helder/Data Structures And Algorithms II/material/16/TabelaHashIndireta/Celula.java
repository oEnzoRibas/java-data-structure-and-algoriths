/**
 * Celula (pilha, lista e fila dinamica)
 * @author Diego Rocha
 *
 */
class Celula {
	private int elemento; // Elemento inserido na celula.
	private Celula prox; // Aponta a celula prox.


	/**
	 * Construtor da classe.
	 */
	public Celula() {
		this(0);
	}

	/**
	 * Construtor da classe.
	 * @param elemento int inserido na celula.
	 */
	public Celula(int elemento) {
      this.elemento = elemento;
      this.prox = null;
	}

	public int getElemento() {
		return elemento;
	}

	public void setElemento(int elemento) {
		this.elemento = elemento;
	}

	public Celula getProx() {
		return prox;
	}

	public void setProx(Celula prox) {
		this.prox = prox;
	}
}
