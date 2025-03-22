

package trabajoejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio23 {



public void JuegoDeAdivinanza() {
    
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generar un número aleatorio entre 1 y 100
        int numeroSecreto = random.nextInt(100) + 1;

        int intento;
        boolean adivinado = false;
        
        System.out.println("Bienvenido a adivina adividador");
        // Bucle que permite seguir adivinando hasta acertar
        while (!adivinado) {
            System.out.print("Adivina el número entre 1 y 100: ");
            intento = scanner.nextInt();

            // Comprobar si el intento es correcto
            if (intento < numeroSecreto) {
                System.out.println("El número es mayor. Intenta de nuevo.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor. Intenta de nuevo.");
            } else {
                adivinado = true; // El número fue adivinado
                System.out.println("¡Felicidades! Has adivinado el número.");
            }
        }

        scanner.close();
    }
}
    

