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
	public Vector(int n, boolean baraja){

		vectores=new int[n];
		for (int i=1;i<=n-1;i++){
			if(i%10==7)
				vectores[i]= 65;
			else if(i%10==8)
				vectores[i]= 66;
			else if(i%10==9)
				vectores[i]= 67;
			else 
				vectores[i]= i%10;
		}
	}
	public void mostrarMedia(){
		float med=media();
		boolean llave=false;

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
		System.out.println();
		
		for (int i=0;i<vectores.length;i++)
			if((float)vectores[i]==med)
				llave=true; //Condicion para que entre al bucle de los iguales.
		
		if(llave){
		System.out.print("Los numeros iguales a la media son:");
		for (int i=0;i<vectores.length;i++)
			if((float)vectores[i]==med)
				System.out.print(" "+vectores[i]);
		}
		else
			System.out.println("No hay numeros iguales a la media.");
		
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
	public int valor(int i){
		int valor=vectores[i];
		
		return valor;

	}
	
	public void setValor(int posicion, int valor){
		vectores[posicion]=valor;

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
		int menor=vectores[0],posicion=0;

		for (int i=0;i<vectores.length;i++)
			if (vectores[i]<menor){
				menor=vectores[i];
				posicion=i;
			}

		return posicion;

	}
	
	public void mostrarRepeticiones(Vector array2){//numero de repeticiones de cada elemento del primer array en el segundo array
		int repeticiones=0;
		
		System.out.println("- Numero de repeticiones: ");
		for (int i=0;i<vectores.length;i++){
			System.out.print("Elemento "+i+" se repite ");
			for(int j=0;j<vectores.length;j++){
				if(vectores[i]==array2.vectores[j])
					++repeticiones;
			}
			System.out.println(repeticiones+" veces.");
			repeticiones=0;
		}
	}
	public void mostrarBaraja(){

		for (int i=0;i<vectores.length;i++){
			if(i>=0&&i<=9)
				System.out.print(" OROS-");
			if(i>=10&&i<=19)
				System.out.print(" COPAS-");
			if(i>=20&&i<=29)
				System.out.print(" ESPADAS-");
			if(i>=30&&i<=39)
				System.out.print(" BASTOS-");
			
			if(i%10==7)
				System.out.print((char)vectores[i]);
			else if(i%10==8)
				System.out.print((char)vectores[i]);
			else if(i%10==9)
				System.out.print((char)vectores[i]);
			else
			System.out.print(vectores[i]);
		}
		System.out.println();


	}
	public void repartirBaraja(){
		int	posicion=0;
		for(int i=0; i<vectores.length;i++){
			posicion=(int)(Math.random()*(39+1));
			if(posicion>=0&&posicion<=9)
				System.out.print(" OROS-");
			if(posicion>=10&&posicion<=19)
				System.out.print(" COPAS-");
			if(posicion>=20&&posicion<=29)
				System.out.print(" ESPADAS-");
			if(posicion>=30&&posicion<=39)
				System.out.print(" BASTOS-");
			if(posicion%10==7)
				System.out.print((char)vectores[posicion]);
			else if(posicion%10==8)
				System.out.print((char)vectores[posicion]);
			else if(posicion%10==9)
				System.out.print((char)vectores[posicion]);
			else
			System.out.print(vectores[posicion]);
		}
	}
	public void dameCarta(){
		int	posicion=0;

			posicion=(int)(Math.random()*(39+1));
			if(posicion>=0&&posicion<=9)
				System.out.print(" OROS-");
			if(posicion>=10&&posicion<=19)
				System.out.print(" COPAS-");
			if(posicion>=20&&posicion<=29)
				System.out.print(" ESPADAS-");
			if(posicion>=30&&posicion<=39)
				System.out.print(" BASTOS-");
			if(posicion%10==7)
				System.out.print((char)vectores[posicion]);
			else if(posicion%10==8)
				System.out.print((char)vectores[posicion]);
			else if(posicion%10==9)
				System.out.print((char)vectores[posicion]);
			else
			System.out.print(vectores[posicion]);
			System.out.println();
		}
	}
	

