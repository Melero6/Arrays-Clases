package vector;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int elementosM, elementosN, desde, hasta;
		Matriz matriz;
		int[] mayor;

		do{
			System.out.println("ElementosN");
			elementosN=teclado.nextInt();
			System.out.println("ElementosM");
			elementosM=teclado.nextInt();
		}while(elementosM<=0||elementosN<=0);
		System.out.println("desde");
		desde=teclado.nextInt();
		System.out.println("hasta");
		hasta=teclado.nextInt();
		
		matriz=new Matriz(elementosN, elementosM, desde, hasta);
		matriz.mostrar();
		matriz.mostrarMayor();
		matriz.mostrarMenor();
		
	}
}