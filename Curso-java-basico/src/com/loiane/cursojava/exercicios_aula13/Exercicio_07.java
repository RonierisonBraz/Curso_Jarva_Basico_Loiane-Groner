package com.loiane.cursojava.exercicios_aula13;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos calcular a área do quadrado");
		System.out.println("Digite a o tamanho do lado do quadrado");
		
		double quadrado = scan.nextDouble();
		
//		System.out.println("O Dobro da área do quadrado é: "+(quadrado*quadrado)*2);
		
		double area = Math.pow (quadrado, 2); //math.pow primeiro vem a base depois o expoente
		
		System.out.println("A área do quadrado é: "+area);
		System.out.println("O Dobro da área do quadrado é: "+(area*2));
		
		
	}

}
