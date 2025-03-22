
package trabajoejercicios;

import java.util.Scanner;

public class Ejercicio26 {

public void SensorTemperatura() {
    
        Scanner scanner = new Scanner(System.in);
        
        double temperatura;
        boolean temperaturaValida = false;
        
        System.out.println("Binvenido a tu temperatura");
        // Bucle que sigue pidiendo la temperatura hasta que esté dentro del rango
        while (!temperaturaValida) {
            System.out.print("Ingresa la temperatura actual (en °C): ");
            temperatura = scanner.nextDouble();

            // Verificar si la temperatura está dentro del rango aceptable
            if (temperatura >= 18 && temperatura <= 25) {
                temperaturaValida = true; // La temperatura es válida
                System.out.println("La temperatura está dentro del rango aceptable.");
            } else {
                System.out.println("ALERTA: La temperatura no está dentro del rango aceptable (18°C - 25°C).");
            }
        }

        System.out.println("El sensor ha leído una temperatura válida. ¡Proceso terminado!");
        scanner.close();
    }
}
    

