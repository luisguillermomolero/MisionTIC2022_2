package semana_dos_ejercicios;

import java.util.HashMap;

public class App {

  public App() {
    HashMap<Integer, String> Diccionario = new HashMap<>();

    Diccionario.put(924, "Amalia Núñez");
    Diccionario.put(921, "Cindy Nero");
    Diccionario.put(700, "César Vázquez");
    Diccionario.put(219, "Víctor Tilla");
    Diccionario.put(537, "Alan Brito");
    Diccionario.put(605, "Esteban Quito ");

    System.out.println("\nClaves del diccionario: " + Diccionario.keySet());
    System.out.println("Valores del diccionario: " + Diccionario.values());

    int valor1 = 921;
    System.out.println("\nLa clave " + valor1 + " tiene el valor " + Diccionario.get(valor1));

    int valor2 = 700;
    System.out.println("\nLa clave " + valor2 + " tiene el valor " + Diccionario.get(valor2));

    int valor3 = 888;
    System.out.println("\nLa clave " + valor3 + " tiene el valor " + Diccionario.get(valor3));
  }

  public static void main(String[] args) {
    new App();
  }
}