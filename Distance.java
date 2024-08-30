import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the distance in km
        int distance = scanner.nextInt();

        // Calculating the time in minutes
        int time = 2 * distance;

        // Printing the result with the required format
        System.out.println(time + " minutos");
    }
}
