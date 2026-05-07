import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor1 = new int[4];
        int[] vetor2 = new int[4];
        int[] vetorSoma = new int[4];

        System.out.println("\n--INFORME O CONTEÚDO DO PRIMEIRO VETOR--\n");

        for (int i = 0; i < vetor1.length; i++){
            System.out.print("Número da posição [" + i + "]: ");
            vetor1[i] = sc.nextInt();
        }

        System.out.println("\n--INFORME O CONTEÚDO DO SEGUNDO VETOR--\n");

        for (int i = 0; i < vetor2.length; i++){
            System.out.print("Número da posição [" + i + "]: ");
            vetor2[i] = sc.nextInt();
        }

        for (int i = 0; i < vetorSoma.length; i++){
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }

        System.out.println("\n--RESULTADO DA SOMA--\n");

        for (int i = 0; i < vetorSoma.length; i++){
            System.out.println("Soma na posição [" + i + "]: " + vetor1[i] +
                    " + " + vetor2[i] + " = " + vetorSoma[i]);
        }
        sc.close();
    }
}
