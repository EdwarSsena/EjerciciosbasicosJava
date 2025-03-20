
package trabajoejercicios;

import java.util.Scanner;

/*Desarrolla un programa que simule un ascensor que tiene un límite de peso. El usuario ingresa 
su peso y el piso al que desea ir. El programa debe verificar si el peso está dentro del límite 
permitido. Si es así, el ascensor se mueve al piso deseado. Si no, muestra un mensaje de que 
el ascensor está sobrecargado.*/

public class Ejercicio9 {
    
    public void sobrePeso(){
        double pesoAsensor = 100.0;  //Peso maximo del asensor
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su peso: ");
        double peso = scanner.nextDouble();
        
        if (peso <= pesoAsensor){
                System.out.println("Ingrese al piso que desea ir del piso 1 al piso 10 :");
            int piso = scanner.nextInt();
        
            int pisoMinimo = 1;
            int pisoMaximo = 10;
        
            if(piso >=pisoMinimo && piso <= pisoMaximo){
                System.out.println("LLegando al piso seleccionado...");
                System.out.println("Hemos llegado al piso: "+piso);
            }else{
                System.out.println("Ingrese un piso del 1 al 10: ");
            }
        }else{
            System.out.println("El peso supera los 100 kl por favor bajese uno gracias");
        }
        
    }
}
