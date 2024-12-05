package estrutura_repeticao.exercicio_estrutura_repeticao;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {

		int num, imp = 0, par = 0;
		int i;
		Scanner leia = new Scanner(System.in);

		for (i = 1; i <= 10; i++) {

			System.out.println("Insira o " + i + "º número: ");
			num = leia.nextInt();

			if (num % 2 == 0) {
				par++;
			} else if(num % 2 == 1) {
				imp++;
			}

		}
		
		System.out.println("\nTotal de números pares: " +par );
		System.out.println("\nTotal de números ímpares: " +imp);
		

		System.out.println("\nFinalizado");

		leia.close();

	}

}
