package misiontic2022;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt();
        Imprimir(numero);
        CicloImpresion(numero);
        sc.close();
    }

    private static void Imprimir(int numero) {
        System.out.println("El número que ingresaste es: " + numero);
    }

    private static void CicloImpresion(int numero) {
        for (int i = 0; i < numero; i++) {
            System.out.println("El For va de i = " + i + " hasta " + numero);
            if (i == numero) {
                System.out.println("Hasta aquí llego el ejercicio");
            }
        }
    }
}