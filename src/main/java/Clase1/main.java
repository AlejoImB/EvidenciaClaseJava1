package Clase1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Donde vives");
        String ciudad= scanner.next();
        System.out.println(ciudad+ " es la mejor Ciudad");

        System.out.println("Cual es tu edad?");
        String edad= scanner.next();
        System.out.println(edad+", estas muy joven");

        System.out.println("Cual es tu estudio?");
        String estudio= scanner.next();
        System.out.println(estudio + " excelente decision");

        System.out.println("digita tu numero de telefono?");
        String telefono= scanner.next();
        System.out.println(telefono+" Numero guardado");

        scanner.close();
    }
}

