public class Main {
    public static void main(String[] args) {

        // Crear objeto
        Pastel p1 = new Pastel();

        // Asignar valores
        p1.codigo = 101;
        p1.sabor = "Chocolate";
        p1.precio = 350;
        p1.tamanio = "Grande";

        // Mostrar datos originales
        System.out.println("DATOS ORIGINALES");
        System.out.println(p1.imprimirDatos());

        // Aplicar descuento
        p1.aplicarDescuento();

        // Mostrar datos con descuento
        System.out.println("\nDESPUES DEL DESCUENTO");
        System.out.println(p1.imprimirDatos());
    }
}
