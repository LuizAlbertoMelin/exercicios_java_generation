package br.com.generation.exercicios4;

import java.util.Scanner;

public class Matriz_soma_diagonal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int matriz[][]=new int[3][3], soma=0,diagonal=0;
		System.out.println("digite os valores: ");
		for(int l=0;l<matriz.length;l++) {
			for(int c=0;c<matriz.length;c++) {
				matriz[l][c]=entrada.nextInt();
				soma=soma+matriz[l][c];
				diagonal=matriz[0][0]+matriz[1][1]+matriz[2][2];
			}
		}
		System.out.println();
		System.out.println("esse � o valor da matriz: "+soma);
		System.out.println("\nesse � o valor da soma da diagonal: "+diagonal);
		entrada.close();
	}

}
