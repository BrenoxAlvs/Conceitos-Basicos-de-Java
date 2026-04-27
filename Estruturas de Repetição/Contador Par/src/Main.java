import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numPar;

        for (numPar = 1; numPar <= 50; numPar++){
            if (numPar % 2 == 0){
                System.out.println(numPar);
            }
        }
        sc.close();
    }
}
