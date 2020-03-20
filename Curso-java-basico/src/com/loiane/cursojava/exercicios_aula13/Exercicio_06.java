package com.loiane.cursojava.exercicios_aula13;

import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) { 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos calcular a área do Circulo ");
		System.out.println("Digite o raio do circulo");
		
		double raio = scan.nextDouble();
		
		System.out.println("A área do Circulo é "+(raio*raio)*3.14);
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("segunda maneira de calcular a área do circulo é: "+area);
		
	}

}
