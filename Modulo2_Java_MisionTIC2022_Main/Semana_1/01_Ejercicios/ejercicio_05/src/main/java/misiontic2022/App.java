package misiontic2022;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese  su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        NombreEdad(nombre, edad);
    }

    private static void NombreEdad(String nombre, int edad) {
        System.out.println("Hola " + nombre + " tu edad es " + edad + " correcto?");
    }
}