
package trabajoejercicios;

import java.util.Scanner;

// Realizar un ejercicio donde indique si es o no un estudiante
public class Ejercicio4 {
    
    public void estudiante() {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese si es estudiante o no
        System.out.println("¿Es usted estudiante? : (true/false): ");
        
        // Usar el scanner ya creado para leer el valor booleano
        boolean esEstudiante = scanner.nextBoolean();
        
        // Mostrar el mensaje con el valor de la variable esEstudiante
        System.out.println("¿Es usted estudiante? [verdadero/falso]: " + esEstudiante);
        
        // Cerrar el scanner
        scanner.close();
    }
}
