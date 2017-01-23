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
		
		for (int i=0;i<matrices.length;i++){
		
			for (int j=0;j<matrices[0].length;j++)
			System.out.print(matrices[i][j]+" ");
			
			
		System.out.println();
		}

		System.out.println();


	}

	public Vector posicionMayor(){
		Vector mayor;
		mayor=new Vector(0, 0);
		
		for (int i=0;i<matrices.length;i++){

			for (int j=0;j<matrices[0].length;j++)
				if(matrices[i][j]>matrices[mayor.valor(0)][mayor.valor(1)]){
					mayor.setValor(0, i);
					mayor.setValor(1, j);
				}
			

		}



		return mayor;
	}

	

}
