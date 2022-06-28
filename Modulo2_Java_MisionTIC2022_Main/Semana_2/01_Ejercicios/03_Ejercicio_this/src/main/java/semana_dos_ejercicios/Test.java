package semana_dos_ejercicios;

public class Test {
    int Numero1;
    int Numero2;

    // Constructor parametrizado
    public Test(int Numero1, int Numero2) {
        this.Numero1 = Numero1;
        this.Numero2 = Numero2;
    }

    void Mostrar() {
        // Visualización del valor de las variables a y b
        System.out.println("a = " + Numero1 + "  b = " + Numero2);
    }

    public static void main(String[] args) {
        Test object = new Test(10, 20);
        object.Mostrar();
    }
}