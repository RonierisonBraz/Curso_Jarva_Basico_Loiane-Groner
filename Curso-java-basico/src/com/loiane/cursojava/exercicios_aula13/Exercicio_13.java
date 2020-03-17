package com.loiane.cursojava.exercicios_aula13;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quanto você ganha por hora");
		double ganhaPorHora = scan.nextDouble();
		
		System.out.println("Digite quantas horas você trabalho no mês");
		double horasTrabalhada = scan.nextDouble();
		
		double salario = ganhaPorHora*horasTrabalhada;
		
		double inss = salario*0.08;
		double impostoDeRenda = salario*0.11;
		double sindicato = salario*0.05;
		double salarioLiquido = salario-inss-impostoDeRenda-sindicato;
		
		
		System.out.println("Você pagou ao INSS :"+inss);
		System.out.println("Você pagou ao Sindicato :"+sindicato);
		System.out.println("Seu com os desconto é :"+salarioLiquido	);
	   
	   
	}

}
