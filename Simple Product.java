import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int PROD = A * B;
        System.out.println("PROD = " + PROD);

        scanner.close();
    }
}
