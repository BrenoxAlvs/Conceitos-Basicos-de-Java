import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anos;

        System.out.print("Informe quantos anos de casado: ");
        anos = sc.nextInt();

        System.out.println();

        switch (anos) {
            case 1:
                System.out.println("Bodas de Papel");
                break;
            case 10:
                System.out.println("Bodas de Estanho");
                break;
            case 20:
                System.out.println("Bodas de Porcelana");
                break;
            case 30:
                System.out.println("Bodas de Pérola");
                break;
            case 40:
                System.out.println("Bodas de Esmeralda");
                break;
            case 50:
                System.out.println("Bodas de Ouro");
                break;
            default:
                System.out.println("Não sabemos informar.");
                break;
        }
        sc.close();
    }
}

