import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double despesas, valorTotal;

        System.out.print("Informe o valor gasto com despesas: ");
        despesas = sc.nextDouble();

        System.out.println();

        valorTotal = despesas*1.10;

        System.out.println("O valor total com a gorjeta ficou: R$" + valorTotal);

        sc.close();
    }
}
