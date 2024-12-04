package estrutura_decisao.exercicios_estrutura_decisao;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		
		float a, b, c;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Coloque o valor A: ");
		a = leia.nextFloat();
		
		System.out.println("Coloque o valor B: ");
		b = leia.nextFloat();
		
		System.out.println("Coloque o valor C: ");
		c = leia.nextFloat();
		
		if(a + b > c) {
			System.out.println("A soma de " +a+ " + " +b+ " é maior do que " +c);
			
		}else if(a + b < c) {
			System.out.println("A soma de " +a+ " + " +b+ " é menor do que " +c);
		}else if(a + b == c) {
			System.out.println("A soma de " +a+ " + " +b+ " é igual a " +c);
		}else {
			System.out.println("Valor inválido");
		}

		leia.close();
	}

	
}
