import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int SOMA = A + B;
        System.out.println("SOMA = " + SOMA);
        scanner.close();
    }
}
