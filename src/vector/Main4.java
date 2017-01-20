package vector;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int elementosM, elementosN;
		Matriz matriz;

		do{
			System.out.println("ElementosN");
			elementosN=teclado.nextInt();
			System.out.println("ElementosM");
			elementosM=teclado.nextInt();
		}while(elementosM<=0||elementosN<=0);
	

		matriz=new Matriz(elementosN, elementosM);

		
	}
}