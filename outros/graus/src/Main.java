import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Digite a temperatura em graus Celsius: ");
        celsius = sc.nextDouble();

        System.out.println();

        fahrenheit = (celsius*9/5)+32;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        sc.close();
    }
}
