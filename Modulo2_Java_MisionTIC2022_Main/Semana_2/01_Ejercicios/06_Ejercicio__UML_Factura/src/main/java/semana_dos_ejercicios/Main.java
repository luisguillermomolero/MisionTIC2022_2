//Toda factura es un comprobante de venta, que debe poseer una fecha, el tipo de comprobante, un número, datos del cliente, los productos involucrados y un importe total.  En base al precio de los n productos que posee la factura se calcula el total.

package semana_dos_ejercicios;

public class Main {

    public static void main(String[] args) {

        // se instancia un nuevo objeto "fecha" a partir de la clase "Fecha"
        Fecha FechaCompra = new Fecha(20, 04, 2022);

        // se instancian 2 nuevos productos a partir de la clase "Producto"
        Producto producto1 = new Producto(101204, "Cafe molido", (float) 8.5);
        Producto producto2 = new Producto(250241, "Pan campasino", 2);

        // se instancia un nuevo objeto "cliente" a partir de la clase "Cliente"
        Cliente cliente = new Cliente(100001, "Juana Pedrera");

        // se instancia un nuevo objeto "factura" a partir de la clase hija "Factura"
        Factura factura1 = new Factura('F', 254154, FechaCompra, cliente);

        // se agregan nuevos productos al objeto factura creado
        factura1.agregarProducto(producto1);
        factura1.agregarProducto(producto2);
        factura1.mostrar();
    }
}