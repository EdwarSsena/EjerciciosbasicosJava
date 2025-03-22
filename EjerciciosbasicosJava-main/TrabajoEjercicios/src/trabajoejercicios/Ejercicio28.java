
package trabajoejercicios;

import java.util.Scanner;

public class Ejercicio28 {

public void GestionTareas() {
    
        Scanner scanner = new Scanner(System.in);
        
        // Acumulador de tareas
        String acumuladorTareas = "";
        
        boolean continuarAgregando = true;
        
        System.out.println("Bienvenido a tu tareas ");
        // Bucle para permitir agregar tareas
        while (continuarAgregando) {
            // Solicitar al usuario la descripción de la tarea
            System.out.print("Ingresa la descripción de la tarea: ");
            String descripcion = scanner.nextLine();
            
            // Solicitar la fecha de vencimiento de la tarea
            System.out.print("Ingresa la fecha de vencimiento (DD/MM/AAAA): ");
            String fechaVencimiento = scanner.nextLine();
            
            // Agregar la tarea al acumulador
            acumuladorTareas += "Tarea: " + descripcion + "\nFecha de vencimiento: " + fechaVencimiento + "\n\n";
            
            // Preguntar si desea agregar más tareas
            System.out.print("¿Deseas agregar otra tarea? (si/no): ");
            String respuesta = scanner.nextLine();
            
            // Si la respuesta es "no", salir del bucle
            if (respuesta.equalsIgnoreCase("no")) {
                continuarAgregando = false;
            }
        }

        // Mostrar todas las tareas agregadas
        System.out.println("\nLista de tareas:");
        System.out.println(acumuladorTareas);
        
        scanner.close();
    }
}
    

