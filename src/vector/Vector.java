package vector;

import java.util.Arrays;

public class Vector {



	private int[] vectores;


	public int[] getVectores() {
		return vectores;
	}
	public void setVectores(int[] vectores) {
		this.vectores = vectores;
	}


	public Vector(int n){

		vectores=new int[n];

	}
	public Vector(int n, int m){

		vectores=new int[n];
		for (int i=0;i<n;i++)
			vectores[i]=m;

	}
	public Vector(int n, int desde, int hasta){

		vectores=new int[n];
		for (int i=0;i<n;i++)
			vectores[i]= (int)(Math.random()*(hasta-desde+1)+desde);

	}

	public void mostrarMedia(){
		float med=media();

		System.out.print("La media es "+med);


		System.out.println();
		System.out.print("Los numeros menores a la media son:");
		for (int i=0;i<vectores.length;i++)
			if(vectores[i]<med)
				System.out.print(" "+vectores[i]);

		System.out.println();
		System.out.print("Los numeros mayores a la media son:");
		for (int i=0;i<vectores.length;i++)
			if(vectores[i]>med)
				System.out.print(" "+vectores[i]);

	}

	public float media(){
		float media=0;
		for (int i=0;i<vectores.length;i++)
			media+=vectores[i];

		media=media/vectores.length;
		return media;
	}


	public void mostrar(){

		for (int i=0;i<vectores.length;i++)
			System.out.print(" "+vectores[i]);

		System.out.println();


	}


	public Vector suma(Vector array2){
		Vector suma =new Vector(vectores.length);

		for (int i=0;i<vectores.length;i++)
			suma.vectores[i]=vectores[i]+array2.vectores[i];

		return suma;
	}

	public void ordenar(){
		Arrays.sort(vectores);
	}

	public int posicionMayor(){
		int mayor=vectores[0],posicion=0;

		for (int i=0;i<vectores.length;i++)
			if (vectores[i]>mayor){
				mayor=vectores[i];
				posicion=i;
			}

		return posicion;
	}

	public int posicionMenor(){
		int menor=vectores[0],posicion=0;;

		for (int i=0;i<vectores.length;i++)
			if (vectores[i]<menor){
				menor=vectores[i];
				posicion=i;
			}

		return posicion;

	}
}
