public class Main {
    public static void main(String[] args) {
        String palavra = "Exercício";

        mostrarPalavra(palavra);
    }
    public static void mostrarPalavra(String palavra) {
        for (char letra : palavra.toCharArray()){
            System.out.println(letra);
        }
    }
}
