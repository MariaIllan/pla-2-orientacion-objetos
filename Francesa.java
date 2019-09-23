package pla2;

public class Francesa extends Baraja {

	private String[] palos = {"picas", "tréboles", "diamantes", "corazones"};
	private String[] nombre = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K"};
	private int[] valor = {1,2,3,4,5,6,7,8,9,10,10,10,10};
		
	public Francesa() {
		Reiniciar();
	}
	
	@Override
	void Reiniciar() {
		
		if(cartas.size()==52) {
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
