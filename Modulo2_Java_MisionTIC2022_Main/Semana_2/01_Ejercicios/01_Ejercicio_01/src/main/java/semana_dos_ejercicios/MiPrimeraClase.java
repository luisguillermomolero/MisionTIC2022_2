package semana_dos_ejercicios;

import java.util.*;

public final class MiPrimeraClase {

    private MiPrimeraClase() {
    }

    private String metodoString(int n) {

        // Se instancia Scnner para capturard datos por teclado
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngrese un número para sumarle a cinco: ");
        int numero = sc.nextInt();

        sc.close();
        return "\nMétodo metodoString. \nEl resultado es: " + (n + numero) + "\n";
    }

    public static void main(String[] args) {

        // Instanciar la clase "MiPrimeraClase" para llamar a sus métodos
        MiPrimeraClase ejemplos = new MiPrimeraClase();
        System.out.print(ejemplos.metodoString(5));
    }
}
