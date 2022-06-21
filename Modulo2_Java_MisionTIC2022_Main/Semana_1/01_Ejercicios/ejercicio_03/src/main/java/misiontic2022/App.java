package misiontic2022;

import java.util.Scanner;

public class App {

    private static void Imprimir(int numero) {
        System.out.println("El número que ingresastes es: " + numero);
    }

    private static void CicloImprimir(int numero) {
        for (int i = 0; i <= numero; i++) {
            System.out.println("El ciclo For va desde i = " + i + " hasta " + numero);
            if (i == numero) {
                System.out.println("Hasta aquí llegó el ejercicio");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, ingrese un número: ");
        int numero = sc.nextInt();
        Imprimir(numero);
        CicloImprimir(numero);
        sc.close();
    }
}