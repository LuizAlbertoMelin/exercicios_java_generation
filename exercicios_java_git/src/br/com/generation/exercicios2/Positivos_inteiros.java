package br.com.generation.exercicios2;

import java.util.Scanner;

public class Positivos_inteiros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double d, a, b, c, r,s;
		a=entrada.nextInt();
		b=entrada.nextInt();
		c=entrada.nextInt();
		entrada.close();
		if(a>=0 && b>=0 && c>=0) {
			r=Math.pow(a, 2)+Math.pow(b, 2);
			s=Math.pow(c, 2)+Math.pow(b, 2);
			d=(r+s)/2;
			System.out.println("o valor da sua conta �: "+d);
			}
		else {
			System.out.println("voc� digitou numeros invalidos, tente novamente");
		}

	}

}
