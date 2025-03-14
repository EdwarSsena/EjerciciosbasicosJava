
package trabajoejercicios;

import java.util.Scanner; 

public class Ejercicio12 {
    // metodo para simular el asesor con control de temperatura
    
    public void asensorConTemperatura(){
        Scanner scanner = new Scanner (System.in);
        
        //Grados de temperatura aceptable en Celcius
        final double  TEMPERATURA_MINIMA = 18.0;
        final double TEMPERATURA_MAXIMA = 30.0;
        
        //solicita la temperatura al usuario
        System.out.println("Ingrese la temperatura: ");
        double temperaturaActual = scanner.nextDouble();
        
        //Verificar la temperatarura
        if (temperaturaActual >= TEMPERATURA_MINIMA && temperaturaActual <= TEMPERATURA_MAXIMA){
            System.out.println("Temperatura es adecuada para el asesor puede continuar");
            
            //solicita piso deseado
            System.out.println("Ingrese al piso que desea ir: ");
            int pisoDeseado = scanner.nextInt();
            
            //Verificador al piso que desea subir
            if(pisoDeseado >= 0 && pisoDeseado <= 10){
                System.out.println("El asensor esta en movimiento asia el piso: "+pisoDeseado);
                System.out.println("Ha llegado al piso :"+pisoDeseado);
            }else{
                System.out.println("Piso invalido el asensor no pede moverse asia ese piso :"+pisoDeseado);
            }
        }else{//si la temperatura esta fuera del rango no se mueve el asensor
            System.out.println("la temperatura no es adecuada para usar el asensor");
            System.out.println("por favor desaloje el asensor gracias");
        }
    }
    
}
