package vector;

import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int elementosM, elementosN, desde, hasta, filaAlumno,columnaAsignatura;
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
		matriz.mostrarInt();
	
		
		System.out.print("Indica de que alumno quieres calcular la media de notas (Min=0 Max="+elementosN+") :");
		filaAlumno=teclado.nextInt();
		matriz.mostrarMediaFila(filaAlumno);
		System.out.print("Indica de que asignatura quieres calcular la media de notas (Min=0 Max="+elementosM+") :");
		columnaAsignatura=teclado.nextInt();
		matriz.mostrarMediaColumna(columnaAsignatura);
		
	}

}
