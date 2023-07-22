package ejerciciosclase2;
import java.util.Scanner;

public class VolumenPiramide {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la longitud de la base de la pirámide: ");
        double base = scanner.nextDouble();

        System.out.print("Ingresa la altura de la pirámide: ");
        double altura = scanner.nextDouble();
        scanner.close();


        double volumen = (base * altura) / 3;


        System.out.println("El volumen de la pirámide cuadrada es: " + volumen);
    }
}
