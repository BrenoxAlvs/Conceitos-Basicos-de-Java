import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hora, minuto, segundo, segundosDiarios;

        System.out.println("Digite a hora atual expressa em horas, minutos e segundos:");

        System.out.print("Horas: ");
        hora = sc.nextInt();

        System.out.print("Minutos: ");
        minuto = sc.nextInt();

        System.out.print("Segundos: ");
        segundo = sc.nextInt();

        System.out.println();

        segundosDiarios = (hora * 3600) + (minuto * 60) + segundo;

        if (hora>23 || minuto>59 || segundo>59){
            System.out.println("Erro! Horário Inválido!");
        }else {
            System.out.println("Já se passaram " + segundosDiarios + " segundos do dia");
        }
        sc.close();
    }
}
