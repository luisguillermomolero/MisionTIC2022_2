package semana_dos_ejercicios;

public class App {
    public static void main(String[] args) {
        Bombero bombero = new Bombero("Luis", "Molero", 45);
        System.out
                .println("Registro: \nNombre: " + bombero.getNombre() + "\nApellido: " + bombero.getApellido()
                        + "\nEdad: " + bombero.getEdad());
    }
}