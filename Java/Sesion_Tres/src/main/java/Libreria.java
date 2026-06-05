import javax.swing.JOptionPane;

public class Libreria {
    public static void main(String[] args) {

        Libro libros[] = new Libro[5];

        int i = -1;

        //AGREGAR LIBROS
        i++;
        libros[i] = new Libro("111", "Java Basico", "Juan Perez", 250);

        i++;
        libros[i] = new Libro("222", "POO en Java", "Maria Lopez", 300);

        i++;
        libros[i] = new Libro("333", "Base de Datos", "Carlos Ruiz", 280);

        //LISTAR LIBROS
        System.out.println("===== LISTA DE LIBROS =====");

        for (int j = 0; j <= i; j++) {

            if (libros[j].isEstatus()) {

                System.out.println("ISBN: " + libros[j].getIsbn());
                System.out.println("Titulo: " + libros[j].getTitulo());
                System.out.println("Autor: " + libros[j].getAutor());
                System.out.println("Precio: " + libros[j].getPrecio());
                System.out.println("--------------------------");
            }
        }

        //BUSCAR LIBRO POR TITULO
        String buscar = JOptionPane.showInputDialog("Ingresa el titulo a buscar");

        boolean encontrado = false;

        for (int j = 0; j <= i; j++) {

            if (libros[j].getTitulo().equalsIgnoreCase(buscar)
                    && libros[j].isEstatus()) {

                System.out.println("===== LIBRO ENCONTRADO =====");
                System.out.println("ISBN: " + libros[j].getIsbn());
                System.out.println("Titulo: " + libros[j].getTitulo());
                System.out.println("Autor: " + libros[j].getAutor());
                System.out.println("Precio: " + libros[j].getPrecio());

                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Libro no encontrado");
        }

        //LISTAR DESPUES DE BUSCAR
        System.out.println("===== LISTA ACTUAL =====");

        for (int j = 0; j <= i; j++) {

            if (libros[j].isEstatus()) {

                System.out.println("ISBN: " + libros[j].getIsbn());
                System.out.println("Titulo: " + libros[j].getTitulo());
                System.out.println("Autor: " + libros[j].getAutor());
                System.out.println("Precio: " + libros[j].getPrecio());
                System.out.println("--------------------------");
            }
        }

        //MODIFICAR LIBRO
        String modificar = JOptionPane.showInputDialog("Titulo del libro a modificar");

        for (int j = 0; j <= i; j++) {

            if (libros[j].getTitulo().equalsIgnoreCase(modificar)
                    && libros[j].isEstatus()) {

                libros[j].setIsbn(
                        JOptionPane.showInputDialog("Nuevo ISBN"));

                libros[j].setTitulo(
                        JOptionPane.showInputDialog("Nuevo titulo"));

                libros[j].setAutor(
                        JOptionPane.showInputDialog("Nuevo autor"));

                libros[j].setPrecio(
                        Double.parseDouble(
                                JOptionPane.showInputDialog("Nuevo precio")));

                System.out.println("Libro modificado correctamente");
            }
        }

        //LISTAR DESPUES DE MODIFICAR
        System.out.println("===== LISTA MODIFICADA =====");

        for (int j = 0; j <= i; j++) {

            if (libros[j].isEstatus()) {

                System.out.println("ISBN: " + libros[j].getIsbn());
                System.out.println("Titulo: " + libros[j].getTitulo());
                System.out.println("Autor: " + libros[j].getAutor());
                System.out.println("Precio: " + libros[j].getPrecio());
                System.out.println("--------------------------");
            }
        }

        //ELIMINACION LOGICA
        String eliminar = JOptionPane.showInputDialog("Titulo del libro a eliminar");

        for (int j = 0; j <= i; j++) {

            if (libros[j].getTitulo().equalsIgnoreCase(eliminar)
                    && libros[j].isEstatus()) {

                libros[j].setEstatus(false);

                System.out.println("Libro eliminado logicamente");
            }
        }

        //LISTAR DESPUES DE ELIMINAR
        System.out.println("===== LISTA FINAL =====");

        for (int j = 0; j <= i; j++) {

            if (libros[j].isEstatus()) {

                System.out.println("ISBN: " + libros[j].getIsbn());
                System.out.println("Titulo: " + libros[j].getTitulo());
                System.out.println("Autor: " + libros[j].getAutor());
                System.out.println("Precio: " + libros[j].getPrecio());
                System.out.println("--------------------------");
            }
        }


        //ELIMINACION FISICA

        String eliminarFisica = JOptionPane.showInputDialog("Titulo del libro a eliminar");

        for (int j = 0; j <= i; j++) {


            if (libros[j].getTitulo().equalsIgnoreCase(eliminarFisica)) {

                //RECORRER ELEMENTOS A LA IZQUIERDA
                for (int k = j; k < i; k++) {

                    libros[k] = libros[k + 1];

                }

                //ULTIMA POSICION EN NULL
                libros[i] = null;

                //DISMINUIR INDICE
                i--;

                System.out.println("Libro eliminado fisicamente");

                break;
            }

        }

        //LISTAR DESPUES DE ELIMINAR
        System.out.println("===== LISTA FINAL =====");

        for (int j = 0; j <= i; j++) {


            System.out.println("ISBN: " + libros[j].getIsbn());
            System.out.println("Titulo: " + libros[j].getTitulo());
            System.out.println("Autor: " + libros[j].getAutor());
            System.out.println("Precio: " + libros[j].getPrecio());
            System.out.println("--------------------------");


        }

    }

}
