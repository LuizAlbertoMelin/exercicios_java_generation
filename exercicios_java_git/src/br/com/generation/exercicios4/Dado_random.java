package br.com.generation.exercicios4;

import java.util.Random;

public class Dado_random {

	public static void main(String[] args) {
		Random random=new Random();
		double  media=0.0, soma=0.0;
		int contador=0, maiorDado=0; int dado[]=new int[10];
		for(int i=0;i<dado.length;i++){
			dado[i]=random.nextInt(6);
		    soma=soma+dado[i];
			media=soma/10;
			if(dado[i]>maiorDado) {
				maiorDado=dado[i];			
			}
						
			if(maiorDado==dado[i]){
				contador++;
			}
						
		}
		
		for(int i=0;i<dado.length;i++){
			System.out.print(dado[i]+"|");
		}
		System.out.println("Esse � o maior dado: "+maiorDado);
		System.out.println("Quantidade de vezes que caiu o maior valor: "+contador);
		System.out.println("Essa � a media: "+media);

	}

}
