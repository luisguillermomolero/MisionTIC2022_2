package misiontic2022;

public class App {

    public static void main(String[] args) {
        String str_Sample = "Esta es una cadena";
        ManejoCadena(str_Sample);
    }

    private static void ManejoCadena(String str_Sample) {
        String IndiceDeLetra = str_Sample.toUpperCase();
        System.out.print("Índice de cara cteres 'x':" + IndiceDeLetra);
    }
}