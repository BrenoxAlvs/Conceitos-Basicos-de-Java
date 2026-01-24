import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioMin, salarioUsuario, salarioMinTotal;

        System.out.print("Digite o valor do salário mínimo: ");
        salarioMin = sc.nextDouble();

        System.out.println();

        System.out.print("Digite o seu salário: ");
        salarioUsuario = sc.nextDouble();

        salarioMinTotal = salarioUsuario / salarioMin;

        System.out.println();

        System.out.println("Você ganha " + salarioMinTotal + " salário(s) mínimo(s).");

        sc.close();
    }
}
