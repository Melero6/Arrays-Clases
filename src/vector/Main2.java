package vector;
import java.util.Scanner;


public class Main2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int desde, hasta, nElementos;
		Vector array1, array2, array3;

		do{
			System.out.println("Indica la cantidad de elementos que quieres comparar:");
			nElementos=teclado.nextInt();
		}while(nElementos<=0);
		System.out.println("Escribe el menor numero aleatorio que se puede generar en el primer array: ");
		desde=teclado.nextInt();
		System.out.println("Escribe el mayor numero aleatorio que se puede generar en el primer array: ");
		hasta=teclado.nextInt();

		array1=new Vector(nElementos, desde, hasta);

		System.out.println("Escribe el menor numero aleatorio que se puede generar en el segundo array: ");
		desde=teclado.nextInt();
		System.out.println("Escribe el mayor numero aleatorio que se puede generar en el segundo array: ");
		hasta=teclado.nextInt();

		array2=new Vector(nElementos, desde, hasta);

		array3=new Vector(nElementos);

		array3=array1.suma(array2);

		System.out.print("Suma de los arrays: ");
		array3.mostrar();
		array3.ordenar();
		System.out.print("Suma de los arrays ordenado: ");
		array3.mostrar();
	}

}
