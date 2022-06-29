package semana_dos_ejercicios;

public class EjemploThis {

    private Integer dato;

    public EjemploThis() {
        this(100);
    }

    public EjemploThis(Integer dato) {
        this.setDato(dato);
    }

    // setter
    public void setDato(Integer dato) {
        this.dato = dato;
    }

    // getter
    public Integer getDato() {
        return this.dato;
    }

    public static void main(String[] args) {
        EjemploThis object = new EjemploThis();
        System.out.println("El dato es: " + object.getDato());
    }
}