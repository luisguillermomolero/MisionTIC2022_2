package misiontic2022;

import java.io.*;

public class Colas {

    public static class ClaseColas { // Declaracion de la clase de Colas
        static int max = 10; // Tamano maximo de la Cola
        static int cola[] = new int[max]; // Declaracion del arreglo
        static int frente, fin; // Indicadores de inicio y fin de la Cola

        ClaseColas() { // Constructor que inicializa el frente y el final de la Cola
            frente = 0;
            fin = 0;
            System.out.println("Cola inicializada !!!");
        }

        public static void Insertar(int dato) {
            if (fin == max) { // Esta llena la Cola?
                System.out.println("\nCola llena !!!");
                return;
            }
            cola[fin++] = dato;
            System.out.println("Dato insertado !!!");
        }

        public static void Eliminar() {
            System.out.println("\n\n<<< ELIMINAR >>>");
            if (frente == fin) { // Esta vacia la Cola?
                System.out.println("\nCola vacia !!!");
                return;
            }
            System.out.println("Elemento eliminado: " + cola[frente++]);
        }

        public static void Mostrar() {
            int i = 0;
            System.out.println("\n\n<<< MOSTRAR >>>");
            if (frente == fin)
                System.out.println("\nCola vacia !!!");
            for (i = frente; i < fin; i++) {
                System.out.println("cola[" + i + "]=" + " " + cola[i]);
            }
            System.out.println("\nFrente= " + frente);
            System.out.println("Final = " + fin);
            System.out.println("Max  = " + max);
        }
    }

    static ClaseColas Cola = new ClaseColas(); // Declaracion del objeto Cola

    // Funcion principal
    public static void main(String args[]) throws IOException {
        int op = 0;
        do {
            System.out.println("\n\n<<< COLAS >>>");
            System.out.println("1.- Altas");
            System.out.println("2.- Eliminar");
            System.out.println("3.- Mostrar");
            System.out.println("0.- Salir");
            System.out.print("Opcion? ---> ");
            op = getInt();

            switch (op) {
                case 1:
                    Altas();
                    break;
                case 2:
                    ClaseColas.Eliminar();
                    break;
                case 3:
                    ClaseColas.Mostrar();
                    break;
            }
        } while (op != 0);
    }

    public static void Altas() throws IOException {
        int elemento = 0;
        System.out.println("\n\n<<< ALTAS >>>");
        System.out.print("Elemento a insertar? ---> ");
        elemento = getInt();
        ClaseColas.Insertar(elemento); // Invocar el metodo Insertar del objeto Cola
    }

    // Funcion para capturar una cadena desde el teclado
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    // Funcion para capturar un entero desde el teclado
    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}