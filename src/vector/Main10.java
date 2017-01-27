package vector;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		Vector baraja;
		// OCEP - OROS COPAS ESPADAS BASTOS
		// 40 - 0,9 10,19 20,29 30,39
		// 1234567ABC
		boolean barajaLlave=true;
		baraja=new Vector(40, barajaLlave);
		
		System.out.print("Baraja de cartas: ");
		baraja.mostrarBaraja();
		

		System.out.print("Repartir baraja: ");
		baraja.repartirBaraja();
	
	}

}

																																						