import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        System.out.print("---SISTEMA DE NOTAS DO ALUNO---");

        System.out.println();
        System.out.println();

        System.out.println("INFORME AS TRÊS NOTAS DE UM ALUNO");

        System.out.println();

        System.out.print("NOTA 1: ");
        nota1 = sc.nextDouble();
        while (nota1>10||nota1<0){
            System.out.println("---NOTA INVÁLIDA. DIGITE UM VALOR ENTRE 0 E 10---");
            System.out.print("NOTA 1: ");
            nota1 = sc.nextDouble();
        }

        System.out.print("NOTA 2: ");
        nota2 = sc.nextDouble();
        while (nota2>10||nota2<0) {
            System.out.println("---NOTA INVÁLIDA. DIGITE UM VALOR ENTRE 0 E 10---");
            System.out.print("NOTA 2: ");
            nota2 = sc.nextDouble();
        }

        System.out.print("NOTA 3: ");
        nota3 = sc.nextDouble();
        while (nota3>10||nota3<0){
            System.out.println("---NOTA INVÁLIDA. DIGITE UM VALOR ENTRE 0 E 10---");
            System.out.print("NOTA 3: ");
            nota3 = sc.nextDouble();
        }

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println();

        System.out.println("A MÉDIA DO ALUNO FOI: " + media);

        if (media>=6 && media<=10){
            System.out.println("---VOCÊ FOI APROVADO---");
        } else if (media<6 && media>=0) {
            System.out.println("---VOCÊ FOI REPROVADO---");
        } else {
            System.out.println("---ERRO---");
        }
        sc.close();
    }
}
