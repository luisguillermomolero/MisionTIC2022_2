package semana_cuatro_ejercicios;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] numeros = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };
        try {
            File archivo = new File("Numeros.txt");
            PrintWriter salida = new PrintWriter(archivo);
            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros[i].length; j++) {
                    salida.print(numeros[i][j] + ",");
                }
                salida.println("");
            }
            System.out.println("Archivo escrito");
            salida.close();
        } catch (IOException e) {
            System.err.println("Ocurrio un ERROR.");
            e.printStackTrace();
        }
    }
}
