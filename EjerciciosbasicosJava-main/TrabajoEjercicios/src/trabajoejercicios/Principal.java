
package trabajoejercicios;

import java.util.Scanner;

public class Principal {

  //Main principal
    
    public static void main(String[] args) {
        // Menu de ejercicios
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seleccione el programa que desee ejecutar..");
        System.out.println("1. Programa....1");
        System.out.println("2. Programa....2");
        System.out.println("3. Programa....3");
        System.out.println("4. Programa....4");
        
        //Captura la opcion escojida
        int seleccion = scanner.nextInt();
        
        // Ejecutar programa
        ejecutarPrograma(seleccion);
        
        scanner.close();
    }
     
    public static void ejecutarPrograma(int seleccion){
        switch (seleccion) {
            case 1:
                Ejercicio1 ejercicio1 = new Ejercicio1();
                ejercicio1.solicitarDatos();
                break;
            
            case 2:
                Ejercicio2 ejercicio2 = new Ejercicio2();
                ejercicio2.soliictarEdad();
                break;
                
            case 3:
                Ejercicio3 ejercicio3 = new Ejercicio3();
                ejercicio3.precioProducto();
                break;
            
            case 4:
                Ejercicio4 ejercicio4 = new Ejercicio4();
                ejercicio4.estudiante();
                
            default:
                
                System.out.println("A terminado el ejercicio ");
                break;
                
        }
    
    }
    
}
