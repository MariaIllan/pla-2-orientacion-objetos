package pla2;

import java.util.Scanner;

public class JuegoMus {

	public static void main(String[] args) {

		Mus mus = new Mus();
		
		Scanner in = new Scanner (System.in);
		
		String[] nombreJugadores = new String[4];
		
		System.out.println("Escribe el nombre de los cuatro jugadores.");
		
		for(int i=0; i<nombreJugadores.length;i++) 
		{
			System.out.println("Jugador " + (i+1) + ":");
			nombreJugadores[i]=in.nextLine();
			Jugador jugador = new Jugador(nombreJugadores[i]);
			mus.AddJugador(jugador);	
		}
		
		for(int i=0; i<nombreJugadores.length;i++) 
		{
		System.out.println("El nombre del jugador " + (i+1) + " es " + mus.getJugador().get(i).getNombre());
		}
			
		
	}

}
