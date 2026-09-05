/**
  * Celula Dupla (lista dupla dinamica)
  *  @author Diego Silva Caldeira Rocha
  * @version 3 01/2023
 */
class CelulaDupla <T> {
	private T elemento;
	private CelulaDupla <T>ant;
	private CelulaDupla <T> prox;

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public CelulaDupla getAnt() {
		return ant;
	}

	public void setAnt(CelulaDupla ant) {
		this.ant = ant;
	}

	public CelulaDupla getProx() {
		return prox;
	}

	public void setProx(CelulaDupla prox) {
		this.prox = prox;
	}

	/**
	 * Construtor da classe.
	 */
	public CelulaDupla() {
		this(null);
	}


	/**
	 * Construtor da classe.
	 * @param elemento int inserido na celula.
	 */
	public CelulaDupla(T elemento) {
		this.elemento = elemento;
		this.ant = this.prox = null;
	}
}
