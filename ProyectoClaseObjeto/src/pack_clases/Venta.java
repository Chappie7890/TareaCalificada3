package pack_clases;

public class Venta {

    public int numero;
    public String nombreCliente;
    public String nombreProducto;
    public int cantidad;

    public Venta() {

    }

    public Venta(int numero, String nombreCliente, String nombreProducto, int cantidad) {
        this.numero = numero;
        this.nombreCliente = nombreCliente;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
    }

    public double ImporteCompra() {
        if (nombreProducto.equals("TV Led 50 SAMSUNG")) {
            return 2500 * cantidad;
        } else if (nombreProducto.equals("Lavadora LG 15 KG")) {
            return 1200 * cantidad;
        } else if (nombreProducto.equals("Refrigeradora DAEWOO 320 LT")) {
            return 1800 * cantidad;
        } else if (nombreProducto.equals("TV Led 60 LG")) {
            return 2900 * cantidad;
        } else {
            return 0;
        }
    }
}
