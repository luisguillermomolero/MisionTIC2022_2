package misiontic2022;

public class App {
    public static void main(String[] args) {
        Colas cola1 = new Colas();
        cola1.insertar(46);
        cola1.insertar(12);
        cola1.insertar(87);
        cola1.insertar(125);
        cola1.insertar(30);
        cola1.extraer();
        cola1.estaVacia();
        cola1.contar();
        System.out.println(cola1.toString());
    }
}