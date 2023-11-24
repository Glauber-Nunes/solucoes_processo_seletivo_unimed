package sequenciadefibonacci;

public class Fibonacci {

	// primeiro e segundo numero da sequencia 
	private int primeiroNumero = 0;
	private int segundoNumero = 1;
	
	//construtor
	public Fibonacci() {
		
	}

	public void imprimirFibonacci(int n) {
		
		// exibe mensagem para o usuario falando quantos numeros serao impressos de acordo com o que o usuario decidir
		System.out.println("Os primeiros " + n + " números da sequência de Fibonacci são:");
		System.out.print(primeiroNumero + ", " + segundoNumero);

		//aqui utilizei Um loop for para gerar os próximos números da sequência e imprimi-los. A cada iteração com a variavel proximoNumero
		for (int i = 2; i < n; i++) {
			int proximoNumero = primeiroNumero + segundoNumero;
			System.out.print(", " + proximoNumero);
			primeiroNumero = segundoNumero;
			segundoNumero = proximoNumero;
		}
	}
}
