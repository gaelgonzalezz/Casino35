package ejercitacion;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {	
		final String NOMBRE;
		int credito;
		boolean finJuego = true;
		Scanner s = new Scanner(System.in);
		
		System.out.println("¡Bienvenido a la ruleta!");
		System.out.println("Ingrese su nombre: ");
		NOMBRE = s.nextLine();
		System.out.println("Bienvenido " + NOMBRE + ". Ahora ingresa cuanto dinero desea cargar a su cuenta:");
		credito = s.nextInt();
		
		
		if (credito <= 0) {
			while(credito <= 0){
				System.out.println("Debes ingresar un valor mayor a 0.");
				System.out.println("Ingrese cuanto dinero desea cargar a su cuenta:");
				credito = s.nextInt();
			}
		}
		
		Jugador Jugador = new Jugador(NOMBRE, credito);
		JuegoRuleta juego = new JuegoRuleta();
	
		do {
			System.out.println("MENU DE OPCIONES");
			System.out.println("Ingrese '1' para jugar");
			System.out.println("Ingrese '2' para salir");
			int eleccion = s.nextInt();
			
			switch(eleccion) {
			case 1:
				JuegoRuleta.juego(Jugador, s);
				break;	
			case 2:
				System.out.println("¡Nos vemos!");
				finJuego = true;
				break;
			default:
				System.out.println("Has ingresado un valor invalido. Intentalo de nuevo");
			}		
			
		} while(!finJuego);
		
		s.close();
		
	}
}
