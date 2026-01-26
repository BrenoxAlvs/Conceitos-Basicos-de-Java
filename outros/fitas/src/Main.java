import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdFitas;
        double valorAluguel;

        double fitasAlugadasPorMes;
        double faturamentoAnual;
        double multasPorMes;
        double qtdFitasFinal;

        System.out.println("Informe a quantidade de fitas que uma locadora de vídeo possui e o valor que ela cobra por cada aluguel:");
        System.out.print("Fitas: ");
        qtdFitas = sc.nextInt();
        System.out.print("Valor cobrado por cada aluguel: ");
        valorAluguel = sc.nextDouble();

        System.out.println();

        fitasAlugadasPorMes = qtdFitas/3.0;

        faturamentoAnual = fitasAlugadasPorMes*valorAluguel*12;

        System.out.println("Faturamento Anual: R$ " + faturamentoAnual);

        System.out.println();

        double fitasAtrasadas = fitasAlugadasPorMes/10.0;

        double multa = valorAluguel*0.10;
        multasPorMes = fitasAtrasadas*multa;

        System.out.println("Ganho com multas por mês: R$ " + multasPorMes);

        System.out.println();

        double fitasEstragadas = qtdFitas*0.02;
        double fitasRepostas = qtdFitas/10.0;
        qtdFitasFinal = qtdFitas-fitasEstragadas+fitasRepostas;

        System.out.println("Quantidade de fitas no final do ano: " + (int)qtdFitasFinal);

        sc.close();
    }
}
