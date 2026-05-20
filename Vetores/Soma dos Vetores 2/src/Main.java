public class Main {
    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetor2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int[] vetorSoma = somaVetor(vetor1, vetor2);

        for (int i = 0; i < vetorSoma.length; i++) {
            System.out.println("Soma na posição [" + i + "]: " +
                    vetor1[i] + " + " + vetor2[i] + " = " + vetorSoma[i]);
        }
    }
    public static int[] somaVetor(int[] vetor1, int[] vetor2) {
        int[] resultado = new int[10];

        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = vetor1[i] + vetor2[i];
        }
        return resultado;
    }
}