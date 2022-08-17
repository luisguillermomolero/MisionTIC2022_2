// Declaración de un Map (un HashMap) con clave "Integer" y Valor "String". Las claves pueden ser de cualquier tipo de objetos, aunque los más utilizados como clave son los objetos predefinidos de Java como String, Integer, Double ... !!!!CUIDADO los Map no permiten datos atómicos

package semana_dos_ejercicios;

import java.util.*;

public class App {

  public App() {
    HashMap<Integer, String> Diccionario = new HashMap<>();

    Diccionario.put(924, "Amalia Núñez");
    Diccionario.put(921, "Cindy Nero");
    Diccionario.put(700, "César Vázquez");
    Diccionario.put(219, "Víctor Tilla");
    Diccionario.put(537, "Alan Brito");
    Diccionario.put(605, "Esteban Quito ");

    System.out.println("\nTodas las entradas del diccionario extraídas con entrySet:");

    // entrySet():retorna una vista del mapa como un conjunto de parejas clave-valor
    System.out.println(Diccionario.entrySet());

    System.out.println("\nEntradas del diccionario extraídas una a una:");

    // iterar un mapa
    for (int key : Diccionario.keySet()) {
      System.out.println("Llave: " + key + " Valor: " + Diccionario.get(key));
    }
  }

  public static void main(String[] args) {
    new App();
  }
}
