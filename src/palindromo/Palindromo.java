package palindromo;

public class Palindromo {

      public Palindromo() {
    	  
      }
      
      public boolean verificaPalindromo(String palavra) {
          // retira espaços e converte para minúsculas para tornar a comparação insensível a maiúsculas/minúsculas
          String palavraTratada = palavra.replaceAll("\\s", "").toLowerCase();

          // Comparação dos caracteres da palavra original e da palavra invertida
          int comprimento = palavraTratada.length();
          for (int i = 0; i < comprimento / 2; i++) {
              if (palavraTratada.charAt(i) != palavraTratada.charAt(comprimento - i - 1)) {
            	
                  return false; // Não é um palíndromo
              }
          }

       
          return true; // retornou true é um palíndromo
      }      
}
