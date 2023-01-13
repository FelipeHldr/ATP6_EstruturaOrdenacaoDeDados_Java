public class Main {

    public static void main(String[] args) {

        Lista lista = new Lista();

        System.out.println(lista.vazia());

        lista.inserePrimeiro(70);
        lista.inserePrimeiro(80);
        lista.inserePrimeiro(90);
        lista.inserePrimeiro(100);

        No meio = lista.getPrimeiro().getProximo().getProximo().getProximo();
        lista.insereDepois(meio, 6);
        lista.insereDepois(meio, 5);
        lista.insereDepois(meio, 4);

        lista.insereUltimo(10);
        lista.insereUltimo(20);
        lista.insereUltimo(30);
        lista.insereUltimo(40);

        lista.removePrimeiro();

        lista.removeDepois(lista.getPrimeiro().getProximo().getProximo().getProximo());

        lista.removeUltimo();

        System.out.println(lista.vazia());

        lista.mostrar();
    }
}
