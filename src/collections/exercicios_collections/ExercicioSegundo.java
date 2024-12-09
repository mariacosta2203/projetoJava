package collections.exercicios_collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioSegundo {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		
		int num = 0;
		String livro = null;
		
		do {
			
			System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
			System.out.println("\n1 - Adicionar livro na pilha");
			System.out.println("\n2 - Listar todos os livros");
			System.out.println("\n3 - Retirar livro da pilha");
			System.out.println("\n0 - Sair");
			System.out.println("\nEntre com a opção desejada");
			num = leia.nextInt();
			
			
			switch (num) {
			
			case 1:
				
				System.out.println("Digite o nome: ");
				leia.skip("\\R?");
				livro = leia.nextLine();
				pilha.push(livro);
				System.out.println("Livro adicionado!");
				
			break;
			
			case 2:
				System.out.println("Lista de livros na pilha: \n");
				Iterator<String> percorrer = pilha.iterator();
				while(percorrer.hasNext()) {
					System.out.println(percorrer.next());
				}
						
			break;
			
			case 3:
					
				if(pilha.isEmpty()) {
					System.out.println("\nA Pilha está vazia? " +pilha.isEmpty());
				}else {
					
					System.out.println(pilha.pop());
					System.out.println("Um livro foi retirado da pilha!");
					Iterator<String> percorrer1 = pilha.iterator();
					while(percorrer1.hasNext()) {
						System.out.println(percorrer1.next());}
					
				}
						
			break;
			
			} 
			
			
			
		} while (num != 0);
		System.out.println("Programa finalizado!");
		
		

	}

}
