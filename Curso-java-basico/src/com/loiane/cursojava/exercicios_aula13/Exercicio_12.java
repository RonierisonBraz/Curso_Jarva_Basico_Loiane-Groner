package com.loiane.cursojava.exercicios_aula13;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quer saber seu peso ideal digite sua altura que vou lhe mostra");
		
		double altura = scan.nextDouble();
		
		System.out.println("Seu Peso ideal é : "+((72.7*altura)-58));

	}

}
