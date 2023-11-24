package arvorebinariasimples;

public class ArvoreBinaria {

	No raiz;
	
	// metodo para percorrer a árvore em ordem e imprimir os valores
	public void percorrerEmOrdem(No no) {
		if (no != null) {
			percorrerEmOrdem(no.esquerda);
			System.out.print(no.valor + " ");
			percorrerEmOrdem(no.direita);
		}
	}
}
