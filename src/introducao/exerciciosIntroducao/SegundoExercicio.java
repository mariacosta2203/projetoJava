package exerciciosIntroducao;

import java.util.Scanner;

public class SegundoExercicio {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4;
		float media;
		String nome;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Seja bem-vindo ao nosso site de calcular notas, isira corretamente suas notas para ser calculado a média final\n");
		
		System.out.println("Insira seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("\nInsira sua primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("\nInsira sua segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("\nInsira sua terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("\nInsira sua quarta nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("\nOlá " +nome+ " sua média final é: %.1f", media);
	}

}
