
package trabajoejercicios;

import java.util.Scanner;

// Realizar un ejercicio donde asigne una variable de letra char y luego muestre dicha variable
public class Ejercicio5 {

    // Método que solicita y muestra la letra ingresada por el usuario
    public void letra() {
        // Crear el scanner para capturar la variable
        Scanner scanner = new Scanner(System.in);

        // Pedir la letra al usuario
        System.out.println("Ingrese la nota que saco A, B o E: ");
        char letra = scanner.next().charAt(0); // Leer un solo carácter

     /*   // Mostrar el valor de la letra ingresada
        System.out.println("La letra que ingresó es: " + letra);
    */
        switch (letra) {
            case 'A' :
                System.out.println("Usted reprobo el examen");
                break;
            
            case 'B' :
                System.out.println("Usted aprobo el examen ");
                break;
             
            case 'E' :
                System.out.println("Usted aprobo sacticfactoriamente ");
                
            default:
                throw new AssertionError();
        }
    }
}

