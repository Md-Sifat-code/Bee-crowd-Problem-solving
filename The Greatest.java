import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three integer values from the input
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Find the greatest value
        int greatest = Math.max(a, Math.max(b, c));

        // Print the result
        System.out.println(greatest + " eh o maior");

        scanner.close();
    }
}
