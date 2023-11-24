package ordenacaosimples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenacaoSimples {

	public static void main(String[] args) {

		// lista instanciada com os valores aleatorios
		List<Integer> numeros = new ArrayList<>(Arrays.asList(14,20, 8,16, 2, 6, 4, 12));

		System.out.println("Lista antes da ordenação:");
		imprimirLista(numeros);

		// aqui eu utilizei uma classe utilitária fornecida no pacote java.util ela
		// oferece métodos estáticos
		// para se trabalhar com as List nesse caso aqui usei o metodo sort
		Collections.sort(numeros);

		System.out.println();
		System.out.println("Lista após a ordenação:");
		imprimirLista(numeros);
	
		
	}

	public static void imprimirLista(List<Integer> lista) {
	
		// aqui utilizei o foreach para iterar sobre a lista e imprimir
		for (Integer numero : lista) {
			System.out.print(numero + " ");
		}
	}

}
