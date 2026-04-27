import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anos;

        System.out.print("Informe quantos anos de casado: ");
        anos = sc.nextInt();

        System.out.println();

        if (anos == 1){
            System.out.println("Bodas de Papel");
        } else if (anos == 10){
            System.out.println("Bodas de Estanho");
        } else if (anos == 20){
            System.out.println("Bodas de Porcelana");
        } else if (anos == 30){
            System.out.println("Bodas de Pérola");
        } else if (anos == 40){
            System.out.println("Bodas de Esmeralda");
        } else if (anos == 50){
            System.out.println("Bodas de Ouro");
        } else {
            System.out.println("Não sei informar.");
        }
        sc.close();
    }
}

