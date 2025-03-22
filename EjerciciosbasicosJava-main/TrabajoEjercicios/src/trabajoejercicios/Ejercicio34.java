
package trabajoejercicios;

import java.util.Scanner;

public class Ejercicio34 {

class Producto {
    String nombre;
    double precio;
    int cantidad;

    // Constructor para inicializar el producto
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Método para calcular el total de una venta de este producto
    public double calcularVenta() {
        return precio * cantidad;
    }

    // Método para mostrar los detalles del producto vendido
    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " - Precio: $" + precio + " - Cantidad: " + cantidad + " - Total: $" + calcularVenta());
    }
}

public void ProcesoVentas() {
   
        // Crear un scanner para leer las entradas del usuario
        Scanner scanner = new Scanner(System.in);

        // Variable para acumular el total de ventas
        double totalVentas = 0.0;
        
        System.out.println("Bienvenido a tu venta pague dos y lleve 1");
        // Bucle para registrar las ventas de varios productos
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

            // Solicitar la cantidad vendida
            System.out.print("Ingrese la cantidad vendida del producto " + nombreProducto + ": ");
            int cantidadVendida = scanner.nextInt();

            // Limpiar el buffer del scanner
            scanner.nextLine();  // Consumir el salto de línea

            // Crear un objeto Producto con los datos ingresados
            Producto producto = new Producto(nombreProducto, precioProducto, cantidadVendida);

            // Mostrar los detalles del producto vendido
            producto.mostrarProducto();

            // Acumular el total de ventas
            totalVentas += producto.calcularVenta();
        }

        // Mostrar el total de ventas al final
        System.out.println("\nTotal de ventas: $" + totalVentas);

        // Cerrar el scanner
        scanner.close();
    }
}
    

