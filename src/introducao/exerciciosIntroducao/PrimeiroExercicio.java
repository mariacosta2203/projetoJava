package exerciciosIntroducao;

import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		
		String nome;
		float novosalario;
		float salario;
		float abono;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Seja bem-vindo, vamos calcular seu novo salário\n");
		
		System.out.println("Insira seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Insira seu salário: ");
		salario = leia.nextFloat();
				
		System.out.println("Insira seu abono salarial: ");
		abono = leia.nextFloat();
		
		novosalario = salario + abono;
		
		System.out.printf("Olá " +nome+ " seu novo novo salário é: R$ %.2f", novosalario);
		
		
	}

}
