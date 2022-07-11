//Realice un diagrama de clases en función del registro de personas que a posteriori podrán ser estudiantes o profesores de una institución universitaria (IES).

package semana_dos_ejercicios;

public class App {
    public static void main(String[] args) {

        // clase padre
        Persona persona = new Persona();

        // clases hijos
        Estudiante estudiante = new Estudiante();
        Profesor profesor = new Profesor();

        // creamos un objeto "persona"" a partir de sus 2 atributos "Nombre" y "Edad"
        persona.setNombre("Jose Luis Perez Portillo");
        persona.setEdad(45);

        // creamos un objeto "estudiante" a partir de sus 2 atributos "Carrera" y
        // "Legajo" heredando el atributo "nombre" de "Persona"
        estudiante.setNombre("Carlos Alfonso Roncancio Pardo");
        estudiante.setEdad(21);
        estudiante.setCarrera("Ingeniería de sistemas");
        estudiante.setLegajo(22);

        // creamos un objeto "profesor" a partir de sus 2 atributos "materia" y
        // "cargo" heredando el atributo "nombre" de "Persona"
        profesor.setNombre("Manuel Pepe Grillo");
        profesor.setEdad(46);
        profesor.setMateria("Arquitectura del computador");
        profesor.setCargo("Docente Títular III");

        // salida

        // objeto persona
        System.out.println("\n" + "Objeto de la clase Persona:");
        System.out.println("Nombre: " + persona.getNombre() + " Edad: " + persona.getEdad());

        // objeto estudiante (hijo)
        System.out.println("\n" + "Objeto de la clase Estudiante:");
        System.out.println("Nombre: " + estudiante.getNombre() + estudiante.getEdad() + " Carrera: "
                + estudiante.getCarrera() + " Legajo: "
                + estudiante.getLegajo());

        // objeto profesor (hijo)
        System.out.println("\n" + "Objeto de la clase Profesor:");
        System.out.println("Nombre: " + profesor.getNombre() + profesor.getEdad() + " Materia: " + profesor.getMateria()
                + " Cargo: "
                + profesor.getCargo());
    }
}