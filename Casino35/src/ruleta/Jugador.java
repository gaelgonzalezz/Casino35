package ruleta;

public class Jugador {
	
	private String NOMBRE;
	private static float credito;
	
	public jugador(String NOMBRE, float credito) {
		this.NOMBRE = NOMBRE;
		this.credito = credito;
	}
	
	public String getNombre() {
		return NOMBRE;
	}
	
	public float getCredito() {
		return credito;
	}
	
	private void setCredito(float credito) {
		this.credito = credito;
	}
	
	public static void descontarCredito(float apuesta) {
		credito -= apuesta;
	}
	
	public static void creditoGanadorNumeros(float apuesta) {
		credito += apuesta * 36;
	}
	
	public static void creditoGanadorColor(float apuesta) {
		credito += apuesta * 2;
	}

}
