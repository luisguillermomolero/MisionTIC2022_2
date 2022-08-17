package misiontic2022;

import java.util.Scanner;

public class App {

    private static void Suma(int numero1, int numero2) {
        /* int sumatoria = numero1 + numero2; */
        System.out.println("El resultado de la suma es:" + (numero1 + numero2));
    }

    private static void Resta(int numero1, int numero2) {
        System.out.println("El resultado de la suma es:" + (numero1 - numero2));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese otro número: ");
        int numero2 = sc.nextInt();
        Suma(numero1, numero2);
        Resta(numero1, numero2);
        sc.close();
    }
}