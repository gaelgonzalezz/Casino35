package ejercitacion;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		String nombre;
		int credito;
		boolean finJuego = true;
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("¡Bienvenido a la ruleta!");

		System.out.println("Ingrese su nombre: ");
		nombre = s.nextLine();
		System.out.println("Bienvenido " + nombre + ". Ahora ingresa cuanto dinero desea cargar a su cuenta:");
		credito = s.nextInt();
		
		do {
			
			System.out.println("Debes ingresar un valor mayor a 0.");
			System.out.println("Ingrese cuanto dinero desea cargar a su cuenta:");
			credito = s.nextInt();
			
		} while (credito <= 0);
		
		do {
			
			System.out.println("MENU DE OPCIONES");
			System.out.println("Ingrese '1' para jugar");
			System.out.println("Ingrese '2' para salir");
			int eleccion = s.nextInt();
			
			switch(eleccion) {
			
			case 1:
				Juego(nombre, eleccion, s);
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

	private static void Juego(String nombre, int credito, Scanner s) {
		
		int apuesta;
		int numero_color;
		
		System.out.println("Ingrese el monto que desea apostar: ");
		apuesta = s.nextInt();
		
		do {
			System.out.println("Desea apostar a un numero o color? Ingrese '1' para numero o '2' para color");
			numero_color = s.nextInt();
			
			switch(numero_color){
			
			case 1:
				System.out.println("Elija un numero del 0 al 10.");
				
			
			}
			
			
		} while (apuesta > 0);
		
		
	}
	
}


