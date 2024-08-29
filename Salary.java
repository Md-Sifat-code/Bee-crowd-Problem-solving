import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employeeNumber = scanner.nextInt();
        int workedHours = scanner.nextInt();
        double amountPerHour = scanner.nextDouble();
        
        double salary = workedHours * amountPerHour;
        System.out.println("NUMBER = " + employeeNumber);
        
        System.out.printf("SALARY = U$ %.2f%n", salary);

        scanner.close();
    }
}
