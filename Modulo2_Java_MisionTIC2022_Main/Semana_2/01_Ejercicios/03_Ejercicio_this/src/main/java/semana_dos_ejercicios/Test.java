package semana_dos_ejercicios;

class Test {
    private int Numero1;
    private int Numero2;

    // Constructor parametrizado

    public Test() {

    }

    public Test(int Numero1Registrado, int Numero2Registrado) {
        this.Numero1 = Numero1Registrado;
        this.Numero2 = Numero2Registrado;
    }

    public int getNumero1() {
        return Numero1;
    }

    public int getNumero2() {
        return Numero2;
    }

    // métodos

    void MostrarRegistro() {
        System.out.println("El número 1 es: " + getNumero1() + " y el número 2 es: " + getNumero2());
    }
}

public final class App {

    public static void main(String[] args) {
        // instancia de la clase Test
        Test object = new Test(10, 20);
        // llamada al método mostrar registro
        object.MostrarRegistro();

        // uso del getter para mostrar el objeto
        System.out.println("El número 1 es: " + object.getNumero1() + " y el número 2 es: " + object.getNumero2());
    }
}