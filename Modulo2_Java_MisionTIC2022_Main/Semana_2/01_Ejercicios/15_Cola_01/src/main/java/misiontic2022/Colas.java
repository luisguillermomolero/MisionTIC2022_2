package misiontic2022;

public class Colas {
    // Declaración de atributos
    private Nodo inicio;
    private Nodo termino;

    // Constructor sin parametros
    public Colas() {
        inicio = null;
        termino = null;
    }

    // Metodo insertar
    public void insertar(int dato) {
        Nodo i = new Nodo(dato);
        i.setNext(null);
        if (inicio == null & termino == null) {
            inicio = i;
            termino = i;
        }
        termino.setNext(i);
        termino = termino.getNext();
    }

    // Metodo extraer dato
    public int extraer() {
        int dato = inicio.getDato();
        inicio = inicio.getNext();
        return dato;
    }

    // Metodo para comprobar que la cola no esta vacia
    public boolean estaVacia() {
        boolean cola = false;
        if (inicio == null & termino == null) {
            cola = true;
            System.out.println("La cola esta vacia");
        } else {
            System.out.println("La cola no esta vacia");
            cola = false;
        }
        return cola;
    }

    // Metodo para contar los elementos de la cola
    public int contar() {
        int contador = 0;
        Nodo c = this.inicio;
        while (c != null) {
            contador++;
            c = c.getNext();
        }
        System.out.println("Numero de datos en la cola: " + contador);
        return contador;
    }

    // Metodo toString
    public String toString() {
        Nodo c = this.inicio;
        String s = "";
        while (c != null) {
            s = s + c.toString();
            c = c.getNext();
        }
        return s;
    }
}