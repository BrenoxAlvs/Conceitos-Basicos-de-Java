public class Main {
    public static void main(String[] args) {
        int[] numeros = {19, 20, 30, 35, 23};
        int quantidadeElementos = 5;

        System.out.println("\nO conteúdo do vetor é: {19, 20, 30, 35, 23}\n");

        encontrarMaior(numeros, quantidadeElementos);

    }
    public static void encontrarMaior(int[] vetor, int tamanho){
        int posicaoMaior = 0;

        for (int i = 1; i < tamanho; i++){
            if (vetor[i] > vetor[posicaoMaior]){
                posicaoMaior = i;
            }
        }
        System.out.println("O maior número está na posição: " + posicaoMaior);
    }
}
