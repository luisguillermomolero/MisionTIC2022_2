package semana_cuatro_ejercicios;

import java.io.*;

public class App {
    public static void main(String arg[]) {
        String línea = null;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader entrada = new BufferedReader(isr);
        // Crea un nuevo PrintWriter a partir de un OutputStream existente.
        PrintWriter  salida = new PrintWriter(System.out, true);
        salida.println("\nEscribe el texto: ");
        try {
            línea = entrada.readLine();
        } catch (Exception e) {
            System.err.println(e);
        }
        salida.println("\nLa línea escrita es: ");
        salida.println(línea);
    }
}