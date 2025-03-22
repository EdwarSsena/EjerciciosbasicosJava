
package trabajoejercicios;

import java.util.Scanner;

public class Ejercicio29 {

public void RegistroVentas() {
    
        Scanner scanner = new Scanner(System.in);
        
        // Variables para acumular el monto total de ventas y los productos vendidos
        double totalVentas = 0.0;
        String resumenVentas = "";
        
        boolean continuarVendiendo = true;
        
        System.out.println("Bienvenido a su venta ");
        // Bucle para registrar ventas
        while (continuarVendiendo) {
            // Solicitar el nombre del producto
            System.out.print("Ingresa el nombre del producto vendido: ");
            String producto = scanner.nextLine();
            
            // Solicitar el precio del producto
            System.out.print("Ingresa el precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine();  // Limpiar el buffer del scanner
            
            // Acumular el precio en el total de ventas
            totalVentas += precio;
            
            // Agregar el producto al resumen de ventas
            resumenVentas += "Producto: " + producto + " - Precio: $" + precio + "\n";
            
            // Preguntar si desea registrar otra venta
            System.out.print("¿Deseas registrar otra venta? (si/no): ");
            String respuesta = scanner.nextLine();
            
            // Si la respuesta es "no", salir del bucle
            if (respuesta.equalsIgnoreCase("no")) {
                continuarVendiendo = false;
            }
        }

        // Mostrar el monto total de ventas y el resumen de productos vendidos
        System.out.println("\nResumen de ventas:");
        System.out.println(resumenVentas);
        System.out.println("Monto total de ventas: $" + totalVentas);
        
        scanner.close();
    }
}
    

