/**
 * Principal para Arvore Binaria de Pesquisa
 * @author Diego Rocha
 */
public class PrincipalAVL {
	public static void main(String[] args) {
		try {
			AVL avl = new AVL();

			int array[] = {1,2,3,4,5,6,7,8,9,10};
			for(int item: array){
				System.out.println("Inserindo -> " + item);
				avl.inserir(item);

			}

			avl.caminharPre();
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
	}
}
