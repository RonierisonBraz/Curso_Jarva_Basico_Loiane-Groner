package com.loiane.cursojava.exercicios_aula13;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quanto voc� ganha por hora");
		double ganhaPorHora = scan.nextDouble();
		
		System.out.println("Digite quantas horas voc� trabalho no m�s");
		double horasTrabalhada = scan.nextDouble();
		
		double salario = ganhaPorHora*horasTrabalhada;
		
		double inss = (salario /100 ) *8;
		double impostoDeRenda = (salario / 100) *11;
		double sindicato = (salario / 100) *5;
		double salarioLiquido = salario-inss-impostoDeRenda-sindicato;
		
		
		System.out.println("Salario bruto: " +salario);
		System.out.println("Voc� pagou ao INSS: "+inss);
		System.out.println("Voc� pagou ao Sindicato: "+sindicato);
		System.out.println("Seu com os desconto �: "+salarioLiquido	);
	   
	   
	}

}
