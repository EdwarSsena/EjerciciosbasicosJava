
package trabajoejercicios;

import java.util.Scanner;

public class Ejercicio10 {

    public void temperaturaAmbiente(){
        int temMinima = 18; // temperatura mimima
        int temMaxima = 25; // temperatura maxima
        
        Scanner scanner = new Scanner (System.in);//Captura la variable
            
        System.out.println("Por favor ingrese la temperatura corporal: ");// pide al usuario su temperatura
        int temperatura = scanner.nextInt();// variable donde se almacena su temperatura
        
        if(temperatura >= temMinima && temperatura <= temMaxima){//rango de temperatura adecuada
            System.out.println("Temperatura corporal : "+temperatura+" °C es Estable");//indica si esta estable
        }else{
            if(temperatura <= temMinima){//rango de temperatura fuera del minimo
                System.out.println("Puede estar sufriendo una hipotermia busque calor: ");
            }else{//Rango de temperatura maximo permitido
                System.out.println("Su temperatura es demasiado caliente puede tener fiebre porfa bañese ");
            }
        }
    }
}
