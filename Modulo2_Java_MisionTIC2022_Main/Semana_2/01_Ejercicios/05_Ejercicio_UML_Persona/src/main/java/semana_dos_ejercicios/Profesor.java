package semana_dos_ejercicios;

public class Profesor extends Persona {

    // atributos
    private String materia;
    private String cargo;

    // consturtor
    public Profesor() {
    }

    public void setMateria(String val) {
        this.materia = val;
    }

    public void setCargo(String val) {
        this.cargo = val;
    }

    // getter
    public String getMateria() {
        return materia;
    }

    public String getCargo() {
        return cargo;
    }
}
