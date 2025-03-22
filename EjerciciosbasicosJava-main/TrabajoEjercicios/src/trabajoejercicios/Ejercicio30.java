
package trabajoejercicios;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio30 {
    
public void Parqueadero() {
    
        // Crear un escáner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido al parqueadero yo no respondo");
        // Solicitar el número de vehículos que ingresarán al parqueadero
        System.out.print("¿Cuántos vehículos ingresarán al parqueadero? ");
        int numeroDeVehiculos = scanner.nextInt();

        // Crear listas para almacenar la placa y la hora de ingreso de los vehículos
        List<String> placas = new ArrayList<>();
        List<String> horasIngreso = new ArrayList<>();

        // Bucle para solicitar la placa de cada vehículo y registrar la hora de ingreso
        for (int i = 0; i < numeroDeVehiculos; i++) {
            scanner.nextLine();  // Consumir el salto de línea pendiente
            System.out.print("Ingrese la placa del vehículo " + (i + 1) + ": ");
            String placa = scanner.nextLine();

            // Registrar la hora de ingreso (hora actual del sistema)
            String horaIngreso = java.time.LocalTime.now().toString();

            // Agregar la placa y la hora de ingreso a las listas
            placas.add(placa);
            horasIngreso.add(horaIngreso);
        }

        // Mostrar el resumen de los vehículos registrados con sus respectivas placas y horas de ingreso
        System.out.println("\nResumen de vehículos registrados:");
        for (int i = 0; i < numeroDeVehiculos; i++) {
            System.out.println("Vehículo " + (i + 1) + " - Placa: " + placas.get(i) + " - Hora de ingreso: " + horasIngreso.get(i));
        }

        // Cerrar el escáner
        scanner.close();
    }
}


