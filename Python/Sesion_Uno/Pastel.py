class Pastel:

    # Atributos
    sabor = ""
    precio = 0
    tamanio = ""
    codigo = 0

    # Método para aplicar descuento del 10%
    def aplicarDescuento(self):
        self.precio = self.precio - (self.precio * 0.10)

    # Método para imprimir datos
    def imprimirDatos(self):
        return (
            f"Codigo: {self.codigo}\n"
            f"Sabor: {self.sabor}\n"
            f"Precio: ${self.precio}\n"
            f"Tamaño: {self.tamanio}"
        )