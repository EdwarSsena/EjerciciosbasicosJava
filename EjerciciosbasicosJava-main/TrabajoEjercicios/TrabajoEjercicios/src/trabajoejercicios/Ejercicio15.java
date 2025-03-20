
package trabajoejercicios;

import java.util.Scanner;

public class Ejercicio15 {

    //Peliculas para niños, adolecentes y mayores
    //public static void main(String[] args) {
    
    public void cine(){
    Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido a Cinemax....");
        System.out.println("Por favor ingrese su nombre: ");
        String nombre =  scanner.nextLine();
        System.out.println("Por favor ingrese su edad: ");
        int edad = scanner.nextInt();
        
        if( edad < 7 ){
            System.out.println("Apreciado "+nombre);
            System.out.println("Tenemos las siguientes pelicuales en cartelera: ");
            System.out.println("1. El Rey Leon ");
            System.out.println("2. Madagasar ");
            System.out.println("3. Alicia en el pais de la maravillas ");
            int pelicula = scanner.nextInt();
            
        } if (edad >= 7 && edad <= 17 ){
            System.out.println("Apreciado "+nombre);
            System.out.println("Tenemos las siguientes peliculas en cartelera....");
            System.out.println("1. El paseo 1");
            System.out.println("2. Mastur Been");
            System.out.println("3. Mi pobre angelito ");
            
        }if (edad >17 && edad<= 30 ){
            System.out.println("Apreciado "+nombre);
            System.out.println("Tenemos las siguientes peliculas en cartelera...");
            System.out.println("1. Rapidos y fusiosos ");
            System.out.println("2. Entre las lineas del deber");
            System.out.println("3. la escapatoria del caballo paralitico ");
        
        }if(edad >= 31){
            System.out.println("Apreciado cliente ");
            System.out.println("Tenemos las siguientes peliculas en cartelera....");
            System.out.println("1. El renacer del muerto ");
            System.out.println("2. Cachi Chen");
            System.out.println("3. Destino final ");
        }else{
            System.out.println("Por favor escoja una pelicula ");
        }
    }
}
