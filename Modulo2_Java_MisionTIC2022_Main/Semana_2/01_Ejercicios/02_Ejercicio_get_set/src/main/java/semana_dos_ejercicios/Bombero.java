package semana_dos_ejercicios;

//clase bombero
public final class Bombero {

    // Declaracion de variables (Atributos, propiedades)
    private String nombre;
    private String apellido;
    private int edad;

    // contructor y parametros asignados
    public Bombero() {
    }

    public Bombero(String nombreRecibido, String apellidoRecibido, int edadRecibida) {
        nombre = nombreRecibido;
        apellido = apellidoRecibido;
        edad = edadRecibida;
    }

    // setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // getter
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

}