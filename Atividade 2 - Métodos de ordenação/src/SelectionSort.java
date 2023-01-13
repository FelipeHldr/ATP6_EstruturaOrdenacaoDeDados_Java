public class SelectionSort {
    public static void main(String[] args) {

        int[] vetor = {3, 6, 8, 1, 4, 9, 0};

        System.out.println("Vetor desordenado: ");

        for(int i = 0; i < vetor.length; i++){
            System.out.print(" " + vetor[i]);
        }

        int posicao_menor, aux;
        for(int i = 0; i < vetor.length; i++){
            posicao_menor = i;
            for(int j = i + 1; j < vetor.length; j ++){
                if (vetor[j] < vetor[posicao_menor]){
                    posicao_menor = j;
                }
            }
            aux = vetor[posicao_menor];
            vetor[posicao_menor] = vetor[i];
            vetor[i] = aux;
        }

        System.out.println("\n\nOrdenado: ");
        for(int i = 0; i < vetor.length; i ++){
            System.out.print(" " + vetor[i]);
        }
    }
}
