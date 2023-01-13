public class No {
    private int valor;
    private No proximo;

    public No(int valor){
        this.valor = valor;
        this.proximo = null;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(int info) {
        this.valor = info;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}


