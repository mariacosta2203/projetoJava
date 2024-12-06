package vetor.exercicios_vetor;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {

		int i, numero;
		boolean mudar = false;

		int num[] = { 2, 7, 3, 8, 9, 1, 4, 5, 6, 10 };
		Scanner leia = new Scanner(System.in);

		
		System.out.println("Digite o número: ");
		numero = leia.nextInt();
		
		for (i = 0; i < 10; i++) {
			if(numero == num[i]) {
				System.out.println("O número " + num[i] + " está localizado na posição: " + i);
				mudar = true;
			}
			
			
			
		}
		
		if(mudar != true) {
			System.out.println("O " +numero+ " não foi encontrado");
		}

		

		leia.close();
	}

}
