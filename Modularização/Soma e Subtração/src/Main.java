import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao, num1, num2;

        System.out.print("---SOMA E SUBTRAÇÃO---");

        System.out.println();

        System.out.println("DIGITE DOIS NÚMEROS:");
        System.out.print("NÚMERO 1: ");
        num1 = sc.nextInt();
        System.out.print("NÚMERO 2: ");
        num2 = sc.nextInt();

        System.out.println("******************************");
        System.out.println("*     DIGITE 1 PARA SOMA     *");
        System.out.println("*   DIGITE 2 PARA SUBTRAÇÃO  *");
        System.out.println("******************************");

        opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("OPERAÇÃO SELECIONADA = SOMA + ");
                soma(num1, num2);
                break;
            case 2:
                System.out.println("OPERAÇÃO SELECIONADA = SUBTRAÇÃO - ");
                subtracao(num1, num2);
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA! TENTE NOVAMENTE.");
        }
        sc.close();
    }
    public static void soma(int num1, int num2){
        int soma;
        soma = num1+num2;
        System.out.println("SOMA = " + soma);
    }
    public static void subtracao(int num1, int num2){
        int subtracao;
        subtracao = num1-num2;
        System.out.println("SUBTRAÇÃO = " + subtracao);
    }
}
