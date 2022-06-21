package misiontic2022;

class Usocadenas {

    public void Indice(String cadena) {
        int longitud = cadena.length();
        System.out.println("La longitud de la cadena es :" + longitud);
    }

    public void PosicionCaracter(String cadena) {
        int posicion = cadena.charAt(2);
        System.out.println("Posición de caracter '2':" + posicion);
    }

    public void CadenaMayuscula(String cadena) {
        String cadenamayuscula = cadena.toUpperCase();
        System.out.println("Devuelve la cadena convertida a mayúsculas: " + cadenamayuscula);
    }

    public void CadenaMinuscula(String cadena) {
        String cadenaminuscula = cadena.toLowerCase();
        System.out.println("Devuelve la cadena convertida a minúsculas: " + cadenaminuscula);
    }

}

public class App {
    public static void main(String[] args) {
        String cadena = "Luis Molero";
        Usocadenas usocadenass = new Usocadenas();
        usocadenass.Indice(cadena);
        usocadenass.PosicionCaracter(cadena);
        usocadenass.CadenaMayuscula(cadena);
        usocadenass.CadenaMinuscula(cadena);
    }
}