package pla2;
import java.util.ArrayList;

public class Mus {
	
	private Espanyola barajaEspanyola = new Espanyola();
	private ArrayList<Jugador> jugador = new ArrayList<Jugador>();

	public ArrayList<Jugador> getJugador() {
		return jugador;
	}

	public void setJugador(ArrayList<Jugador> jugador) {
		this.jugador = jugador;
	}
	
	void AddJugador(Jugador j) {
		jugador.add(j);
	}
}
