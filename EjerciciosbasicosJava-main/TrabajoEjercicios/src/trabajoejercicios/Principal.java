
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
        System.out.println("11. Programa ..11");
        System.out.println("12. Programa...11");
        System.out.println("13. Programa...13");
        System.out.println("14. Programa...14");
        System.out.println("15. Programa...15");
        System.out.println("16. Programa...16");
        System.out.println("17. Programa...17");
        System.out.println("18. Programa...18");
        System.out.println("19. Programa...19");
        System.out.println("20. Programa...20");
        System.out.println("21. Programa...21");
        System.out.println("22. Programa...22");
        System.out.println("23. Programa...23");
        System.out.println("24. Programa...24");
        System.out.println("25. Programa...25");
        System.out.println("26. Programa...26");
        System.out.println("27. Programa...27");
        System.out.println("28. Programa...28");
        System.out.println("29. Programa...29");
        System.err.println("30. Programa...30");
        
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
                break;
              
            case 11:
                Ejercicio11 ejercicio11 = new Ejercicio11();
                ejercicio11.sesorTemperatura();
                break;
                
            case 12:
                Ejercicio12 ejercicio12 = new Ejercicio12();
                ejercicio12.asensorConTemperatura();
                break;
                
            case 13:
                Ejercicio13 ejercicio13 = new Ejercicio13();
                ejercicio13.Tienda();
                break;
                
            case 14:
                Ejercicio14 ejercicio14 = new Ejercicio14();
                ejercicio14.IMC();
                break;
                
            case 15:
                Ejercicio15 ejercicio15 = new Ejercicio15();
                ejercicio15.cine();
                break;
                
            case 16:
                Ejercicio16 ejercicio16 = new Ejercicio16();
                ejercicio16.Campeonato();
                break;
                
            case 17:
                Ejercicio17 ejercicio17 = new Ejercicio17();
                ejercicio17.Restaurant();
                break;
                
            case 18:
                Ejercicio18 ejercicio18 = new Ejercicio18();
                ejercicio18.cajero();
                break;
                
            case 19:
                Ejercicio19 ejercicio19 = new Ejercicio19();
                ejercicio19.CompraEnLinea();
                break;
                
            case 20:
                Ejercicio20 ejercicio20 = new Ejercicio20();
                ejercicio20.Impresora();
                break;
                
            case 21:
                Ejercicio21 ejercicio21 = new Ejercicio21();
                ejercicio21.ViajeEnCoche();
                break;
                
            case 22:
                Ejercicio22 ejercicio22 = new Ejercicio22();
                ejercicio22.CuentaRegresiva();
                break;
                
            case 23:
                Ejercicio23 ejercicio23 = new Ejercicio23();
                ejercicio23.JuegoDeAdivinanza();
                break;
                
            case 24:
                Ejercicio24 ejercicio24 = new Ejercicio24();
                ejercicio24.RegistroBiblioteca();
                break;
                
            case 25:
                Ejercicio25 ejercicio25 = new Ejercicio25();
                ejercicio25.MenuComidasRapidas();
                break;
                
            case 26:
                Ejercicio26 ejercicio26 = new Ejercicio26();
                ejercicio26.SensorTemperatura();
                break;
                
            case 27:
                Ejercicio27 ejercicio27 = new Ejercicio27();
                ejercicio27.PromedioExamenes();
                break;
                
            case 28:
                Ejercicio28 ejercicio28 = new Ejercicio28();
                ejercicio28.GestionTareas();
                break;
                
            case 29:
                Ejercicio29 ejercicio29 = new Ejercicio29();
                ejercicio29.RegistroVentas();
                break;
                
            case 30:
                Ejercicio30 ejercicio30 = new Ejercicio30();
                ejercicio30.Parqueadero();
                break;
                
            case 31:
                Ejercicio31 ejercicio31 = new Ejercicio31();
                ejercicio31.TiendaVirtual();
                break;
                
            case 32:
                Ejercicio32 ejercicio32 = new Ejercicio32();
                ejercicio32.AgendaDeContactos();
                
            case 33:
                Ejercicio33 ejercicio33 = new Ejercicio33();
                ejercicio33.SumaDeNumeros();
                break;
                
            case 34:
                Ejercicio34 ejercicio34 = new Ejercicio34();
                ejercicio34.ProcesoVentas();
            default:
                
                System.out.println("A terminado el ejercicio ");
                break;
                
        }
    
    }
    
}
