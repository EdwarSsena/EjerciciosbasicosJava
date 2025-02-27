
package trabajoejercicios;

import java.util.Scanner;

public class Ejercicio3 {
// Creee un programa donde pida el precio de un articulo y luego lo muestre

    public void precioProducto(){
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor digite el precio del producto: ");
        double precio = scanner.nextDouble();
        
        System.out.println("El precio del producto es de : $ "+precio);
    }

}
