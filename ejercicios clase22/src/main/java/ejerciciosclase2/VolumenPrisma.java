package ejerciciosclase2;
import java.util.Scanner;
public class VolumenPrisma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el área de la base del prisma: ");
        double areaBase = scanner.nextDouble();

        System.out.print("Ingresa la altura del prisma: ");
        double altura = scanner.nextDouble();
        scanner.close();


        double volumen = areaBase * altura;


        System.out.println("El volumen del prisma rectangular es: " + volumen);
    }
}
