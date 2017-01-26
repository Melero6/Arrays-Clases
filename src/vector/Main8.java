package vector;

import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int elementosM, elementosN, desde, hasta, fila1,fila2;
		Matriz matriz;

		do{
			System.out.print("Escribe el numero de alumnos: ");
			elementosN=teclado.nextInt();
			System.out.print("Escribe el numero de asignaturas: ");
			elementosM=teclado.nextInt();
		}while(elementosM<=0||elementosN<=0);
	
		desde=1;
		hasta=10;
		
		matriz=new Matriz(elementosN, elementosM, desde, hasta);
		matriz.mostrar();
	
	}

}
