package br.com.generation.exercicios2;

import java.util.Scanner;

public class Mostra_idade {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int idade;
		System.out.println("digite a idade: ");
		idade=entrada.nextInt();
		if(idade<10) {
			System.out.println("crian�a");
		}
		else if(idade>=10 && idade<=14) {
			System.out.println("infantil");
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("juvenil");
		}
		else if(idade>=18 && idade<=25) {
			System.out.println("adulto");
		}
		else {
			System.out.println("v�io");
		}
		entrada.close();
	}

}
