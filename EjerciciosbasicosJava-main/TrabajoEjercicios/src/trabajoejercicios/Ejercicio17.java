
package trabajoejercicios;

import java.util.Scanner; 

public class Ejercicio17 {
    
    static String[] sopas = {"Caldo de costilla, caldo de pollo, sopa de verdra"};
    static String[] secos = {"Arroz con pollo, Carne a la vara, Mojarra frita"};
    static String[] bebidas = {"limonada, gaseosa, serveza"};
    
    public void Restaurant(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido al restaurant Baratoshy....");
        
        System.out.println("Seleccione una sopa");
        for(int i =0 ; i< sopas.length; i++){
            System.out.println((i+1)+ " . "+ sopas[i]);
        }
        int sopaElegida = scanner.nextInt()-1;
        
        //secos
        System.out.println("Seleccione el seco...");
        for( int i = 0; i< secos.length; i++){
            System.out.println((i+1)+" . "+secos[i]);
            
        }
        int secoElegido = scanner.nextInt()-1;
        
        //bebidas
        System.out.println("Seleccione la Bebidas....");
        for(int i = 0; i<bebidas.length; i++){
            System.out.println((i+1)+" . "+bebidas[i]);
            
        }
        int bebidaElegida = scanner.nextInt()-1;
        
        
        //precios
        double precioSopa = 10.0;
        double precioSeco = 15.0;
        double precioBebida = 5.0;
        
        //facturar
        
        double total = precioSopa + precioSeco + precioBebida;
        System.out.println("\nResumen de la orden...");
        System.out.println("sopa elegida "+sopas[sopaElegida]+" - Precio: $ "+precioSopa);
        System.out.println("seco elegido "+secos[secoElegido]+" - precio: $ "+precioSeco);
        System.out.println("bebida elegida "+ bebidas[bebidaElegida]+" - precio: $ "+precioBebida);
        System.out.println("Total a pagar : $ "+total);
        
        //opciones de pago
        System.out.println("\nSeleccione medio de pago:  ");
        System.out.println("1. Efectivo (descuento 15%)");
        System.out.println("2. Tarjeta (sin descuento ");
        System.out.println("3. Tranferencia (descuento 10%");
        int metodoPago = scanner.nextInt();
        
        double descuento = 0.0;
        
        if(metodoPago == 1){
            descuento = 0.15;
            System.out.println("Has elegido pago en efectivo descuento del 15%");
        }else if(metodoPago == 2){
            System.out.println("Has elegido pago con tarjeta descuento 0%");
                 
        }else if(metodoPago == 3){
            System.out.println("Has elegido pago con trasferencia descuento 10%");
        }else{
            System.out.println("Opcion de pago no valida ");
            return;
        }
        
        // calcular el descuento
        double totalConDescuento = total-(total*descuento);
        System.out.println("\nTotal con descuento "+totalConDescuento);
        
        
        System.out.println("Gracias por tu compra ¡buen provecho!");
        
        scanner.close();
    }
}
