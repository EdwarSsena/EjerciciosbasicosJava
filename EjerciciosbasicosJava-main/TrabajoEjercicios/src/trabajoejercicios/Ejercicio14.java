
package trabajoejercicios;

import java.util.Scanner;

//Indice de masa corporal
public class Ejercicio14 {
    
    public void IMC(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido a continuacion sacaremos su IMC");
        System.out.println("Por favor ingrese su peso: kg");
        double peso = scanner.nextDouble();
        
        System.out.println("Por favor ingrese su altura: Cm");
        double altura = scanner.nextDouble();
        
        if(peso <= 0 || altura <= 0){
        
        System.out.println("Por favor ingrese su altura y peso correcto: ");
        return;
        }
        
        double imc = peso / (altura*altura);//Calcula el IMC
        
        String categoria = "";
        
        if(imc <= 18.5){
            categoria = "Bajo peso";
           }else if(imc <= 24.9){
               categoria = "Peso nomral";
           }else if (imc <= 29.9){
               categoria = "Sobre peso";
           }else{
               categoria = " Obesidad ";
           }
        //mostrar el resultado
        System.out.println("Su IMC es: "+String.format("%.2f", imc));
        System.out.println("Categoria es : "+categoria);
    }    
}
