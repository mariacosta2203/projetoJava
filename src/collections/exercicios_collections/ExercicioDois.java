package collections.exercicios_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {

		        // Criação do ArrayList com 10 valores inteiros
		        ArrayList<Integer> numeros = new ArrayList<>();
		        Scanner scanner = new Scanner(System.in);

		        // Inicializar o ArrayList com 10 números inteiros
		        System.out.println("Digite 10 números inteiros para inicializar a lista:");
		        for (int i = 0; i < 10; i++) {
		            System.out.print("Número " + (i + 1) + ": ");
		            int numero = scanner.nextInt();
		            numeros.add(numero);
		        }

		        // Solicitar um número ao usuário
		        System.out.print("\nDigite um número para buscar na lista: ");
		        int numeroBuscado = scanner.nextInt();

		        // Verificar se o número está na lista e exibir o resultado
		        if (numeros.contains(numeroBuscado)) {
		            int posicao = numeros.indexOf(numeroBuscado);
		            System.out.println("O número " + numeroBuscado + " foi encontrado na posição: " + posicao);
		        } else {
		            System.out.println("O número " + numeroBuscado + " não foi encontrado!");
		        }

		        scanner.close();
		    }
}

