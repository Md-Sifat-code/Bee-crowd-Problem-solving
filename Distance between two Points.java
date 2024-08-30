import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the first point coordinates
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        // Reading the second point coordinates
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Calculating the distance between the two points
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Printing the distance with four decimal places
        System.out.printf("%.4f\n", distance);
    }
}
