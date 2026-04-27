import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome;
        int centimetros, tipoTatuagem, custoCentimetros;

        System.out.println("===========================");
        System.out.println("  ESTÚDIO BNX - ORÇAMENTO  ");
        System.out.println("===========================");

        System.out.println();

        System.out.println("Nome Completo:");
        nome = sc.nextLine();

        System.out.println("Tamanho da Tatuagem em Centímetros:");
        centimetros = sc.nextInt();

        System.out.println("Tatuagem Colorida ou Preta/Cinza: (Digite 1 para Colorida ou 2 para Preta/Cinza)");
        tipoTatuagem = sc.nextInt();

        System.out.println();

        System.out.println("CALCULANDO...");

        System.out.println();

        System.out.println("===========================");
        System.out.println("       RECIBO FINAL        ");
        System.out.println("===========================");

        System.out.println();

        if (tipoTatuagem==1){
            custoCentimetros = centimetros*25+80;

            System.out.println("Cliente: " + nome);
            System.out.println("Tamanho da Tattoo: " + centimetros + "cm");
            System.out.println("Estilo da Tattoo: Colorida");
            System.out.println("Valor Total Estimado: " + custoCentimetros + "R$");

        } else if (tipoTatuagem==2){
            custoCentimetros = centimetros*25;

            System.out.println("Cliente: " + nome);
            System.out.println("Tamanho da Tattoo: " + centimetros + "cm");
            System.out.println("Estilo da Tattoo: Preta/Cinza");
            System.out.println("Valor Total Estimado: " + custoCentimetros + "R$");
        }
        sc.close();
    }
}
