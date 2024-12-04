package estrutura_decisao.exercicios_estrutura_decisao;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {

		int mat;
		int num1, num2;
		float resultado;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("--Digite 1 para fazer uma soma--");
		System.out.println("--Digite 2 para fazer uma subtração--");
		System.out.println("--Digite 3 para fazer uma multiplicação--");
		System.out.println("--Digite 4 para fazer uma divisão--");
		mat = leia.nextInt();
		
		System.out.println("Insira o primeiro número: ");
		num1 = leia.nextInt();
		
		System.out.println("Insira o segundo número: ");
		num2 = leia.nextInt();
		

		switch (mat) {
		case 1:
			
			System.out.println("Aqui está o resultado da sua soma: ");
			resultado = num1 + num2;
			System.out.println(+resultado);
		break;
		
		case 2:
			
			System.out.println("Aqui está o resultado da sua subtração: ");
			resultado = num1 - num2;
			System.out.println(+resultado);
		break;
		
		case 3:
			
			System.out.println("Aqui está o resultado da sua multiplicação: ");
			resultado = num1 * num2;
			System.out.println(+resultado);
		break;
		
		case 4:
			
			System.out.println("Aqui está o resultado da sua divisão: ");
			resultado = num1 / num2;
			System.out.println(+resultado);
		break;
		
		default:
		
			System.out.println("Operação inválida. Escolha um número de 1 a 4");
		
		}

		leia.close();
	}

}
