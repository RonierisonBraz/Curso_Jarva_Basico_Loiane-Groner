package com.loiane.cursojava.exercicios_aula13;

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quanto você ganha por hora");
		double ganhaPorHora = scan.nextDouble();
		
		System.out.println("Digite quantas horas você trabalho no mês");
		double horasTrabalhada = scan.nextDouble();
		
		System.out.println("Seu salario esse mês é R$:"+(ganhaPorHora*horasTrabalhada)) ;
		

	}

}
