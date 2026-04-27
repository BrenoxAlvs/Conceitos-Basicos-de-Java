import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, n4;
        double media;

        System.out.println("Digite sua primeira nota: ");
        n1 = sc.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        n2 = sc.nextDouble();
        System.out.println("Digite sua terceira nota: ");
        n3 = sc.nextDouble();
        System.out.println("Digite sua quarta nota: ");
        n4 = sc.nextDouble();

        media = (n1+n2+n3+n4)/4;

        if (media>=7){
            System.out.println("Parabéns, você foi aprovado!");
        }else {
            System.out.println("Infelizmente você foi reprovado.");
        }
        sc.close();
    }
}