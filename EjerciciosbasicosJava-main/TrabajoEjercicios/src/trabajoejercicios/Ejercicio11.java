
package trabajoejercicios;

import java.util.Scanner;

public class Ejercicio11 {

public void sesorTemperatura(){
    Scanner scanner = new Scanner(System.in);
    
    //Umbral de temperatura alerta en grados
    final double UMBRAL_ALERTA = 30.0;
    
    //Saludo inicial
    System.out.println("Bienvenido al sesor de Temperatura...");
    
    //Solicita la temperatura al usuario
    System.out.println("Ingrese la temperatura actual en grados Celcius:  ");
    double temperaturaActual = scanner.nextDouble();
    
    //Verifica si la temperatura esta por encima del lumbrar de alerta
    if (temperaturaActual > UMBRAL_ALERTA){
        System.out.println("Alerta la temperatarua acutal es de : "+temperaturaActual+ " °C esta por encima del lumbral");
    }else{
        System.out.println("La temperatura es : "+temperaturaActual+ " normal esta por debajo del umbrla ");
    }
}    
}
