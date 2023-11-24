package arvorebinariasimples;

public class AppArvoreBinaria {

	public static void main(String[] args) {
		
		
		    ArvoreBinaria arvore = new ArvoreBinaria();
	        
	        // Inserindo valores na árvore
	        arvore.raiz = new No(3);
	        arvore.raiz.esquerda = new No(2);
	        arvore.raiz.direita = new No(4);
	        arvore.raiz.esquerda.esquerda = new No(1);
	        arvore.raiz.direita.direita = new No(5);

	        // Percorrendo e imprimindo os valores em ordem
	        System.out.print("Árvore em ordem: ");
	        arvore.percorrerEmOrdem(arvore.raiz);

	}

}
