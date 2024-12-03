package estrutura_decisao;

import java.util.Scanner;

public class ExemploIfElseEncadeado {

	public static void main(String[] args) {

		// Váriaveis

		float media;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a sua média: ");
		media = leia.nextFloat();

		// Processamento encadeado
		if (media >= 6) { // 8,5 é maior ou igual a 6
			
			// Saída da primeira informação
			System.out.println("Parabéns, você foi aprovado!");
			
		} else if(media >= 5) {
			
			// Saída da mensagem se a primeira for falsa
			System.out.println("Você está de exame");
			
		} else {
			
			// Saída da mensagem se as duas primeiras for falsa
			System.out.println("Infelizmente, você foi reprovado!");
			
		}

		leia.close();
	}

}
