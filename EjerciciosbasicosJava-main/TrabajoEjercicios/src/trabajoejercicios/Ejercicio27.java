
package trabajoejercicios;

import java.util.Scanner;

public class Ejercicio27 {

public void PromedioExamenes() {
    
        Scanner scanner = new Scanner(System.in);
        
        double sumaNotas = 0.0;
        int cantidadExamenes = 0;
        boolean continuarIngresando = true;
        
        System.out.println("Bienvenidos  a tus resultados");
        // Bucle para ingresar los resultados de los exámenes
        while (continuarIngresando) {
            System.out.print("Ingresa la calificación del examen (0-10): ");
            double nota = scanner.nextDouble();
            
            // Validar que la nota esté dentro del rango (0 a 10)
            if (nota < 0 || nota > 10) {
                System.out.println("Error: La nota debe estar entre 0 y 10.");
            } else {
                sumaNotas += nota;
                cantidadExamenes++;
            }
            
            // Preguntar al usuario si desea ingresar más resultados
            System.out.print("¿Deseas ingresar otra calificación? (si/no): ");
            scanner.nextLine();  // Limpiar el buffer del scanner
            String respuesta = scanner.nextLine();
            
            if (respuesta.equalsIgnoreCase("no")) {
                continuarIngresando = false;
            }
        }
        
        // Calcular el promedio
        if (cantidadExamenes > 0) {
            double promedio = sumaNotas / cantidadExamenes;
            System.out.println("El promedio de tus exámenes es: " + promedio);
            
            // Determinar si el estudiante ha aprobado o reprobado
            if (promedio >= 6) {
                System.out.println("¡Felicidades! Has aprobado.");
            } else {
                System.out.println("Lo siento, has reprobado.");
            }
        } else {
            System.out.println("No se han ingresado notas.");
        }
        
        scanner.close();
    }
}
    

