package matrizes;

public class AtividadeDois1906 {

	public static void main(String[] args) {
		char a[][] = { {' ', ' ', '*', ' ', ' '},
				      {' ', ' ', '*', ' ', ' '}, 
				      {'*', '*', '*', '*', '*'},
				      {' ', ' ', '*', ' ', ' '},
				      {' ', ' ', '*', ' ', ' '}
				      };
	
		for(char[]letra:a) {
			for(char coluna: letra) {
				System.out.print(coluna + "\t");
			}
			System.out.println();

	

}
}}