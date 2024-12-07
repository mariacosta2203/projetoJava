package collections.exercicios_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		
		
		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);
		int cor;
		
		System.out.println("Digite suas cinco cores favoritas: " +cores);
		cor = leia.nextInt(5);
		
		cores.add(cor);
		cores.add(cor);
		cores.add(cor);
		cores.add(cor);
		cores.add(cor);
		


	}

}
