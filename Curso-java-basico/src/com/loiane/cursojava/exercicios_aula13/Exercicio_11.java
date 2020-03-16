package com.loiane.cursojava.exercicios_aula13;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite Dois numero inteiros e um numero real");
		
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		double numero3 = scan.nextDouble();
		
		int resultadoA = (numero1*2)+(numero2/2);
		double resultadoB = (numero1*3)+numero3;
		double resultadoC = (numero3*numero3*numero3);
		
		
		System.out.println("O produto do dobro do primeiro com metade do segundo é: "+resultadoA);
		System.out.println("A soma do triplo do primeiro com o terceiro é: "+resultadoB);
		System.out.println("O Terceiro elevado a cubo é: "+resultadoC);

		
	}

}
