public class Main {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = ((i+j)*4)+12;
            }
        }

        System.out.println("Matriz Completa:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }

        System.out.println("\nDiagonal Principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print("[" + matriz[i][i] + "]");
        }
        System.out.println();
    }
}