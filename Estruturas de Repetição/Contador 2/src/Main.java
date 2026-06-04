import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("Digite um número inteiro: ");
        num1 = sc.nextInt();

        System.out.print("\nDigite outro número inteiro: ");
        num2 = sc.nextInt();

        System.out.println();

        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        for (int i = inicio; i <= fim; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}