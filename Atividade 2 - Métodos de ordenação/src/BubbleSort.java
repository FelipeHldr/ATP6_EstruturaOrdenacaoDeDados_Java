public class BubbleSort {
    public static void sort(int[] vetor, int n) {
        if (n==1) {
            return;
        }

        for (int j = 0; j < n-1; j++) {
            if (vetor[j] > vetor[j + 1]) {
                int aux = vetor[j];
                vetor[j] = vetor[j+1];
                vetor[j+1] = aux;
            }
        }

        sort(vetor, n-1);
    }

    public static void main(String[] args) {

        int vetor[] = {3, 6, 8, 1, 4, 9, 0};
        sort(vetor, vetor.length);

        for(int i = 0; i < vetor.length; i++) {
            System.out.println(" " + vetor[i]);
        }
    }
}
