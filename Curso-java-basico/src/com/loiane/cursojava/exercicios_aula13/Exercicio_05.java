package com.loiane.cursojava.exercicios_aula13;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ol� hoje Serei o seu conversor de m para cm");
		System.out.println("Digite o valor que voc� deseja converte:");
		
		double converteParaCm = scan.nextDouble();
		
		System.out.println("Seu valor convertido �: "+(converteParaCm)*100+"cm");

	}

}
