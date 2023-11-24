package buscaemlistaordenada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class BuscaOrdenada {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 12, 14));

		 // aqui Solicito ao usuário um número a ser procurado na lista
		int numeroProcurado = Integer.valueOf(JOptionPane.showInputDialog("Qual Numero Voçe Deseja Procurar?"));
		
		// Chama o metodo de busca ordenada
		int posicao = buscaOrdenada(numeros, numeroProcurado);
		
		if (posicao != -1) {
			JOptionPane.showMessageDialog(null, "O número " + numeroProcurado + " está na posição " + posicao + " da lista.");
		} else {
			JOptionPane.showMessageDialog(null, "o numero " + numeroProcurado + " não esta presente na lista.");
		}
	}

	public static int buscaOrdenada(List<Integer> listaOrdenada, int numeroProcurado) {
		
		int inicio = 0;
		int fim = listaOrdenada.size() - 1; // a variavel fim recebe o tamanho total da lista subtraindo 1

		while (inicio <= fim) {
			int meio = inicio + (fim - inicio) / 2;

			if (listaOrdenada.get(meio) == numeroProcurado) {
				return meio; // Encontrou o número, retorna a posição.
			}

			if (listaOrdenada.get(meio) < numeroProcurado) {
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}
		}

		return -1; // Não encontrou o número na lista.
	}

}
