import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, peso1, peso2, peso3;
        double media;

        System.out.println("Digite sua primeira nota e seu peso:");
        System.out.print("Nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Peso: ");
        peso1 = sc.nextDouble();

        System.out.println();

        System.out.println("Digite sua segunda nota e seu peso:");
        System.out.print("Nota: ");
        nota2 = sc.nextDouble();
        System.out.print("Peso: ");
        peso2 = sc.nextDouble();

        System.out.println();

        System.out.println("Digite sua terceira nota e seu peso:");
        System.out.print("Nota: ");
        nota3 = sc.nextDouble();
        System.out.print("Peso: ");
        peso3 = sc.nextDouble();

        System.out.println();

        media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

        if (media >= 7) {
            System.out.println("Parabéns, você foi aprovado! Sua média final: " + media);
        } else if (media < 4) {
            System.out.println("Sua média final: " + media + ". Reprovado.");
        } else {
            System.out.println("Sua média final: " + media + ". Apto à prova final.");
        }
        sc.close();
    }
}
