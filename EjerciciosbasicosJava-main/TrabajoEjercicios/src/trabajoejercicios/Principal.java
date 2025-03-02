
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
        System.out.println("5. Programa....5");
        System.out.println("6. Programa....6");
        System.out.println("7. Programa....7");
        System.out.println("8. Programa....8");
        System.out.println("9. Programa....9");
        System.out.println("10. Programa...10");
        
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
                break;
            
            case 5:
                Ejercicio5 ejercicio5 = new Ejercicio5();
                ejercicio5.letra();
                break;
                
            case 6:
                Ejercicio6 ejercicio6 = new Ejercicio6();
                ejercicio6.factura();
                break;
                
            case 7:
                Ejercicio7 ejercicio7 = new Ejercicio7();
                ejercicio7.clienteFactura();
                break;
                
            case 8:
                Ejercicio8 ejercicio8 = new Ejercicio8();
                ejercicio8.asensor();
                break;
                
            case 9:
                Ejercicio9 ejercicio9 = new Ejercicio9();
                ejercicio9.sobrePeso();
                break;
                
            case 10:
                Ejercicio10 ejercicio10 = new Ejercicio10();
                ejercicio10.temperaturaAmbiente();
            
            default:
                
                System.out.println("A terminado el ejercicio ");
                break;
                
        }
    
    }
    
}
