// Desarrolle un programa que elimine las cadenas duplicadas de un objeto "List", haciendo uso del objeto HashSet.

package semana_dos_ejercicios;

import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class PruebaSet {

    // definimos nuestro arreglo
    private String colores[] = { "rojo", "blanco", "azul", "Amarillo", "rojo", "blanco", "azul", "verde" };

    public PruebaSet() {
        // me convierte de un arreglo a un serializable (colección)
        List<String> lista = Arrays.asList(colores);
        System.out.printf("\nArrayList: %s \n", lista);
        imprimirSinDuplicados(lista);
    }

    private void imprimirSinDuplicados(Collection<String> coleccion) {
        Set<String> conjunto = new HashSet<String>(coleccion);
        System.out.println("\nLos valores sin duplicados son: ");

        for (String string : conjunto) {
            System.out.println(string);
        }
    }

    public static void main(String args[]) {
        new PruebaSet();
    }
}