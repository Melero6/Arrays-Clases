package vector;

import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String exit="", exit2="exit";
		Vector baraja;
		// OCEP - OROS COPAS ESPADAS BASTOS
		// 40 - 0,9 10,19 20,29 30,39
		// 1234567ABC
		boolean barajaLlave=true;
		baraja=new Vector(40, barajaLlave);
		System.out.print("Baraja de cartas: ");
		baraja.mostrarBaraja();
	
		while(exit.compareToIgnoreCase(exit2)!=0){
		System.out.print("Escribe 'carta' para pedir una carta y 'exit' para terminar: ");
		exit=teclado.next();
		System.out.println("Tu carta: ");
		baraja.dameCarta();
		}
		System.out.println();
		baraja.repartirBaraja();
	}

}
