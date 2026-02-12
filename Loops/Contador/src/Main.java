import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int contador = 1;

        System.out.print("Digite um número inteiro menor ou igual à 10 e maior que 0: ");
        num = sc.nextInt();

        System.out.println();

        if (num>10 || num<=0){
            System.out.println("Erro.");
        } else {
            System.out.println("Números inteiros de 1 até " + num + ": ");
            while (contador<=num){
                System.out.println(contador);
                contador++;
            }
        }
        sc.close();
    }
}
