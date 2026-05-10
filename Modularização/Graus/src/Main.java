import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("\nInforme a temperatura em graus Celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = celsiusParaFarenheit(celsius);
        System.out.print("\nA temperatura em Fahrenheit é: " + fahrenheit + "\n");

        sc.close();
    }
    public static double celsiusParaFarenheit(double celsius){
        return (celsius * 1.8) + 32;
    }
}