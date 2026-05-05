import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome;
        int horario;

        System.out.println("Qual o seu nome?");
        nome = sc.nextLine();

        System.out.println("Qual o horário atual?");
        horario = sc.nextInt();

        System.out.println();

        exibirSaudacao(nome, horario);
    }

    public static void exibirSaudacao(String nome, int horario){
        if (horario >= 5 && horario <= 12){
            System.out.println("Bom dia, " + nome + "!");
        } else if (horario >= 13 && horario <= 18){
            System.out.println("Boa tarde, " + nome + "!");
        } else {
            System.out.println("Boa noite, " + nome + "!");
        }
    }
}
