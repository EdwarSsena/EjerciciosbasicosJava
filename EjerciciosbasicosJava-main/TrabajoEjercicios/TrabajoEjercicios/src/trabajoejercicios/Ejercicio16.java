
package trabajoejercicios;

import java.util.Scanner;

public class Ejercicio16 {

    public static  void Campeonato(){
        Scanner scanner = new Scanner(System.in);
        
        //ingresar los equipos a parcipar en el campeonato
        System.out.println("Bienvenido al campeonato...");
        String[] equipos = new String[8];
        
        //ingresar el nombre de los equipos
        for(int i = 0; i < 8; i++){
        System.out.println("Ingrese el nombre de los equipos "+(i+1)+" :");
        equipos[i]= scanner.nextLine();
    }
        //fase de cuartos de final
        String[]cuartos = new String[4];
        System.out.println("\n cuartos de final..... ");
        for (int i = 0; i<4; i++){
            System.out.println("\nPartido "+(i+1)+ " :"+equipos[i*2]+ " vs"+equipos[1*2+1]);
            String ganador = obtenerGanador(scanner, equipos[1*2], equipos[i*2+1]);
            cuartos[i] = ganador;
        }
        //Semifinales
        String[] semifinales = new String[2];
        System.out.println("\nSemifinales...");
        for(int i = 0; i<2; i++){
            System.out.println("\n Partidos "+(i+1)+" :"+cuartos[i*2]+ "vs"+ cuartos[i*2+1]);
            String ganador = obtenerGanador(scanner, cuartos[i*2], cuartos [i*2+1]);
            semifinales[i] = ganador;
        }
        //Final
        System.out.println("\n....Final...");
        System.out.println("\nPartido Final: "+semifinales[0]+ " vs "+semifinales[1]);
        String campeon= obtenerGanador(scanner, semifinales[0], semifinales[1]);
        
        System.out.println("\n|El campeon es: "+campeon+"!");
        
        scanner.close();
    }
    //Metodo para obtener el ganador de un partido
    public static String obtenerGanador(Scanner scanner, String equipo1, String equipo2){
        System.out.println("Ingrese el marcador de "+equipo1+" y "+equipo2);
        System.out.println("El resultado del "+equipo1+" : ");
        int golesEquipo1 = scanner.nextInt();
        System.out.println("Resultado "+equipo2+" : ");
        int golesEquipo2 = scanner.nextInt();
        scanner.nextLine();
        
        if(golesEquipo1>golesEquipo2){
            System.out.println(equipo1+ " Gana el partido ");
            return equipo1;
        }else if (golesEquipo2 > golesEquipo1){
            System.out.println(equipo2+" Gana el partido ");
            return equipo2;
        }else{
            System.out.println("El partido termino en empate el ganador se decide por penales");
            return equipo1;
        }
    }
}
