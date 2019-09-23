package pla2;

import java.util.ArrayList;
import java.util.Scanner;

public class JuegoPoker {

	public static void main(String[] args) {
		
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		
		Scanner in = new Scanner (System.in);
				
		int numeroJugadores;
		
		System.out.println("Escribe el número de jugadores: ");		
		numeroJugadores=in.nextInt();
		
		in.nextLine();
		
		String[] nombreJugadores = new String[numeroJugadores];
		
		for(int i=0; i<nombreJugadores.length;i++) 
		{
			System.out.println("Escribe el nombre del jugador " + (i+1) + ":");
			nombreJugadores[i]=in.nextLine();
			Jugador jugador = new Jugador(nombreJugadores[i]);
			jugadores.add(jugador);
		}
				
		Poker poker = new Poker(jugadores);
						
		for(int i=0; i<nombreJugadores.length;i++) 
		{
		System.out.println("El nombre del jugador " + (i+1) + " es " + poker.getJugador().get(i).getNombre());
		}

		
	}

}
