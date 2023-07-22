package ejerciciosclase2;

import java.util.Scanner;
public class circunsferenciaCirculo {
    public static void main(String[] args) {

        final double PI = 3.14159;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el radio del círculo: ");
        double radio = scanner.nextDouble();
        scanner.close();


        double circunferencia = 2 * PI * radio;


        System.out.println("La circunferencia del círculo es: " + circunferencia);
    }
}
