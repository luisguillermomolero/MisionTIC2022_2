package misiontic2022;

public class App {

    private static void ManejoCadena(String str_Sample) {
        String IndiceDeLetra = str_Sample.toUpperCase();
        System.out.print("Índice de caracteres 'x':" + IndiceDeLetra);
    }

    public static void main(String[] args) {
        String str_Sample = "Esta es una cadena";
        ManejoCadena(str_Sample);
    }
}