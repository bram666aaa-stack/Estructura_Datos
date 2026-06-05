public class Pastel {

    // Atributos
    String sabor;
    double precio;
    String tamanio;
    int codigo;

    // Método para aplicar descuento del 10%
    public void aplicarDescuento() {
        precio = precio - (precio * 0.10);
    }

    // Método para imprimir datos
    public String imprimirDatos() {
        return "Codigo: " + codigo +
                "\nSabor: " + sabor +
                "\nPrecio: $" + precio +
                "\nTamaño: " + tamanio;
    }
}
