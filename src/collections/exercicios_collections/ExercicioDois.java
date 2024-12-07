package collections.exercicios_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		
		ArrayList<Double> num = new ArrayList<Double>();
		Scanner leia = new Scanner(System.in);
		int numero;
		
		
		System.out.println("Digite o número: ");
		numero = leia.nextInt();
		
		num.add(2.0);
		num.add(5.0);
		num.add(1.0);
		num.add(3.0);
		num.add(4.0);
		num.add(9.0);
		num.add(7.0);
		num.add(8.0);
		num.add(10.0);
		num.add(6.0);

		System.out.println("\nO número " +numero+ " está localizado na posição: " +num.indexOf(10d));

		
		

	}

}
