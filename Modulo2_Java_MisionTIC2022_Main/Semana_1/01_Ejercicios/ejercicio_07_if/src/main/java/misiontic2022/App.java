package misiontic2022;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el dividendo: ");
        double dividendo = sc.nextDouble();

        System.out.println("Ingrese el divisor: ");
        double divisor = sc.nextDouble();

        System.out.println(Resultado(dividendo, divisor));
    }

    private static String Resultado(double dividendo, double divisor) {
        if (divisor == 0) {
            return "No se puede dividir por cero";
        } else {
            double Funcion = dividendo / divisor;
            return dividendo + "/" + divisor + " = " + Funcion;
        }
    }

}