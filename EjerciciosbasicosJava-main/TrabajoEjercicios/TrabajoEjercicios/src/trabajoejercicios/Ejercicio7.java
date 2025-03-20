
package trabajoejercicios;

import java.util.Scanner;

/*Asigna valores a las variables. Por ejemplo, define un nombre de cliente, un producto, 
la cantidad de productos, el precio unitario, indica si el cliente es estudiante o no, y 
asigna un tipo de cliente representado por una letra (A, B, C, etc.). */

public class Ejercicio7 {

    public void clienteFactura(){
        // Capturar la variable
        Scanner scanner = new Scanner(System.in);
        
        //Pide el nombre del cliente
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        
        //Pide el nombre del producto
        System.out.println("Ingrese el producto a comprar: ");
        String producto = scanner.nextLine();
        
        //Pide la cantidad de productos
        System.out.println("Ingrese la cantidad que desea llevar: ");
        int cant = scanner.nextInt();
        
        //Pide la cantidad de productos
        System.out.println("Precio unitario del producto: ");
        double precioUnitario = scanner.nextDouble();
        
        //Pregunta al cliente si es o no estudiante
        System.out.println("El cliente es estudiante?: (true/false) ");
        boolean estudiante = scanner.nextBoolean();
        
        // Pide el tipo de cliente
        System.out.println("Ingrese el tipo de cliente: A, B,  C, o etc: ");
        char tipoCliente = scanner.next().charAt(0);
        
        //Calcula el subtotal
        double subtotal = cant*precioUnitario;
        
        //Calcula el impuesto segun el tipo de cliente
        double impuesto = 0.0;
        
        if (estudiante){
            impuesto = subtotal*0.05; //si es estudiante
        }else{
            impuesto = subtotal*0.13;//si no es estudiante
                      
        }
        double total = subtotal+impuesto;
        
        System.out.println("\n----Factura-----");
        System.out.println("Nombre del cliente: "+nombre);
        System.out.println("Producto: "+producto);
        System.out.println("Cantidad: "+ cant);
        System.out.println("Precio unitario: "+precioUnitario);
        System.out.println("Es estudiante: "+estudiante);
        System.out.println("Tipo de cliente: "+tipoCliente);
        System.out.println("Subtotal:   "+subtotal);
        System.out.println("Impuesto: "+impuesto);
        System.out.println("Total: "+total);
    }
}

