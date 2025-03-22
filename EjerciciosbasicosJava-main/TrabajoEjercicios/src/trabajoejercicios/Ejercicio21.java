
package trabajoejercicios;

import java.util.Scanner;

public class Ejercicio21 {

public void ViajeEnCoche() {
    
        Scanner scanner = new Scanner(System.in);
        
        // Bucle que permite realizar múltiples viajes
        boolean continuarViaje = true;
        
        System.out.println("Bienvenido al paseo millonario ");
        while (continuarViaje) {
            // Solicitar la distancia total del viaje
            System.out.print("Ingresa la distancia total del viaje (en kilómetros): ");
            double distancia = scanner.nextDouble();
            
            // Solicitar la velocidad promedio del coche
            System.out.print("Ingresa la velocidad promedio del coche (en kilómetros por hora): ");
            double velocidad = scanner.nextDouble();
            
            // Calcular el tiempo estimado de viaje
            double tiempoEstimado = distancia / velocidad;
            
            // Mostrar el tiempo estimado de viaje
            System.out.println("El tiempo estimado de viaje es: " + tiempoEstimado + " horas.");
            
            // Preguntar al usuario si desea realizar otro viaje
            System.out.print("¿Deseas hacer otro viaje? (si/no): ");
            String respuesta = scanner.next();
            
            // Si la respuesta es "no", salir del bucle
            if (respuesta.equalsIgnoreCase("no")) {
                continuarViaje = false;
            }
        }
        
        System.out.println("¡Gracias por usar el simulador de viajes!");
        scanner.close();
    }
}
    

