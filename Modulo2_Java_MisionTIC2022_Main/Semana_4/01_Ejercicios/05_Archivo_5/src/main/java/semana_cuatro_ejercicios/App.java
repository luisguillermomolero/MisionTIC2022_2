package semana_cuatro_ejercicios;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Por favor ingrese su nombre: ");
            String nombre = br.readLine();

            System.out.print("\nBienvenido " + nombre + ". Por favor ingrese su edad: ");
            int edad = Integer.parseInt(br.readLine());
            System.out.println("Gracias " + nombre + " en 10 años usted tendrá " + (edad + 10) + " años.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}