import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String sellerName = scanner.nextLine();
        double fixedSalary = scanner.nextDouble();
        double totalSales = scanner.nextDouble();
        
        double totalSalary = fixedSalary + (totalSales * 0.15);
        
        System.out.printf("TOTAL = R$ %.2f%n", totalSalary);
        
        scanner.close();
    }
}
