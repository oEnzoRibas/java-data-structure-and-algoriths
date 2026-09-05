/**
 * Arvore binaria de pesquisa
 * @author Diego Rocha
 */

public class AVL {
	private No raiz; // Raiz da arvore.
    private int n;// Número de elementos da arvore
	/**
	 * Construtor da classe.
	 */
	public AVL() {
		raiz = null;
		n=0;
	}

	/**
	 * Metodo publico iterativo para pesquisar elemento.
	 * @param x Elemento que sera procurado.
	 * @return <code>true</code> se o elemento existir, <code>false</code> em caso
	 *         contrario.
	 */
	public boolean pesquisar(int x) {
		return pesquisar(x, raiz);
	}

	/**
	 * Metodo privado recursivo para pesquisar elemento.
	 * @param x Elemento que sera procurado.
	 * @param i No em analise.
	 * @return <code>true</code> se o elemento existir, <code>false</code> em caso
	 *         contrario.
	 */
	private boolean pesquisar(int x, No i) {
		boolean resp;
		if (i == null) {
			resp = false;
		} else if (x == i.getElemento()) {
			resp = true;
		} else if (x < i.getElemento()) {
			resp = pesquisar(x, i.getEsq());
		} else {
			resp = pesquisar(x, i.getDir());
		}
		return resp;
	}

	/**
	 * Metodo publico iterativo para exibir elementos.
	 */
	public void caminharCentral() {
		System.out.print("[ ");
		caminharCentral(raiz);
		System.out.println("]");
	}

	/**
	 * Metodo privado recursivo para exibir elementos.
	 * @param i No em analise.
	 */
	private void caminharCentral(No i) {
		if (i != null) {
			caminharCentral(i.getEsq()); // Elementos da esquerda.
			System.out.print(i.getElemento() + " "); // Conteudo do no.
			caminharCentral(i.getDir()); // Elementos da direita.
		}
	}

	/**
	 * Metodo publico iterativo para exibir elementos.
	 */
	public void caminharPre() {
		System.out.print("[ ");
		caminharPre(raiz);
		System.out.println("]");
	}

	/**
	 * Metodo privado recursivo para exibir elementos.
	 * @param i No em analise.
	 */
	private void caminharPre(No i) {
		if (i != null) {
			System.out.print(i.getElemento() + "(fator " + (No.getNivel(i.getDir()) - No.getNivel(i.getEsq())) + ") "); // Conteudo do no.
			caminharPre(i.getEsq()); // Elementos da esquerda.
			caminharPre(i.getDir()); // Elementos da direita.
		}
	}

	/**
	 * Metodo publico iterativo para exibir elementos.
	 */
	public void caminharPos() {
		System.out.print("[ ");
		caminharPos(raiz);
		System.out.println("]");
	}

	/**
	 * Metodo privado recursivo para exibir elementos.
	 * @param i No em analise.
	 */
	private void caminharPos(No i) {
		if (i != null) {
			caminharPos(i.getEsq()); // Elementos da esquerda.
			caminharPos(i.getDir()); // Elementos da direita.
			System.out.print(i.getElemento() + " "); // Conteudo do no.
		}
	}

	/**
	 * Metodo publico iterativo para inserir elemento.
	 * @param x Elemento a ser inserido.
	 * @throws Exception Se o elemento existir.
	 */
	public void inserir(int x) throws Exception {
		raiz = inserir(x, raiz);
	}

	/**
	 * Metodo privado recursivo para inserir elemento.
	 * @param x Elemento a ser inserido.
	 * @param i No em analise.
	 * @return No em analise, alterado ou nao.
	 * @throws Exception Se o elemento existir.
	 */
	private No inserir(int x, No i) throws Exception {
		if (i == null) {
			n++;
			i = new No(x);
		} else if (x < i.getElemento()) {
			i.setEsq( inserir(x, i.getEsq()));
		} else if (x > i.getElemento()) {
			i.setDir(inserir(x, i.getDir()));
		} else {
			throw new Exception("Erro ao inserir!");
		}
		return balancear(i);
	}

	/**
	 * Metodo publico iterativo para remover elemento.
	 * @param x Elemento a ser removido.
	 * @throws Exception Se nao encontrar elemento.
	 */
	public void remover(int x) throws Exception {
		raiz = remover(x, raiz);
	}

	/**
	 * Metodo privado recursivo para remover elemento. 
	 * @param x Elemento a ser removido.
	 * @param i No em analise.
	 * @return No em analise, alterado ou nao.
	 * @throws Exception Se nao encontrar elemento.
	 */
	private No remover(int x, No i) throws Exception {
		if (i == null) {
			throw new Exception("Erro ao remover!");
		} else if (x < i.getElemento()) {
			i.setEsq( remover(x, i.getEsq()));
		} else if (x > i.getElemento()) {
			i.setDir( remover(x, i.getDir()));
		// Sem no a direita.
		} else if (i.getDir() == null) {
			i = i.getEsq();
		// Sem no a esquerda.
		} else if (i.getEsq() == null) {
			i = i.getDir();
		// No a esquerda e no a direita.
		} else {
			i.setEsq( maiorEsq(i, i.getEsq()));
		}
		return balancear(i);
	}

	/**
	 * Metodo para trocar o elemento "removido" pelo maior da esquerda.
	 * @param i No que teve o elemento removido.
	 * @param j No da subarvore esquerda.
	 * @return No em analise, alterado ou nao.
	 */
	private No maiorEsq(No i, No j) {
		// Encontrou o maximo da subarvore esquerda.
		if (j.getDir()== null) {
			n--;
			i.setElemento(j.getElemento()); // Substitui i por j.
			j = j.getEsq(); // Substitui j por j.getEsq().
		// Existe no a direita.
		} else {
			// Caminha para direita.
			j.setDir(maiorEsq(i, j.getDir()));
		}
		return j;
	}

	private No balancear(No no) throws Exception {
		if (no != null) {
			int fator = No.getNivel(no.getDir()) - No.getNivel(no.getEsq());
			// Se balanceada
			if (Math.abs(fator) <= 1) {
				no.setNivel();
			// Se desbalanceada para a direita
			} else if (fator == 2) {
				int fatorFilhoDir = No.getNivel(no.getDir().getDir()) - No.getNivel(no.getDir().getEsq());
				// Se o filho a direita tambem estiver desbalanceado
				if (fatorFilhoDir == -1) {
					no.setDir( rotacionarDir(no.getDir()));
				}
				no = rotacionarEsq(no);
			// Se desbalanceada para a esquerda
			} else if (fator == -2) {
				int fatorFilhoEsq = No.getNivel(no.getEsq().getDir()) - No.getNivel(no.getEsq().getEsq());
				// Se o filho a esquerda tambem estiver desbalanceado
				if (fatorFilhoEsq == 1) {
					no.setEsq( rotacionarEsq(no.getEsq()));
				}
				no = rotacionarDir(no);
			} else {
				throw new Exception(
						"Erro no No(" + no.getElemento() + ") com fator de balanceamento (" + fator + ") invalido!");
			}
		}
		return no;
	}

	private No rotacionarDir(No no) {
		System.out.println("Rotacionar DIR(" + no.getElemento() + ")");
		No noEsq = no.getEsq();
		No noEsqDir = noEsq.getDir();

		noEsq.setDir(no);
		no.setEsq(noEsqDir);
		no.setNivel(); // Atualizar o nivel do no
		noEsq.setNivel(); // Atualizar o nivel do noEsq

		return noEsq;
	}

	private No rotacionarEsq(No no) {
		System.out.println("Rotacionar ESQ(" + no.getElemento() + ")");
		No noDir = no.getDir();
		No noDirEsq = noDir.getEsq();

		noDir.setEsq( no);
		no.setDir( noDirEsq);

		no.setNivel(); // Atualizar o nivel do no
		noDir.setNivel(); // Atualizar o nivel do noDir
		return noDir;
	}

	/**
	 * Metodo para retronar o número de elementos na árvore.
	 * @return número de elementos
	 */
	public int tamanho(){
		return n;
	}

}
