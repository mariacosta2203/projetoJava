package estrutura_decisao.exercicios_estrutura_decisao;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean doacao = true;
		boolean doacao1 = false;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Insira sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Você já fez uma doação?");
		doacao = leia.nextBoolean();
		
		if(idade >= 18 && idade <= 59) {
			
			System.out.println("Pode doar");
			
		}if(doacao == true && idade >= 60 && idade <= 69) {
			
			System.out.println("Não pode doar");
			
		}if(!doacao1 && idade >=60 && idade <= 69) {
			
			System.out.println("Pode doar");
			
		}
		
		
		
		
		
		leia.close();
	}

}
