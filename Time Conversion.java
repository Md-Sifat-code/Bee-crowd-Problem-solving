import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the total duration in seconds
        int totalSeconds = scanner.nextInt();

        // Calculating hours, minutes, and seconds
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        // Printing the result in hours:minutes:seconds format
        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);
    }
}
