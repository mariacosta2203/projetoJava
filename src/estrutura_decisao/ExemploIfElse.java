package estrutura_decisao;

import java.util.Scanner;

public class ExemploIfElse {

	public static void main(String[] args) {

		// Váriaveis

		float media;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a sua média: ");
		media = leia.nextFloat();

		// Processamento
		if (media >= 6) { // 8,5 é maior ou igual a 6
			
			// Saída da primeira informação
			System.out.println("Parabéns, você foi aprovado!");
			
		} else {
			
			// Saída da mensagem se a primeira for falsa
			System.out.println("Infelizmente você não foi aprovado!");
			
		}

		leia.close();
	}

}