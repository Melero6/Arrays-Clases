package vector;

public class Matriz {




	private int[][] matrices;

	public int[][] getMatrizes() {
		return matrices;
	}
	public void setMatrizes(int[][] matrizes) {
		this.matrices = matrizes;
	}

	public Matriz(int n, int m) {

		matrices=new int[n][m];


	}
	public Matriz(int n, int m,int desde, int hasta) {

		matrices=new int[n][m];



		for (int i=0;i<n;i++){
			for (int j=0;j<m;j++)
				matrices[i][j]= (int)(Math.random()*(hasta-desde+1)+desde);
		}
	}

	public void mostrar(){

		System.out.println("Lista de valores de la matriz: ");
		for (int i=0;i<matrices.length;i++){

			for (int j=0;j<matrices[0].length;j++)
				System.out.printf(" %4d",matrices[i][j]);


			System.out.println();
		}

		System.out.println();

	}

	public void mostrarMayor(){
		int[] mayor = {0,0};

		for (int i=0;i<matrices.length;i++){
			for (int j=0;j<matrices[0].length;j++){
				if(matrices[i][j]>matrices[mayor[0]][mayor[1]]){
					mayor[0]=i;
					mayor[1]=j;
				}
			}
		}
		System.out.print("El mayor numero es el "+matrices[mayor[0]][mayor[1]]+" y se encuentra en las posciones: ");
		for (int i=0;i<matrices.length;i++){
			for (int j=0;j<matrices[0].length;j++){
				if(matrices[i][j]==matrices[mayor[0]][mayor[1]]){
					System.out.print("("+i+","+j+") ");
				}
			}
		}
		System.out.println();
	}

	public void mostrarMenor(){
		int[] menor = {0,0};

		for (int i=0;i<matrices.length;i++){
			for (int j=0;j<matrices[0].length;j++){
				if(matrices[i][j]<matrices[menor[0]][menor[1]]){
					menor[0]=i;
					menor[1]=j;
				}
			}
		}
		System.out.print("El mayor numero es el "+matrices[menor[0]][menor[1]]+" y se encuentra en las posciones: ");
		for (int i=0;i<matrices.length;i++){
			for (int j=0;j<matrices[0].length;j++){
				if(matrices[i][j]==matrices[menor[0]][menor[1]]){
					System.out.print("("+i+","+j+") ");
				}
			}
		}
		System.out.println();

	}
	public void mostrarSumaFilas(){
		int filas=0;
		System.out.println("Suma de filas: ");
		for (int i=0;i<matrices.length;i++){
			System.out.print("Fila "+i+" : ");
			for (int j=0;j<matrices[0].length;j++){
				filas+=matrices[i][j];
			}
			System.out.println(filas);
			filas=0;
		}
		System.out.println();
	}

	public void mostrarSumaColumnas(){
		int columnas=0;
		System.out.println("Suma de columnas: ");
		for (int i=0;i<matrices.length;i++){
			System.out.print("Columna "+i+" : ");
			for (int j=0;j<matrices[0].length;j++){
				columnas+=matrices[j][i];
			}
			System.out.println(columnas);
			columnas=0;
		}
		System.out.println();
	}

	public void cambioFilas(int fila1,int fila2){
		if(fila1>matrices[0].length||fila1<0||fila2>matrices[0].length||fila2<0)
			System.out.println("Error - Esa fila no existe");
		else{
			int uno[] = new int[matrices.length];
			int dos[] = new int[matrices.length];


			for(int j=0;j<matrices.length;j++)
				uno[j]=matrices[fila1][j];

			for(int j=0;j<matrices.length;j++)
				dos[j]=matrices[fila2][j];

			for(int j=0;j<matrices.length;j++)
				matrices[fila1][j]=dos[j];

			for(int j=0;j<matrices.length;j++)
				matrices[fila2][j]=uno[j];
		}
	}
	
	public void mostrarMediaFila(int fila){  //Muestra la media de una fila indicada por el parametro
		if(fila>matrices[0].length||fila<0)
			System.out.println("Error - Esa fila no existe");
		else{
			float media=0;

			for(int j=0;j<matrices.length;j++)
				media+=matrices[fila][j];

			media=media/matrices.length;
			System.out.println("La media del alumno "+fila+" es: "+media);

		}
	}
	
	public void mostrarMediaColumna(int columna){ //Muestra la media de una columna indicada por el parametro
		if(columna>matrices[0].length||columna<0)
			System.out.println("Error - Esa columna no existe");
		else{
			float media=0;

			for(int j=0;j<matrices.length;j++)
				media+=matrices[j][columna];

			media=media/matrices.length;
			System.out.println("La media de la asignatura "+columna+" es: "+media);

		}
	}
	
	public float devolverMediaFila(int fila){  //devuelve la media de una fila indicada por parametro
		float media=0;
		if(fila>matrices[0].length||fila<0)
			System.out.println("Error - Esa fila no existe");
		else{
			for(int j=0;j<matrices.length;j++)
				media+=matrices[fila][j];

			media=media/matrices.length;	 
		}
		return media;
	}
	
	public float devolverMediaColumna(int columna){ //devuelve la media de una columna indicada por parametro

		float media=0;
		if(columna>matrices[0].length||columna<0)
			System.out.println("Error - Esa columna no existe");
		else{
			for(int j=0;j<matrices.length;j++)
				media+=matrices[j][columna];

			media=media/matrices.length;
		}
		return media;
	}
}



