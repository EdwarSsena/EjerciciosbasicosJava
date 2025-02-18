// Edward Alexis GArcia Garcia ficha 2849024

package nombre_apellido;

import java.util.Scanner;

public class Nombre_Apellido {

//    String Nombre;
  //  String Apellido;
    
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner tomarDatos = new Scanner(System.in);      
    System.out.println("Por favor ingrese nombre:...");
    String nombre = tomarDatos.nextLine();
    
    System.out.println("Porfavor ingrese su apellido:...");
    String apellido= tomarDatos.nextLine();
    
    
    
    System.out.print("Bienvenido a clases "+ nombre+" "+apellido);
    }
   
}
