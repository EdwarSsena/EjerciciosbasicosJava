package trabajoejercicios;

import java.util.Scanner;

public class Ejercicio19 {


public void CompraEnLinea (){
     
        Scanner scanner = new Scanner(System.in);
        double costoTotal = 0.0;
        boolean continuarCompra = true;
        
        System.out.println("Bienvenido a tu copras en linea la gran estafa");

        while (continuarCompra) {
            // Solicitar el precio del producto
            System.out.print("Ingresa el precio del producto: ");
            double precioProducto = scanner.nextDouble();

            // Solicitar la cantidad del producto
            System.out.print("Ingresa la cantidad de productos que deseas comprar: ");
            int cantidadProducto = scanner.nextInt();

            // Calcular el costo total de este producto
            double costoProducto = precioProducto * cantidadProducto;

            // Sumar el costo del producto al total de la compra
            costoTotal += costoProducto;

            // Mostrar el costo de este producto
            System.out.println("El costo de este producto es: " + costoProducto);

            // Preguntar al usuario si desea agregar otro producto
            System.out.print("¿Deseas agregar otro producto? (si/no): ");
            String respuesta = scanner.next();

            // Si la respuesta es "no", terminar el bucle
            if (respuesta.equalsIgnoreCase("no")) {
                continuarCompra = false;
            }
        }

        // Mostrar el costo total de la compra
        System.out.println("El costo total de tu compra es: " + costoTotal);
        scanner.close();
    }
}



    

