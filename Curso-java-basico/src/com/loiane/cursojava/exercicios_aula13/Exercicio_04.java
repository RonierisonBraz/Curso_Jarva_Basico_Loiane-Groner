package com.loiane.cursojava.exercicios_aula13;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--- Faculdade Nova Roma---");
		System.out.println("Professor digites as 4 notas do alunos Ronierison");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();
		double nota4 = scan.nextDouble();
	
		
		System.out.println("A Media do Aluno é: "+(nota1+nota2+nota3+nota4)/4);
		
		

	}

}
