
package trabajoejercicios;

import java.util.Scanner;


public class Ejercicio8 {
 
    public void asensor(){
        int pisoMinimo = 1; //variable piso mas bajo
        int pisoMaximo = 10;//variable piso mas alto
        
        //captura la informacion del cliente
        Scanner scanner = new Scanner (System.in);
        
        //solicita al usuario el piso que desea ir
        System.out.println("Ingrese al piso que desea ir (entre "+pisoMinimo+ " y "+pisoMaximo);
        int piso = scanner.nextInt();
        
        if (piso >= pisoMinimo && piso <= pisoMaximo){
            System.out.println("Asensor en movimiento:....");
            System.out.println("El asensor a llegado al piso: "+piso);
            
            }else{
            System.out.println("El piso ingresdo no es valido seleccione del 1 al 10: ");
        }
    }
}
