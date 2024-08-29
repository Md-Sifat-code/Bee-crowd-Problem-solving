import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading two integer inputs A and B
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        // Calculating the sum of A and B
        int X = A + B;
        
        // Printing the result in the required format
        System.out.println("X = " + X);
        
        // Closing the scanner
        scanner.close();
    }
}