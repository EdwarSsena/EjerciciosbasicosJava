
package trabajoejercicios;

import java.util.Scanner;

public class Ejercicio33 {

public void SumaDeNumeros() {
    
        // Crear un scanner para leer las entradas del usuario
        Scanner scanner = new Scanner(System.in);

        // Variable para acumular la suma de los números
        int suma = 0;

        // Bucle para permitir al usuario ingresar varios números
        while (true) {
            System.out.print("Ingrese un número (o 'salir' para terminar): ");
            String entrada = scanner.nextLine();

            // Verificar si el usuario quiere salir
            if (entrada.equalsIgnoreCase("salir")) {
                break;
            }

            try {
                // Intentar convertir la entrada a un número entero
                int numero = Integer.parseInt(entrada);

                // Sumar el número a la variable suma
                suma += numero;
            } catch (NumberFormatException e) {
                // Si la entrada no es un número válido, mostrar un mensaje de error
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
            }
        }

        // Mostrar el resultado final de la suma
        System.out.println("La suma total de los números ingresados es: " + suma);

        // Cerrar el scanner
        scanner.close();
    }
}
    

