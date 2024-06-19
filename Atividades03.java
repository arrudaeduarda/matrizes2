package matrizes;

import java.util.Scanner;

public class Atividades03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a [][] = new int [3][3]; 
		int b [][] = new int [3][3];
		int C [][] = new int [3][3];


		//Entrada de dados.
		for(int l=0; l<3; l++) {
			for(int c=0; c<3; c++) {

				a [l][c] = (int)Math.round(Math.random()*10);
				b [l][c] = (int)Math.round(Math.random()*10);
				C [l][c] += a[l][c]*b[l][c];


			}}

		System.out.println("matriz A: ");
		for(int l=0; l<3; l++) {
			for(int c=0; c<3; c++){ 
				System.out.print("[" +a[l][c]+ "]");

			}
			System.out.println("\n------------");
		}

		System.out.println("matriz B: ");
		for(int l=0; l<3; l++) {
			for(int c=0; c<3; c++){ 
				System.out.print("[" +b[l][c]+ "]");
			}
		System.out.println("\n------------");
		}
		System.out.println("matriz C: ");
		for(int l=0; l<3; l++) {
			for(int c=0; c<3; c++){ 
				System.out.print("[" +C[l][c]+ "]");
			}
			System.out.println("\n------------");
		}

		ler.close();
	}}