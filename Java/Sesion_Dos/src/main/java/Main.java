public class Main {
    public static void main (String[]args){

    // Crear objeto
    Alumno alumno1 = new Alumno(
            "2026001",
            "Juan",
            "Pérez López",
            "Ingeniería en Sistemas"
    );

    // Mostrar datos
        System.out.println(
                alumno1.obtenerDatos(80, 75, 90)
                );
}
}
