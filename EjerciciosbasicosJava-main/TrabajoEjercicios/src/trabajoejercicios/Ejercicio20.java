
package trabajoejercicios;

import java.util.Scanner;

public class Ejercicio20 {

public void Impresora() {
    
        Scanner scanner = new Scanner(System.in);
        
        // Cantidad inicial de papel en la impresora
        int capacidadPapel = 100;
        
        System.out.println("Bienvenidos a tus jetocopias ");
        // Bucle que continuará hasta que no haya suficiente papel
        while (capacidadPapel > 0) {
            // Solicitar al usuario cuántas páginas desea imprimir
            System.out.print("Ingresa la cantidad de páginas que deseas imprimir: ");
            int paginasAImprimir = scanner.nextInt();
            
            // Verificar si hay suficiente papel para imprimir las páginas
            if (paginasAImprimir <= capacidadPapel) {
                // Imprimir las páginas
                capacidadPapel -= paginasAImprimir;
                System.out.println("Se han impreso " + paginasAImprimir + " páginas.");
                System.out.println("Papel restante en la impresora: " + capacidadPapel + " páginas.");
            } else {
                // Informar que no hay suficiente papel
                System.out.println("No hay suficiente papel para imprimir " + paginasAImprimir + " páginas.");
                System.out.println("Papel restante en la impresora: " + capacidadPapel + " páginas.");
            }
            
            // Verificar si hay papel suficiente para seguir imprimiendo
            if (capacidadPapel > 0) {
                // Preguntar al usuario si desea seguir imprimiendo
                System.out.print("¿Deseas seguir imprimiendo? (si/no): ");
                String respuesta = scanner.next();
                
                // Si la respuesta es "no", terminar el bucle
                if (respuesta.equalsIgnoreCase("no")) {
                    break;
                }
            } else {
                System.out.println("No hay más papel en la impresora.");
                break;
            }
        }
        
        scanner.close();
        System.out.println("El programa ha terminado.");
    }
}


    

