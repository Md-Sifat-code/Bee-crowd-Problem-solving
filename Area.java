import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        
        double pi = 3.14159;
        
        double areaTriangle = (A * C) / 2.0;
        double areaCircle = pi * Math.pow(C, 2);
        double areaTrapezium = ((A + B) * C) / 2.0;
        double areaSquare = Math.pow(B, 2);
        double areaRectangle = A * B;
        
        System.out.printf("TRIANGULO: %.3f%n", areaTriangle);
        System.out.printf("CIRCULO: %.3f%n", areaCircle);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezium);
        System.out.printf("QUADRADO: %.3f%n", areaSquare);
        System.out.printf("RETANGULO: %.3f%n", areaRectangle);
        
        scanner.close();
    }
}
