package sequenciadefibonacci;

import javax.swing.JOptionPane;

public class AppFibonacci {

	public static void main(String[] args) {

		Fibonacci fibonacci = new Fibonacci();
		
		// aqui deixei o sistema dinamico perguntando ao usuario quantos numeros ele deseja obter da sequncia de Fibonacci
		int op = Integer.valueOf(JOptionPane.showInputDialog("Quantos Numeros da sequencia de Fibonacci voçe deseja saber?"));
		
		fibonacci.imprimirFibonacci(op);
	
	}

	
}
