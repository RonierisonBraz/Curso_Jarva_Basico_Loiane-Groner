package com.loiane.cursojava.exercicios_aula13;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
         
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos transforma a temperatura de Celsius para Farenheit");
		System.out.println("Digite o valor que voc� que transforma");
		
		double grausCelsius = scan.nextDouble();
		
		System.out.println("O valor em Celsius � : "+(1.8*grausCelsius+32));
	}

}
