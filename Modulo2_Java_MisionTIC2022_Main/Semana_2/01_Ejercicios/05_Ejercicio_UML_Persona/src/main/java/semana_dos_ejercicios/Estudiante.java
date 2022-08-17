package semana_dos_ejercicios;

public class Estudiante extends Persona {

    // atributos
    private String carrera;
    private int legajo;

    // constructor
    public Estudiante() {
    }

    // setter
    public void setCarrera(String val) {
        this.carrera = val;
    }

    public void setLegajo(int val) {
        this.legajo = val;
    }

    // getter
    public String getCarrera() {
        return carrera;
    }

    public int getLegajo() {
        return legajo;
    }

}
