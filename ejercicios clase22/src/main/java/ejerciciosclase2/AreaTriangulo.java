package ejerciciosclase2;
import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la longitud de la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingresa la altura del triángulo: ");
        double altura = scanner.nextDouble();
        scanner.close();


        double area = (base * altura) / 2;


        System.out.println("El área del triángulo es: " + area);
    }
}
