public class Alumno {


    // Atributos privados
    private String matricula;
    private String nombre;
    private String apellidos;
    private String carrera;

    // Constructor público
    public Alumno(String matricula, String nombre, String apellidos, String carrera) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.carrera = carrera;
    }

    // Método privado para calcular promedio
    private double calcularPromedio(double cal1, double cal2, double cal3) {
        return (cal1 + cal2 + cal3) / 3;
    }

    // Método privado para determinar estatus
    private String estatus(double cal1, double cal2, double cal3) {

        double promedio = this.calcularPromedio(cal1, cal2, cal3);

        if (promedio >= 70) {
            return "Aprobó";
        } else {
            return "Reprobó";
        }
    }

    // Método público para obtener todos los datos
    public String obtenerDatos(double cal1, double cal2, double cal3) {

        double promedio = this.calcularPromedio(cal1, cal2, cal3);

        return "Matrícula: " + matricula +
                "\nNombre: " + nombre +
                "\nApellidos: " + apellidos +
                "\nCarrera: " + carrera +
                "\nPromedio: " + promedio +
                "\nEstatus: " + this.estatus(cal1, cal2, cal3);
    }
}
