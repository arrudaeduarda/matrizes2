package matrizes;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int armazena;
		int m [][] = new int [5][5];

		//Entrada de dados
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				armazena = (int)Math.round(Math.random()*100);

				if (armazena %2 == 0){
					m [i][j] = armazena;
				}
				else {
					j=0;
				}}}
		//Saída de dados
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.println("Os valores são: "+m[i][j]);
			}
			ler.close(); 
		}

	}
}