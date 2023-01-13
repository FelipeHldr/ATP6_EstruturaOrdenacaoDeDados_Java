public class Lista {

    private No primeiro = null;

    public Lista() {
        primeiro = null;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public boolean vazia() {
        return primeiro == null;
    }


    public void inserePrimeiro(int valor) {
        No novoNo = new No(valor);
        novoNo.setValor(valor);
        novoNo.setProximo(primeiro);
        primeiro = novoNo;
    }

    public void insereDepois(No nodo, int valor) {
        No novo = new No(valor);
        novo.setProximo(nodo.getProximo());
        nodo.setProximo(novo);
    }

    public void insereUltimo(int valor) {
        if (vazia()) {
            inserePrimeiro(valor);
        } else {
            No posicao = primeiro;
            while (posicao.getProximo() != null) {
                posicao = posicao.getProximo();
            }
            No novo = new No(valor);
            posicao.setProximo(novo);
        }
    }

    public No removePrimeiro() {
        if (vazia()) {
            System.out.println("Lista vazia!");
            return null;
        } else {
            No posicao = primeiro;
            primeiro = primeiro.getProximo();
            return posicao;
        }
    }

    public No removeUltimo() {
        if (vazia()) {
            System.out.println("Lista vazia");
            return null;
        }
        No anterior = null;
        No posicao = primeiro;

        while (posicao.getProximo() != null) {
            anterior = posicao;
            posicao = posicao.getProximo();
        }

        anterior.setProximo(null);
        return posicao;
    }

    public void removeDepois(No nodo) {
        if (vazia()) {
            System.out.println("Lista vazia!");

        } else {
            No anterior = null;
            No posicao = primeiro;

            while (posicao.getProximo() != null){
                anterior = posicao;
                posicao = posicao.getProximo();

                if (posicao.equals(nodo)) {
                    anterior.setProximo(posicao.getProximo());
                }
            }
        }
    }

    public void mostrar() {
        No auxiliar = primeiro;
        while (auxiliar != null){
            System.out.print(auxiliar.getValor() + ", ");
            auxiliar = auxiliar.getProximo();
        }
    }
}
