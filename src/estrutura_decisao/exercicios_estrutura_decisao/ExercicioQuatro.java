package exercicios_estrutura_decisao;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		
		int opcao;
		int num1;
		int num2;
		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite 1 para fazer uma soma");
		System.out.println("Digite 2 para fazer uma subtração");
		System.out.println("Digite 3 para fazer uma multiplicação");
		System.out.println("Digite 4 para fazer uma divisão\n");
		opcao = leia.nextInt();
		
		num1 + num2

		switch (opcao) {
		case 1:
			System.out.println("Livro: O Alquimista");
			break;
		case 2:
			System.out.println("Frase motivacional: Se você cair, levante! Não dá para andar deitado.");
			break;
		case 3:
			System.out.println("Música: AURORA - No Cure For Me.");
			break;
		case 4:
			System.out.println("Música: AURORA - No Cure For Me.");
			break;
		default:
			System.out.println("Opção inválida. Escolha um número de 1 ao 4");

		}
		
		
		
		
		leia.close();
		

	}

}
