import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número:");
        numero = sc.nextInt();

        if (ePar(numero)){
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }
        sc.close();

    }
    public static boolean ePar(int numero){
        return numero % 2 == 0;
    }
}
