package Clase2;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Por favor, introduce el segundo número:");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
            System.out.println(num2 + " es menor que " + num1);
        } else if (num1 < num2) {
            System.out.println(num1 + " es menor que " + num2);
            System.out.println(num2 + " es mayor que " + num1);
        } else {
            System.out.println("Ambos números son iguales");
        }
    }
}
