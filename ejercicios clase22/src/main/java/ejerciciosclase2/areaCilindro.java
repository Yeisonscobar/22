package ejerciciosclase2;
import java.util.Scanner;
public class areaCilindro {
    public static void main(String[] args) {

        final double PI = 3.14159;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el radio de la base del cilindro: ");
        double radio = scanner.nextDouble();

        System.out.print("Ingresa la altura del cilindro: ");
        double altura = scanner.nextDouble();
        scanner.close();


        double volumen = PI * Math.pow(radio, 2) * altura;


        System.out.println("El volumen del cilindro es: " + volumen);
    }
}
