package pla2;
import java.util.ArrayList;
import java.util.Collections;

public abstract class Baraja {
	
	protected ArrayList<Carta> cartas = new ArrayList<Carta>();
	
	public void Barajar() {
		Collections.shuffle(cartas);		
	}
	
	Carta Repartir() {
		Carta primeraCarta= cartas.get(0);
		cartas.remove(0);
		return primeraCarta;
	}
	
	 abstract void Reiniciar();
		//en las clases derivadas nos servirá para crear el mazo de cartas de nuevo.	
}
