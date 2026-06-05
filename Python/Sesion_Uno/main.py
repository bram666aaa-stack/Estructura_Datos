from Pastel import Pastel

# MAIN
p1 = Pastel()

# Asignar valores
p1.codigo = 101
p1.sabor = "Chocolate"
p1.precio = 350
p1.tamanio = "Grande"

# Mostrar datos originales
print("DATOS ORIGINALES")
print(p1.imprimirDatos())

# Aplicar descuento
p1.aplicarDescuento()

# Mostrar datos con descuento
print("\nDESPUES DEL DESCUENTO")
print(p1.imprimirDatos())