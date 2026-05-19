public class Main {
    public static void main(String[] args) {
        String palavra = "Exemplo";

        mostrarPalavra(palavra);
    }
    public static void mostrarPalavra(String palavra) {
        for (int i = 1; i <= palavra.length(); i++) {
            System.out.println(palavra.substring(0, i));
        }
    }
}
