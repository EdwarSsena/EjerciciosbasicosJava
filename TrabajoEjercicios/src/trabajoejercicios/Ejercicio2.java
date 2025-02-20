
package trabajoejercicios;

import java.util.Scanner;

//Solicitar la edad
public class Ejercicio2{
    public void soliictarEdad(){
        Scanner scanner = new Scanner(System.in);
        
        // pedir la edad
        System.out.println("Por favor ingrese su edad:..");
        int edadd = scanner.nextInt();
        
        // mortrar su edad
        System.out.println("Su edad es: "+edadd+ " años");
    }
    
}
