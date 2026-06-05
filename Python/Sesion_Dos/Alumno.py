# Clase Alumno
class Alumno:

    # Constructor
    def __init__(self, matricula, nombre, apellidos, carrera):
        # Atributos privados
        self.__matricula = matricula
        self.__nombre = nombre
        self.__apellidos = apellidos
        self.__carrera = carrera

    # Método privado para calcular promedio
    def __calcular_promedio(self, cal1, cal2, cal3):
        return (cal1 + cal2 + cal3) / 3

    # Método privado para determinar estatus
    def __estatus(self, cal1, cal2, cal3):

        promedio = self.__calcular_promedio(cal1, cal2, cal3)

        if promedio >= 70:
            return "Aprobó"
        else:
            return "Reprobó"

    # Método público para obtener todos los datos
    def obtener_datos(self, cal1, cal2, cal3):

        promedio = self.__calcular_promedio(cal1, cal2, cal3)

        return (
            f"Matrícula: {self.__matricula}\n"
            f"Nombre: {self.__nombre}\n"
            f"Apellidos: {self.__apellidos}\n"
            f"Carrera: {self.__carrera}\n"
            f"Promedio: {promedio}\n"
            f"Estatus: {self.__estatus(cal1, cal2, cal3)}"
        )