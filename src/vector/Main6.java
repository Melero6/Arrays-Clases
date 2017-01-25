package vector;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int elementosM, elementosN, desde, hasta;
		Matriz matriz;

		do{
			System.out.println("ElementosN");
			elementosN=teclado.nextInt();
			System.out.println("ElementosM");
			elementosM=teclado.nextInt();
		}while(elementosM<=0||elementosN<=0);
		System.out.println("Escribe el menor numero aleatorio que se puede generar: ");
		desde=teclado.nextInt();
		System.out.println("Escribe el mayor numero aleatorio que se puede generar: ");
		hasta=teclado.nextInt();
		
		matriz=new Matriz(elementosN, elementosM, desde, hasta);
		matriz.mostrar();
		
		matriz.mostrarSumaFilas();
		matriz.mostrarSumaColumnas();

	}

}
