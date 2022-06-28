package misiontic2022;

import java.util.Scanner;

public class App {

    private static void ImprimirNombreEdad(String Nombre, int Edad) {
        System.out.println("Hola estimado " + Nombre + " me contaron que tienes " + Edad + " años, es cierto???");
    }

    public static void main(String[] args) {

        // String Nombre;
        // int Edad;
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, ingrese su nombre: ");
        String Nombre = sc.nextLine();
        System.out.println("Por favor, ingrese su edad: ");
        int Edad = sc.nextInt();
        ImprimirNombreEdad(Nombre, Edad);
        sc.close();
    }
}