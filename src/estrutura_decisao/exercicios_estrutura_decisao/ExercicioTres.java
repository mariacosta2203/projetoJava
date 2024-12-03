package exercicios_estrutura_decisao;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean doacao;
		boolean doacao1 = true;
		Scanner leia = new Scanner(System.in);
				
		boolean doar = (idade >= 60);
		
		System.out.println("Insira seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Insira sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Você já fez uma doação?");
		doacao = leia.hasNext();
		
		if(idade >= 18 && idade <= 59) {
			System.out.println("Pode doar");
		}else if(doar) {
			
			System.out.println("Não pode doar");
			
		}else {
			
			System.out.println("Pode doar");
			
		}
		
		
		
		
		
		leia.close();
	}

}
