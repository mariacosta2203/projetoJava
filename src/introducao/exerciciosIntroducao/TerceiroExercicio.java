package exerciciosIntroducao;

import java.util.Scanner;

public class TerceiroExercicio {

	public static void main(String[] args) {
		
		// Váriaveis
		String nome;
		float salarioB;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		float salarioL;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Olá, aqui calculamos seu sálario líquido\n");
		
		System.out.println("\nInsira seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("\nInsira seu salário bruto: ");
		salarioB = leia.nextFloat();
		
		System.out.println("\nInsira seu adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("\nInsira suas horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("\nInsira seus descontos: ");
		descontos = leia.nextFloat();
		
		salarioL =  (salarioB + adicionalNoturno + (horasExtras * 5)) - descontos;
		
		System.out.printf("\nO seu salário líquido é de: R$ %.2f", salarioL);
		
		
	}

}
