package pla2;

public class Carta {
	
	private String palo;
	private String nombre;
	private int valor;
		
	public Carta(String p, String n, int v) {
		this.palo = p;
		this.nombre = n;
		this.valor = v;
	}
		
	public String GetPalo() {
		return palo;
	}
	public void SetPalo(String palo) {
		this.palo = palo;
	}
	public String GetNombre() {
		return nombre;
	}
	public void SetNombre(String nombre) {
		this.nombre = nombre;
	}
	public int GetValor() {
		return valor;
	}
	public void SetValor(int valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		String carta = nombre+" de "+palo;
		return carta;
	}
	

}
