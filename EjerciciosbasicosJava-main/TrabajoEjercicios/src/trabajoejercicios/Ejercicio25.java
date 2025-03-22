
package trabajoejercicios;

import java.util.Scanner;

public class Ejercicio25 {
 
public void MenuComidasRapidas() {
    
        Scanner scanner = new Scanner(System.in);
        
        // Precios de las opciones del menú
        double precioHamburguesa = 5.0;
        double precioPizza = 7.0;
        double precioHotDog = 3.5;
        double precioPapas = 2.5;

        double costoTotal = 0.0;
        boolean continuarPidiendo = true;
        
        System.out.println("Bienvenido a comidas rapidas puerquin ");
        // Menú de opciones
        System.out.println("Menú de Comidas Rápidas!");
        System.out.println("1. Hamburguesa - $5.00");
        System.out.println("2. Pizza - $7.00");
        System.out.println("3. Hot Dog - $3.50");
        System.out.println("4. Papas Fritas - $2.50");

        // Bucle para realizar pedidos hasta que el usuario decida finalizar
        while (continuarPidiendo) {
            // Solicitar al usuario que elija una opción del menú
            System.out.print("\nElige una opción (1-4) o 0 para finalizar: ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido una Hamburguesa.");
                    costoTotal += precioHamburguesa;
                    break;
                case 2:
                    System.out.println("Has elegido una Pizza.");
                    costoTotal += precioPizza;
                    break;
                case 3:
                    System.out.println("Has elegido un Hot Dog.");
                    costoTotal += precioHotDog;
                    break;
                case 4:
                    System.out.println("Has elegido Papas Fritas.");
                    costoTotal += precioPapas;
                    break;
                case 0:
                    continuarPidiendo = false; // Salir del bucle
                    break;
                default:
                    System.out.println("Opción inválida. Por favor elige una opción del 1 al 4.");
            }
            
            // Preguntar si el usuario desea seguir pidiendo
            if (continuarPidiendo) {
                System.out.print("¿Deseas agregar otro pedido? (si/no): ");
                scanner.nextLine();  // Limpiar el buffer de entrada
                String respuesta = scanner.nextLine();
                
                if (respuesta.equalsIgnoreCase("no")) {
                    continuarPidiendo = false;
                }
            }
        }
        
        // Mostrar el costo total y mensaje de agradecimiento
        System.out.println("\nEl costo total de tu pedido es: $" + costoTotal);
        System.out.println("¡Gracias por tu pedido! Esperamos verte pronto.");
        
        scanner.close();
    }
}


