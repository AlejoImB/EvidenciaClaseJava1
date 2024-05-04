import java.util.Scanner;

public class arreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] edades = new int[5];
        int suma = 0;

        System.out.println("Por favor, introduce la edad del estudiante 1:");
        edades[0] = scanner.nextInt();
        suma += edades[0];

        System.out.println("Por favor, introduce la edad del estudiante 2:");
        edades[1] = scanner.nextInt();
        suma += edades[1];

        System.out.println("Por favor, introduce la edad del estudiante 3:");
        edades[2] = scanner.nextInt();
        suma += edades[2];

        System.out.println("Por favor, introduce la edad del estudiante 4:");
        edades[3] = scanner.nextInt();
        suma += edades[3];

        System.out.println("Por favor, introduce la edad del estudiante 5:");
        edades[4] = scanner.nextInt();
        suma += edades[4];

        double promedio = suma / 5.0;
        System.out.println("El promedio de edad de los 5 estudiantes es: " + promedio);
    }
}