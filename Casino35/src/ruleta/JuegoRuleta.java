package ruleta;

import java.util.Random;
import java.util.Scanner;

public class JuegoRuleta {

    public static void juego(Jugador Jugador, Scanner s) {
        Random r = new Random();
        float apuesta;
        int numero_color;
        int numeroApostado;
        int colorApostado;
        boolean finJuego = false;

        while(!finJuego) {
        	
        	System.out.println("Su credito actual es de: " + Jugador.getCredito() + "$");
            System.out.println("MENU DE APUESTAS\nIngrese:\n'1' Para numero\n'2' Para color\n'3' Para salir.");
            numero_color = s.nextInt();
        	
        	 while (numero_color < 1 || numero_color > 3) {
                 System.out.println("Ingresaste una opcion invalida. Intente de vuelta.");
                 System.out.println("MENU DE APUESTAS\nIngrese:\n'1' Para numero\n'2' Para color\n'3' Para salir.");
                 numero_color = s.nextInt();
             }
            
            if (numero_color == 3) {
                finJuego = true;
                System.out.println("Hasta luego!");
                break;
            }
            
            while (numero_color <= 0 || numero_color > 3) {
            	System.out.println("Ingreso una opcion invalida. Intente de vuelta.");
                System.out.println("MENU DE APUESTAS\nIngrese:\n'1' Para numero\n'2' Para color\n'3' Para salir.");
                numero_color = s.nextInt();
            }
                
                
            if (numero_color == 3) {
                finJuego = true;
                System.out.println("Hasta luego!");
                break;
            }
                
            System.out.println("Ingresa cuantro credito deseas apostar: ");
            apuesta = s.nextFloat();
                
            while (apuesta <= 0 || apuesta > Jugador.getCredito()) {
            	System.out.println("Ingreso una cantidad invalida. Intente de vuelta.");
                System.out.println("Su credito disponible es: " + Jugador.getCredito() + "$");
                System.out.println("Ingrese el monto que desea apostar: ");
                apuesta = s.nextInt();
            }
                
            Jugador.descontarCredito(apuesta);

            switch (numero_color) {
            	case 1:
            		int resultado = r.nextInt(37);
                    System.out.println("Elija un numero del 0 al 36: ");
                    numeroApostado = s.nextInt();

                    while (numeroApostado < 0 || numeroApostado > 36) {
                    	System.out.println("Numero invalido. Ingrese un numero entre 0 y 36:");
                        numeroApostado = s.nextInt();
                    }

                    if (numeroApostado == resultado) {
                        System.out.println("Ganaste!");
                        Jugador.creditoGanadorNumeros(apuesta);
                    } else {
                    	System.out.println("SALIO EL " + resultado + ". Perdiste... Mejor suerte la proxima!");
                    }
                        
                    if (Jugador.getCredito() <= 0) {
                    	System.out.println("Se quedo sin credito. Fin del juego!");
                        finJuego = true;
                    }    
                    break;

            	case 2:
            		int resultadoColor = r.nextInt(2) + 1; // 1 o 2
                    System.out.println("Elija '1' para NEGRO o '2' para ROJO:");
                    colorApostado = s.nextInt();

                    while (colorApostado != 1 && colorApostado != 2) {
                    	System.out.println("Color invalido. Ingrese '1' para negro o '2' para rojo:");
                        colorApostado = s.nextInt();
                    }

                    if (colorApostado == resultadoColor) {
                        System.out.println("Ganaste!");
                        Jugador.creditoGanadorColor(apuesta);
                    } else {
                    	System.out.println("Perdiste... Mejor suerte la proxima!");
                    }
                        
                    if (Jugador.getCredito() <= 0) {
                        System.out.println("Te quedaste sin credito. Fin del juego!");
                        finJuego = true;
                    }   
                    break;
                        
                default:
                    System.out.println("Ingreso una opcion invalida, vuelva a intentarlo.");
                    break;
            }           	 
        }
    }
}

