package collections.exercicios_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		        
		        ArrayList<String> cores = new ArrayList<>();
		        Scanner scanner = new Scanner(System.in);

		    
		        System.out.println("Digite 5 cores:");
		        for (int i = 0; i < 5; i++) {
		            System.out.print("Cor " + (i + 1) + ": ");
		            String cor = scanner.nextLine();
		            cores.add(cor);
		        }

		        // Mostrar todas as cores adicionadas
		        System.out.println("\nCores adicionadas:");
		        for (String cor : cores) {
		            System.out.println(cor);
		        }

		        // Ordenar as cores em ordem crescente
		        Collections.sort(cores);

		        // Mostrar as cores ordenadas
		        System.out.println("\nCores em ordem crescente:");
		        for (String cor : cores) {
		            System.out.println(cor);
		        }

		        scanner.close();
		    }
}
