
package trabajoejercicios;

import java.security.AlgorithmParameterGeneratorSpi;

import java.util.Scanner;

public class Ejercicio13 {

    // Tienda de ropa con tres tipos de productos A=Alimentos, V= vestuario y E=electrodomesticos
    public  void Tienda(){
        
    Scanner scanner = new Scanner (System.in);
    
    System.out.println("Por favor ingrese el tipo de producto:..");
    System.out.println("Si Es A = alimentos, V= Vestuario y E= electrodomesticos: ");
    
     String tipoProducto = scanner.nextLine().toUpperCase();
     
     //pedir el nombre del produto
        System.out.println("Ingrese el nombre del producto: ");
        String producto = scanner.nextLine();
        
        //pedir el precio del producto
        System.out.println("Ingrese el precio del producto: $ ");
        double precio = scanner.nextDouble();
        
        //pedir la cantidad de unidades
        System.out.println("Ingrese la cantidad de unidades: ");
        int cant = scanner.nextInt();
        
        if (cant <= 0){
            System.out.println("La cantidad no es validad por favor ingrese la cantidad: ");
            return; 
        } 
    
        double descuento = 0;
        
        switch (tipoProducto) {
            case "A":
                descuento = 0.10;
                break;
            
            case "v":
                descuento = 0.05;
                break;
                
            case "E":
                descuento = 0.0;
            default:
                System.out.println("tipo de producto no valido: ");
                return;
        }
        
        //Calcular el costo
        double costoSinDescuento = precio*cant;
        double costoConDescuento = costoSinDescuento - (costoSinDescuento*descuento);
        
        //mostrar los precios
        System.out.println("Producto: "+producto);
        System.out.println("Costo sin descuento: "+costoSinDescuento);
        System.out.println("Costo con descuento: "+costoConDescuento);
}    
}
