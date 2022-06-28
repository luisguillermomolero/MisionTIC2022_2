package misiontic2022;

public class Nodo {
    // Declaracion de atributos
    private int dato;
    private Nodo next;

    // Constructor
    public Nodo(int dato) {
        this.dato = dato;
    }

    // setter
    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    // getter
    public int getDato() {
        return dato;
    }

    public Nodo getNext() {
        return next;
    }

    // Metodo toString
    public String toString() {
        String s = " " + dato + " ";
        return s;
    }
}