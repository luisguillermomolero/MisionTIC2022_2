package misiontic2022;

public class App {

    private static String SonIguales(String cad1, String cad2) {
        if (cad1.equals(cad2)) {
            return "El método equals dice que cad1 es igual a cad2";
        } else {
            return "El método equals dice que cad1 y cad2 no son iguales";
        }
    }

    private static void IgualesIgnorandoMayusculas(String cad1, String cad2) {
        if (cad1.equalsIgnoreCase(cad2)) {
            System.out.println("El método equalsIgnoreCase dice que cad1 es igual a cad2");
        } else {
            System.out.println("El método equalsIgnoreCase dice que cad1 y cad2 no son iguales");
        }
    }

    private static void SonIgualesCompare(String cad1, String cad2) {
        if (cad1.compareTo(cad2) == 0) {
            System.out.println("El método compareTo dice que cad1 es igual a cad2");
        } else if (cad1.compareTo(cad2) < 0) {
            System.out
                    .println("El método compareTo dice que cad1 y cad2 no son iguales. cad1 es menor alfabeticamente");
        } else {
            System.out
                    .println("El método compareTo dice que cad1 y cad2 no son iguales. cad1 es mayor alfabeticamente");
        }
    }

    private static void SonIgualesIgnorandoMayusculas(String cad1, String cad2) {
        if (cad1.compareToIgnoreCase(cad2) == 0) {
            System.out.println("El método compareToIgnoreCase dice que cad1 es igual a cad2");
        } else if (cad1.compareToIgnoreCase(cad2) < 0) {
            System.out.println(
                    "El método compareToIgnoreCase dice que cad1 y cad2 no son iguales. cad1 es menor alfabeticamente");
        } else {
            System.out.println(
                    "El método compareToIgnoreCase dice que cad1 y cad2 no son iguales. cad1 es mayor alfabeticamente");
        }
    }

    public static void Main(String[] args) {

        String cad1 = "castillo";
        String cad2 = "casTillo";

        System.out.println(SonIguales(cad1, cad2));
        IgualesIgnorandoMayusculas(cad1, cad2);
        SonIgualesCompare(cad1, cad2);
        SonIgualesIgnorandoMayusculas(cad1, cad2);
    }
}