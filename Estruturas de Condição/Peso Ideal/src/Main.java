import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, pesoIdeal;
        char sexo;

        System.out.println("Digite seu gênero: (M para Homem - F para Mulher)");
        sexo = sc.next().toUpperCase().charAt(0);

        System.out.println("Digite sua altura:");
        altura = sc.nextDouble();

        switch (sexo){
            case 'M':
                pesoIdeal = (72.7 * altura) - 58;
                System.out.printf("Seu peso ideal é: %.2f kg\n" , pesoIdeal);
                break;
            case 'F':
                pesoIdeal = (62.1 * altura) - 44.7;
                System.out.printf("Seu peso ideal é: %.2f kg\n" , pesoIdeal);
                break;
            default:
                System.out.println("Erro: Gênero não reconhecido. Use 'M' ou 'F'.");
        }
        sc.close();
    }
}