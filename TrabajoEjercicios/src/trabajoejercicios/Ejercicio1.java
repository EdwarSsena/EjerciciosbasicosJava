
package trabajoejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    
    public void solicitarDatos(){
        Scanner scanner = new Scanner(System.in);
        
        // Solicita el nombre
            System.out.println("Por favor ingrese su nombre:...");
            String nombre = scanner.nextLine();
            
        // solicitar el  apellido
            System.out.println("Por favor ingrese su apellido:...");
            String apellido = scanner.nextLine();
            
            System.out.println("Bienvenido al programa: "+nombre+""+apellido);
    }
    
    
}
