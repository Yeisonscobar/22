package ejerciciosclase2;
import java.util.Scanner;

public class aresEsfera {
    public static void main(String[] args) {

        final double PI = 3.14159;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el radio de la esfera: ");
        double radio = scanner.nextDouble();
        scanner.close();


        double area = 4 * PI * Math.pow(radio, 2);


        System.out.println("El área de la esfera es: " + area);
    }
}
