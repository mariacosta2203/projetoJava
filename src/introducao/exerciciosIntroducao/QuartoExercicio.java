package exerciciosIntroducao;

import java.util.Scanner;

public class QuartoExercicio {

	public static void main(String[] args) {
		
		String nome;
		int n1,n2,n3, n4;
		int diferenca1, diferenca2;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Aqui calculamos a diferença entre os valores 1 e 2 e os valores 3 e 4");
		
		System.out.println("\nInsira seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("\nInsira o primeiro valor: ");
		n1 = leia.nextInt();
		
		System.out.println("\nInsira o segundo valor: ");
		n2 = leia.nextInt();
		
		System.out.println("\nInsira o terceiro valor: ");
		n3 = leia.nextInt();
		
		System.out.println("\nInsira o quarto valor: ");
		n4 = leia.nextInt();
		
		diferenca1 = (n1 * n2) - (n3 * n4);
		
		System.out.println("A diferença entre os valore é de: " +diferenca1);

	}

}
