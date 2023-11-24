package palindromo;

import javax.swing.JOptionPane;

public class AppPalindromo {

	public static void main(String[] args) {
		
		String palavra = JOptionPane.showInputDialog("Digite Sua Palavra");
		
		Palindromo palindromo = new Palindromo();
		
		System.out.println("Resultado = " + palindromo.verificaPalindromo(palavra));

	}

}
