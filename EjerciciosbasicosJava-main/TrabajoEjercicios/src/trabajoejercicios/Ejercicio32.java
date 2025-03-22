
package trabajoejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio32 {

class Contacto {
    String nombre;
    String numeroTelefono;

    // Constructor para inicializar el contacto
    public Contacto(String nombre, String numeroTelefono) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
    }

    // Método para mostrar los detalles del contacto
    public void mostrarContacto() {
        System.out.println("Nombre: " + nombre + " - Teléfono: " + numeroTelefono);
    }
}

public void AgendaDeContactos() {
    
        // Crear un scanner para leer las entradas del usuario
        Scanner scanner = new Scanner(System.in);

        // Lista que almacenará los contactos
        List<Contacto> agenda = new ArrayList<>();
        
        System.out.println("Bienvenido a tu agenda no la encuentro");
        // Bucle para permitir al usuario agregar contactos
        while (true) {
            // Solicitar el nombre del contacto
            System.out.print("Ingrese el nombre del contacto (o 'salir' para finalizar): ");
            String nombre = scanner.nextLine();

            // Si el usuario escribe "salir", terminar el bucle
            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }

            // Solicitar el número de teléfono del contacto
            System.out.print("Ingrese el número de teléfono del contacto " + nombre + ": ");
            String numeroTelefono = scanner.nextLine();

            // Crear un nuevo objeto de tipo Contacto y agregarlo a la lista
            Contacto nuevoContacto = new Contacto(nombre, numeroTelefono);
            agenda.add(nuevoContacto);

            System.out.println("Contacto agregado: " + nombre + " - " + numeroTelefono);
        }

        // Mostrar la lista de contactos registrados
        System.out.println("\nLista de contactos registrados:");
        for (Contacto contacto : agenda) {
            contacto.mostrarContacto();
        }

        // Cerrar el scanner
        scanner.close();
    }
}
