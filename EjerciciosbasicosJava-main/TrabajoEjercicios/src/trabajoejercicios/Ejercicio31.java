
package trabajoejercicios;

import java.util.Scanner;

public class Ejercicio31 {

public void TiendaVirtual() {
    
        // Crear un escáner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Variable acumuladora para el total de la compra
        double totalCompra = 0.0;
        
        System.out.println("Bienvenido a tu tienda page 2 y lleve 1");
        // Bucle para agregar productos al carrito de compras
        while (true) {
            // Solicitar el nombre del producto
            System.out.print("Ingrese el nombre del producto (o 'salir' para finalizar): ");
            String nombreProducto = scanner.nextLine();

            // Si el usuario escribe "salir", terminar el bucle
            if (nombreProducto.equalsIgnoreCase("salir")) {
                break;
            }

            // Solicitar el precio del producto
            System.out.print("Ingrese el precio del producto " + nombreProducto + ": ");
            double precioProducto = scanner.nextDouble();

            // Limpiar el buffer del scanner
            scanner.nextLine();

            // Agregar el precio del producto al total de la compra
            totalCompra += precioProducto;

            // Mostrar el producto agregado
            System.out.println("Producto agregado: " + nombreProducto + " - Precio: $" + precioProducto);
        }

        // Mostrar el resumen de la compra
        System.out.println("\nResumen de la compra:");
        System.out.println("Total de la compra: $" + totalCompra);

        // Cerrar el escáner
        scanner.close();
    }
}
    

