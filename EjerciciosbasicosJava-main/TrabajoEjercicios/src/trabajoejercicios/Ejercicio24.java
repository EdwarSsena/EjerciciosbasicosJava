
package trabajoejercicios;

import java.util.Scanner;

public class Ejercicio24 {

public void RegistroBiblioteca() {
    
        Scanner scanner = new Scanner(System.in);
        String acumuladorLibros = "";  // Acumulador de los libros registrados
        boolean continuarRegistrando = true;
        
        System.out.println("Bienvenido a biblioteca leete un libro");
        while (continuarRegistrando) {
            // Solicitar el título del libro
            System.out.print("Ingresa el título del libro: ");
            String titulo = scanner.nextLine();

            // Solicitar el autor del libro
            System.out.print("Ingresa el autor del libro: ");
            String autor = scanner.nextLine();

            // Solicitar el número de páginas del libro
            System.out.print("Ingresa el número de páginas del libro: ");
            int numPaginas = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer del Scanner

            // Agregar la información del libro al acumulador
            acumuladorLibros += "Título: " + titulo + "\nAutor: " + autor + "\nNúmero de páginas: " + numPaginas + "\n\n";

            // Preguntar si el usuario desea seguir registrando libros
            System.out.print("¿Deseas registrar otro libro? (si/no): ");
            String respuesta = scanner.nextLine();

            // Si la respuesta es "no", detener el registro
            if (respuesta.equalsIgnoreCase("no")) {
                continuarRegistrando = false;
            }
        }

        // Mostrar la lista de libros registrados
        System.out.println("\nLista de libros registrados:");
        System.out.println(acumuladorLibros);

        scanner.close();
    }
}
    

