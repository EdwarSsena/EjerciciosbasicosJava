
package trabajoejercicios;

import java.util.Scanner;

public class Ejercicio18 {

    private int pin = 1234;
    private double saldo = 100.000;
    
    public void cajero() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido al cajero Cachi At.");
        
        // Solicitar el PIN y verificar
        double pinIngresado;
        
        // Bucle para asegurar que el PIN ingresado sea correcto
        do {
            System.out.print("\nPor favor, ingrese su PIN: ");
            pinIngresado = scanner.nextDouble();
            
            if (pinIngresado != pin) {
                System.out.println("\nPIN incorrecto. Vuelve a intentarlo.");
            }
        } while (pinIngresado != pin);
        
        // Una vez validado el PIN, mostramos las opciones
        System.out.println("\nPIN correcto. Acceso permitido.");
        System.out.println("\nDesea realizar alguna de las siguientes transacciones:");
        System.out.println("1. Depositar dinero");
        System.out.println("2. Retirar efectivo");
        System.out.print("Seleccione una opción: ");
        
        int menu = scanner.nextInt();
        
        switch (menu) {
            case 1:
                // Opción de depósito
                System.out.print("\nIngrese el valor a depositar: $");
                double abono = scanner.nextDouble();
                
                if (abono <= 0) {
                    System.out.println("\nEl valor a depositar debe ser mayor que cero.");
                } else {
                    saldo += abono;
                    System.out.println("\nDepósito realizado con éxito. Su nuevo saldo es de: $" + saldo);
                }
                break;
                
            case 2:
                // Opción de retiro
                System.out.print("\nIngrese el valor a retirar: $");
                double retiro = scanner.nextDouble();
                
                // Verificar que el retiro no sea mayor que el saldo
                if (retiro <= 0) {
                    System.out.println("\nEl valor a retirar debe ser mayor que cero.");
                } else if (retiro > saldo) {
                    System.out.println("\nError: El monto ingresado es mayor que el saldo disponible.");
                } else {
                    saldo -= retiro;
                    System.out.println("\nRetiro realizado con éxito. Su saldo actual es de: $" + saldo);
                }
                break;
                
            default:
                // Opción inválida
                System.out.println("\nOpción inválida. Intente de nuevo.");
                break;
        }
    }
}
