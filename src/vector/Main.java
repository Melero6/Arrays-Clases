package vector;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int desde, hasta, nElementos;
		Vector numerosMedia;
		do{
			System.out.println("Indica la cantidad de elementos que quieres comparar:");
			nElementos=teclado.nextInt();
		}while(nElementos<=0);
		System.out.println("Escribe el menor numero aleatorio que se puede generar: ");
		desde=teclado.nextInt();
		System.out.println("Escribe el mayor numero aleatorio que se puede generar: ");
		hasta=teclado.nextInt();

		numerosMedia=new Vector(nElementos, desde, hasta);


		numerosMedia.mostrarMedia();

	}

}
