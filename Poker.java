package pla2;
import java.util.ArrayList;

public class Poker {

	private Francesa barajaFrancesa;
	private ArrayList<Jugador> jugador= new ArrayList<Jugador>();;
	
	public Poker(ArrayList<Jugador> jugador) {
		this.barajaFrancesa = new Francesa();
		this.jugador = jugador;
		if(jugador.size()<2) {
			System.out.println("Se necesitan 2 jugadores");
		}
	}
	
	public ArrayList<Jugador> getJugador() {
		return jugador;
	}

	public void setJugador(ArrayList<Jugador> jugador) {
		this.jugador = jugador;
	}

	public Francesa getBarajaFrancesa() {
		return barajaFrancesa;
	}

	public void setBarajaFrancesa(Francesa barajaFrancesa) {
		this.barajaFrancesa = barajaFrancesa;
	}
	
	void AddJugador(Jugador j) {
		jugador.add(j);
	}
		
}
