
package trabajoejercicios;

import java.util.Scanner;

//Crear una factura con las variables producto precio total
public class Ejercicio6 {

    public void factura(){
        //Captura la varibale 
         Scanner scanner = new Scanner(System.in);
    
         // variable que pide el producto
         System.out.println("Ingrese el producto: ");
         String articulo = scanner.nextLine();
         
         System.out.println("Ingrese el precio: ");
         double precio = scanner.nextDouble();
         
         System.out.println("Ingrese la cantidad ");
         int cant = scanner.nextInt();
         
         //Calcula el total de la factura
         double total = precio*cant;
         
         System.out.println("\n---Factura----");
         System.out.println("Producto: "+articulo);
         System.out.println("Precio: "+precio);
         System.out.println("Total: "+total);
}

    
}
