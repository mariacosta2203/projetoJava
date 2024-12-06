package vetor.exercicios_vetor;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {

		int soma = 0, media = 0, i = 0;

		int num[] = new int[10];
		Scanner leia = new Scanner(System.in);

		for (i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "º Número: ");
			num[i] = leia.nextInt();

			soma = soma + num[i];
			media = soma / 10;

		}

		System.out.printf("\nSoma: " + soma + "\n");

		System.out.println("\nMédia: " + media);

		
		System.out.println("\nNúmeros pares: ");
		for(i = 0; i < 10; i++) {
			
			if(num[i] % 2 == 0) {
				System.out.println(num[i]);
			}
			
		} 
		
		
		
		
		System.out.println("Números ímpares: ");
		for(i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				System.out.println(num[i]);
			}
		}
		
		
		
		

		leia.close();
	}

}
