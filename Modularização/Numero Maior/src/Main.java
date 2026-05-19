public class Main {
    public static void main(String[] args){

        System.out.println("Qual é o maior número entre: | -23- | -39- | -21- | \n-" + encontrarMaior(23, 39, 21) + "-");

    }
    public static int encontrarMaior(int n1, int n2, int n3){
        int maior = n1;

        if (n2 > maior){
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }
        return maior;
    }
}