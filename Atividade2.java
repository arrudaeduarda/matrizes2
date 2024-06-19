package matrizes;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int m[][] = new int [4][4];

		//Entrada de dados.
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				m [i][j] = (int)Math.round(Math.random()*100);
			}
		}

		//Saída de dados
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(i == j) {
					System.out.print("["+ m[i][j]+ "]");
				}
				else {
					m[i][j] = 0;
				System.out.print("[" +m[i][j]+ "]");
				}

			}
			System.out.println("\n------------");
		}	
		  ler.close();
	}
	}
	 
