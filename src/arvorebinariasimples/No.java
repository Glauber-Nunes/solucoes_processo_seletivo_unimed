package arvorebinariasimples;

public class No {

    int valor;
    No esquerda, direita;

    public No(int valor) {
        this.valor = valor;
        this.esquerda = this.direita = null;
    }
}
