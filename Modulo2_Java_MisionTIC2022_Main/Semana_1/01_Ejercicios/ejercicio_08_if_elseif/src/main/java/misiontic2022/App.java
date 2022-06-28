package misiontic2022;

import java.util.Scanner;

public class App {

    private static String Comparacion(int numero1, int numero2, int numero3) {
        if (numero1 > numero2) {
            if (numero1 > numero3) {
                return "El mayor es: " + numero1;
            } else {
                return "el mayor es: " + numero3;
            }
        } else if (numero2 > numero3) {
            return "el mayor es: " + numero2;
        } else {
            return "el mayor es: " + numero3;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número ");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese el primer número ");
        int numero2 = sc.nextInt();
        System.out.println("Ingrese el primer número ");
        int numero3 = sc.nextInt();

        System.out.println(Comparacion(numero1, numero2, numero3));
        sc.close();
    }
}