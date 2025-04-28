package ejercitacion;

public class Jugador {
	
	private String NOMBRE;
	private static int credito;
	
	public Jugador(String NOMBRE, int credito) {
		this.NOMBRE = NOMBRE;
		this.credito = credito;
	}
	
	public String getNombre() {
		return NOMBRE;
	}
	
	public int getCredito() {
		return credito;
	}
	
	private void setCredito(int credito) {
		this.credito = credito;
	}
	
	public static void descontarCredito(int apuesta) {
		credito -= apuesta;
	}
	
	public static void creditoGanadorNumeros(int apuesta) {
		credito += apuesta * 36;
	}
	
	public static void creditoGanadorColor(int apuesta) {
		credito += apuesta * 2;
	}

}
