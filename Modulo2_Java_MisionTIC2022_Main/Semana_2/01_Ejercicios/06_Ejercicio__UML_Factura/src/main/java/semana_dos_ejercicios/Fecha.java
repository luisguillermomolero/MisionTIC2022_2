package semana_dos_ejercicios;

public class Fecha {

    // atributos
    private int dia;
    private int mes;
    private int ano;

    // constructores
    public Fecha() {
    }

    public Fecha(int d, int m, int a) {
        setDia(d);
        setMes(m);
        setAno(a);
    }

    // setter
    public void setDia(int val) {
        this.dia = val;
    }

    public void setMes(int val) {
        this.mes = val;
    }

    public void setAno(int val) {
        this.ano = val;
    }

    // getter
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}