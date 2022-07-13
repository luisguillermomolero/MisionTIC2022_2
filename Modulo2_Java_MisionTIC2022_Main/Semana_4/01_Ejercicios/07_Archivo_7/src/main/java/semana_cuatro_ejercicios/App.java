package semana_cuatro_ejercicios;

// El siguiente ejemplo abre un archivo de registro. Si no existe el archivo, se crea. Si el archivo existe, se abre para agregarlo.

import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;

public class App {

  public static void main(String[] args) {

    // Convierte la cadena en una matriz de bytes.
    String s = "Hola Mundo! ";
    byte data[] = s.getBytes();
    Path p = Paths.get("./logfile.txt");

    // Un archivo bytes a bytes desde el BufferedOutputStream quien los conviente de
    // caracteres a bytes
    try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(p, CREATE, APPEND))) {
      // anexar a un archivo existente, crear un archivo si no existe inicialmente
      out.write(data, 0, data.length);
      System.out.print("Archivo creado");
    } catch (IOException x) {
      System.err.println(x);
    }
  }
}
