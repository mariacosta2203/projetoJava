package collections.exercicios_collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioPrimeiro08 {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		
		int num = 0;
		String nome;
		
		do {
			
			System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
			System.out.println("\n1-Adicionar cliente na fila");
			System.out.println("\n2-Listar todos os cliente");
			System.out.println("\n3-Retirar Cliente da fila");
			System.out.println("\n0-Sair");
			System.out.println("++++++++++++++++++++++++++++++++++");
			num = leia.nextInt();
			
			switch (num) {
			
			case 1:
				
				System.out.println("**************************************");
				System.out.println("Digite o nome: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				fila.add(nome);
				System.out.println("Cliente adicionado!");
				System.out.println("**************************************");
				
			break;
			
			case 2:
				
				System.out.println("**************************************");
				Iterator<String> percorrer = fila.iterator();
				while(percorrer.hasNext()) {
					System.out.println(percorrer.next());
				}
				System.out.println("**************************************");
						
			break;
			
			case 3:
				
				System.out.println("**************************************");
				if(fila.isEmpty()) {
					System.out.println("\nA Pilha está vazia? " +fila.isEmpty()+ "\n");
				}else {
					
					System.out.println(fila.poll());
					System.out.println("\nO cliente foi chamado!");
					Iterator<String> percorrer1 = fila.iterator();
					while(percorrer1.hasNext()) {
						System.out.println(percorrer1.next());}
					
				}
				System.out.println("**************************************");	
			}
			
		} while (num != 0);
		System.out.println("Programa finalizado!");

	}

}
