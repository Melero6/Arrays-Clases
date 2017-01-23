package vector;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int desde, hasta, nElementos;
		Vector array1, array2;

		do{
			System.out.println("Indica la cantidad de elementos que quieres comparar:");
			nElementos=teclado.nextInt();
		}while(nElementos<=0);
		System.out.println("Indica desde que numero");
		desde=teclado.nextInt();
		System.out.println("Indica hasta que numero");
		hasta=teclado.nextInt();
		
		System.out.print("Vector 1:");
		array1=new Vector(nElementos, desde, hasta);
		System.out.print("Vector 2:");
		array2=new Vector(nElementos, desde, hasta);


		array1.mostrar();
		array2.mostrar();
		
		array1.mostrarRepeticiones(array2);
		
		

	}

}
