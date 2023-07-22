package ejerciciosclase2;

import java.util.Scanner;

public class ejercicioclase2 {
    public static void main(String[] args) {

        final double PI = 3.14159;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el radio del círculo: ");
        double radio = scanner.nextDouble();
        scanner.close();


        double area = PI * Math.pow(radio, 2);


        System.out.println("El área del círculo es: " + area);
    }

    }