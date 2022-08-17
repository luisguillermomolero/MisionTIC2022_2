package misiontic2022;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número ");
        int numero = sc.nextInt();
        System.out.println(NumeroParImpar(numero));
    }

    private static String NumeroParImpar(int numero) {
        int modulo = numero % 2;
        if (modulo == 0) {
            return "El Número par";
        } else {
            return "El Número impar";
        }
    }
}