package misiontic2022;

public class App {

    private static void Indice(String cadena) {
        int longitud = cadena.length();
        System.out.println("La longitud de la cadena es :" + longitud);
    }

    private static void PosicionCaracter(String cadena) {
        int posicion = cadena.charAt(2);
        System.out.println("Posición de caracter '2':" + posicion);
    }

    private static void CadenaMayuscula(String cadena) {
        String cadenamayuscula = cadena.toUpperCase();
        System.out.println("Devuelve la cadena convertida a mayúsculas: " + cadenamayuscula);
    }

    private static void CadenaMinuscula(String cadena) {
        String cadenaminuscula = cadena.toLowerCase();
        System.out.println("Devuelve la cadena convertida a minúsculas: " + cadenaminuscula);
    }

    public static void main(String[] args) {
        String cadena = "Luis Molero";
        Indice(cadena);
        PosicionCaracter(cadena);
        CadenaMayuscula(cadena);
        CadenaMinuscula(cadena);
    }
}