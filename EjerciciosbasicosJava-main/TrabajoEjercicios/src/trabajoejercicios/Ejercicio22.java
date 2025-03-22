
package trabajoejercicios;

import java.util.Scanner;

public class Ejercicio22 {

public void CuentaRegresiva() {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido a tu cuenta regresiva");
        // Solicitar al usuario un número entero positivo para la cuenta regresiva
        System.out.print("Ingresa un número entero positivo para la cuenta regresiva: ");
        int numero = scanner.nextInt();
        
        // Verificar que el número sea positivo
        if (numero > 0) {
            // Realizar la cuenta regresiva
            while (numero >= 0) {
                System.out.println(numero);  // Mostrar el número en la cuenta regresiva
                numero--;  // Disminuir el número en 1
            }
            
            // Mostrar el mensaje al finalizar la cuenta regresiva
            System.out.println("¡Tiempo cumplido!");
        } else {
            // Informar si el número ingresado no es válido
            System.out.println("Por favor, ingresa un número entero positivo.");
        }
        
        scanner.close();
    }
}
    

