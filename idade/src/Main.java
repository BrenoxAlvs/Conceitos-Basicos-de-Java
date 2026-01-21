import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias, meses, anos;

        System.out.print("Digite quantos anos você tem: ");
        anos = sc.nextInt();

        System.out.print("Digite quantos meses você tem: (Além dos anos) ");
        meses = sc.nextInt();

        System.out.print("Digite quantos dias você tem: (Além dos meses) ");
        dias = sc.nextInt();

        int totalDias = (anos*365) + (meses*30) + dias;

        System.out.println("Você ja viveu aproximadamente: " + totalDias + " dias!");

        sc.close();
    }
}