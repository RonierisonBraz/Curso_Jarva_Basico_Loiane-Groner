package com.loiane.cursojava.exercicios_aula13;

import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos transforma a temperatura de Farenheit para Celsius");
		System.out.println("Digite o valor que voc� que transforma");
		
		double grausFarenheit = scan.nextDouble();
		
		System.out.println("O valor em Celsius � : "+(5*(grausFarenheit-32)/9));
	}

}
