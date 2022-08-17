package semana_cuatro_ejercicios;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("Archivo creado: " + myObj.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.err.println("Ocurrio un ERROR.");
            e.printStackTrace();
        }
    }
}