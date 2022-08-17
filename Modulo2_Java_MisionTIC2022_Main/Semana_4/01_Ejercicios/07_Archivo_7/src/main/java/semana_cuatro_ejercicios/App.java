package semana_cuatro_ejercicios;

import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;

public class App {

    public static void main(String[] args) {

        String s = "Hola Mundo! ";
        byte data[] = s.getBytes();
        Path p = Paths.get("./logfile.txt");

        try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(p, CREATE, APPEND))) {
            // anexar a un archivo existente, crear un archivo si no existe inicialmente
            out.write(data, 0, data.length);
            System.out.print("Archivo creado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
