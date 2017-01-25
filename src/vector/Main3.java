package vector;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int desde, hasta, nElementos, posicionMenor, posicionMayor;
		Vector array1;

		do{
			System.out.println("Indica la cantidad de elementos que quieres comparar:");
			nElementos=teclado.nextInt();
		}while(nElementos<=0);
		System.out.println("Escribe el menor numero aleatorio que se puede generar: ");
		desde=teclado.nextInt();
		System.out.println("Escribe el mayor numero aleatorio que se puede generar: ");
		hasta=teclado.nextInt();

		array1=new Vector(nElementos, desde, hasta);

		posicionMenor=array1.posicionMenor();
		posicionMayor=array1.posicionMayor();

		array1.mostrar();

		System.out.println("El mayor numero es "+array1.getVectores()[posicionMayor]+" y su poscion es la numero "+posicionMayor);

		System.out.println("El mayor numero es "+array1.getVectores()[posicionMenor]+" y su poscion es la numero "+posicionMenor);

	}
}