package misiontic2022;

import java.util.Scanner;

public class App {

    private static double Conversion1(double gcentigrados) {
        double Fahrenheit = 32 + (9 * gcentigrados / 5);
        return Fahrenheit;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca los grados Centígrados:");
        double gcentigrados = sc.nextDouble();
        Conversion1(gcentigrados);
        System.out.println(gcentigrados + " ºC = " + Conversion1(gcentigrados) + " ºF ");
        /* ImprimirConversion(gcentigrados, Fahrenheit); */
        sc.close();
    }
}