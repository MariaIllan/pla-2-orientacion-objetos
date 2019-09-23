package pla2;

public class Espanyola  extends Baraja {

	private String[] palos = {"espadas", "bastos", "oros", "copas"};
	private String[] nombre = {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};
	private int[] valor = {1,2,3,4,5,6,7,10,10,10};
	
	public Espanyola() {
		Reiniciar();
	}
	
	@Override
	void Reiniciar() {
		
		if(cartas.size()==40) {
			cartas.clear();
		}
		
		for (int i=0; i<palos.length;i++) {
			for(int j=0; j<nombre.length; j++) {
				Carta carta = new Carta(palos[i], nombre[j], valor[j]);
				cartas.add(carta);
			}
		}		
	}
	
}
