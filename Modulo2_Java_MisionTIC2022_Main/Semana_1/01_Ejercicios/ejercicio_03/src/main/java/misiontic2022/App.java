package misiontic2022;

import java.util.Scanner;

public class App {

    private static void Imprimir(int numero) {
        System.out.println("El número ingresado fue: " + numero + "\n");
    }

    private static void ImprimirConForIf(int numero) {
        for (int i = 0; i <= numero; i++) {
            System.out.println("E ciclo For va desde i = " + i + " hasta " + numero);
            if (i == numero) {
                System.out.println("\n" + "Hasta aquí llego el ciclo For");
                break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, ingrese un número: ");
        int numero = sc.nextInt();
        Imprimir(numero);
        ImprimirConForIf(numero);
    }
}