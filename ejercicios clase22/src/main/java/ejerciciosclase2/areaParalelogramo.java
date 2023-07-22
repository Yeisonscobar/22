package ejerciciosclase2;
import java.util.Scanner;

public class areaParalelogramo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la longitud de la base del paralelogramo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingresa la altura del paralelogramo: ");
        double altura = scanner.nextDouble();
        scanner.close();


        double area = base * altura;


        System.out.println("El área del paralelogramo es: " + area);
    }
}
