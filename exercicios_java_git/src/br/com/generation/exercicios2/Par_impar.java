package br.com.generation.exercicios2;

import java.util.Scanner;

public class Par_impar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double num;
		System.out.println("imforme o numero: ");
		num=entrada.nextDouble();
		if(num%2==0) {
			System.out.println("O numero � par e sua raiz quadrada �: "+(Math.sqrt(num)));
		}
		else{
			System.out.println("O numero � impar e sua potencia �: "+(Math.pow(num, 2)));
		}
	entrada.close();
	}
}
