package pla2;
import java.util.ArrayList;

public class Jugador {
	
	private String nombre;
	private ArrayList<Carta> cartas;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		cartas = new ArrayList<Carta>();
	}

	public String getNombre() {
		return nombre;
	}

	public void SetNombre(String nombre) {
		this.nombre = nombre;
	}
		
	void DarCarta(Carta carta) {
		cartas.add(carta);
	}
	
	Carta RetirarCarta(int indice) {
		Carta cartaEliminada= cartas.get(indice);
		cartas.remove(indice);
		return cartaEliminada;
	}
	
	String Juego() {
		String cartasDelJugador="";
		for(int i=0; i<cartas.size(); i++) {
			if (i>0) {
				cartasDelJugador += ", ";
			}
			cartasDelJugador += cartas.get(i);			
		}
		return "[" + cartasDelJugador + "]";
	}
	
}
