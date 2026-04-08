import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Digite um número inteiro: ");
        n = sc.nextInt();

        do {
            System.out.print(n + " ");
            n = n-2;
        }while (n>=0);

        sc.close();
    }
}