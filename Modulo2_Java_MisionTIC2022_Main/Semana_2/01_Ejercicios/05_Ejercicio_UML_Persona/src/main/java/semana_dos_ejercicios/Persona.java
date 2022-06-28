package semana_dos_ejercicios;

public class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona() {
    }

    // setter
    public void setNombre(String val) {
        this.nombre = val;
    }

    public void setEdad(int val) {
        this.edad = val;
    }

    // getter
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

}
