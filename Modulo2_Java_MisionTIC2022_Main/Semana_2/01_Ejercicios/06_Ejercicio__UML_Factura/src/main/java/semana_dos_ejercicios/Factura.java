package semana_dos_ejercicios;

import java.util.*;

public class Factura extends Comprobante {

    // atributos
    private ArrayList<Producto> mProducto;
    private Float total;
    private Cliente mCliente;

    // constructores
    public Factura() {
    }

    public Factura(char t, int n, Fecha f, Cliente cli) {
        super(t, n, f);
        setTotal(0F);
        setCliente(cli);
    }

    // setter
    public void setTotal(Float val) {
        this.total = val;
    }

    public void setCliente(Cliente val) {
        this.mCliente = val;
    }

    public void setProducto(ArrayList<Producto> val) {
        this.mProducto = val;
    }

    // getter
    public Cliente getCliente() {
        return mCliente;
    }

    public Float getTotal() {
        return total;
    }

    public ArrayList<Producto> getProducto() {
        return mProducto;
    }

    // métodos (comportamientos)
    // agregar un nuevo producto al ArrayList
    public void agregarProducto(Producto p) {
        if (mProducto == null) {
            mProducto = new ArrayList<>(); // se instancia un nuevo ArrayList<>();
        }
        mProducto.add(p);
        setTotal(getTotal() + p.getPrecio());
    }

    // Mostrar todos los productos del ArrayList
    public void mostrarProductos() {

        // se recorre el ArrayList con el objeto Iterator
        Iterator<Producto> iterador = mProducto.iterator();

        // muestra todos los productos en el ArrayList mientras hasNext() sea "True"
        while (iterador.hasNext()) {
            Producto p = iterador.next();
            System.out.printf("Codigo: %d Descripcion: %s Precio: %5.2f \n", p.getCodigo(), p.getDescripcion(),
                    p.getPrecio());
        }
    }

    public void mostrar() {
        System.out.printf("\n" + "Tipo: %c Número: %d Fecha: %d/%d/%d\n", getTipo(), getNumero(), getFecha().getDia(),
                getFecha().getMes(), getFecha().getAno());
        System.out.printf("\n" + "Cliente: \n");
        System.out.printf("Codigo: %d Razon Social: %s \n", mCliente.getCodigo(), mCliente.getRazonSocial());
        System.out.printf("\n" + "Productos: \n");
        mostrarProductos();
        System.out.printf("\n" + "Total: %6.2f \n", getTotal());
    }
}