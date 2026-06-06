import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número aleatório: ");
        numero = sc.nextInt();

        while (numero <= 0) {
            System.out.print("\nDigite um número maior que 0. ");
            numero = sc.nextInt();
        }

        System.out.println("\nDivisores de " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}