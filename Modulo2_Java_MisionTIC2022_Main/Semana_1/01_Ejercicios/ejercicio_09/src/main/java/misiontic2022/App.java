package misiontic2022;

import java.util.Scanner;

public class App {

    private static void Comparacion(int numero) {
        System.out.println(numero + (numero >= 0 ? " es positivo " : " es negativo "));
        System.out.println(numero + (numero % 2 == 0 ? " es par " : " es impar "));
        System.out.println(numero + (numero % 5 == 0 ? " es múltiplo de 5 " : " no es múltiplo de 5 "));
        System.out.println(numero + (numero % 10 == 0 ? " es múltiplo de 10 " : " no es múltiplo de 10"));
        System.out.println(numero + (numero > 100 ? " es mayor que 100 " : " es menor que 100 "));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt();

        Comparacion(numero);
        sc.close();
    }
}