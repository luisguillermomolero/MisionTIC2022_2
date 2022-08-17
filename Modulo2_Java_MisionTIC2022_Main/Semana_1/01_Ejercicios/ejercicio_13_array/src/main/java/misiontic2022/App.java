package misiontic2022;

import java.util.Scanner;

public class App {

    private static void CargarVector(String id, String nombre, String documento, String cargo, String email) {
        String[] nomina = new String[5];

        nomina[0] = id;
        nomina[1] = nombre;
        nomina[2] = documento;
        nomina[3] = cargo;
        nomina[4] = email;

        for (String i : nomina) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String id;
        String nombre;
        String documento;
        String cargo;
        String email;

        System.out.print("Ingrese Id: ");
        id = sc.nextLine();
        System.out.print("Ingrese Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese documento: ");
        documento = sc.nextLine();
        System.out.print("Ingrese Cargo: ");
        cargo = sc.nextLine();
        System.out.print("Ingrese Email: ");
        email = sc.nextLine();
        System.out.println();
        CargarVector(id, nombre, documento, cargo, email);
        sc.close();
    }
}
