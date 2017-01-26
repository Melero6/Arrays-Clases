package vector;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int elementosM, elementosN, desde, hasta, fila1,fila2;
		Matriz matriz;

		do{
			System.out.println("Escribe el numero de filas: ");
			elementosN=teclado.nextInt();
			System.out.println("Escribe el numero de columnas:");
			elementosM=teclado.nextInt();
		}while(elementosM<=0||elementosN<=0);
		System.out.println("Escribe el menor numero aleatorio que se puede generar: ");
		desde=teclado.nextInt();
		System.out.println("Escribe el mayor numero aleatorio que se puede generar: ");
		hasta=teclado.nextInt();
		
		
		matriz=new Matriz(elementosN, elementosM, desde, hasta);
		matriz.mostrarInt();
		do{
		System.out.println("¿Que fila quieres cambiar? (Max= "+(elementosM-1)+")");
		fila1=teclado.nextInt();
		System.out.println("¿Por cual? (Max= "+(elementosM-1)+")");
		fila2=teclado.nextInt();
		}while(fila1>(elementosM-1)||fila1<0||fila2>(elementosM-1)||fila2<0);
		matriz.cambioFilas(fila1, fila2);
		System.out.println();
		matriz.mostrarInt();


	}

}
