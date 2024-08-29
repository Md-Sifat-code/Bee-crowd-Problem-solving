import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading four integer values A, B, C, and D
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int DIFERENCA = (A * B) - (C * D);
        System.out.println("DIFERENCA = " + DIFERENCA);
        scanner.close();
    }
}