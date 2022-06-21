package misiontic2022;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id;
        String nombre;
        String documento;
        String cargo;
        String email;
        String[] nomina = new String[5];

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

        nomina[0] = id;
        nomina[1] = nombre;
        nomina[2] = documento;
        nomina[3] = cargo;
        nomina[4] = email;

        System.out.println();

        for (String i : nomina) {
            System.out.println(i);
        }
        sc.close();
    }
}
