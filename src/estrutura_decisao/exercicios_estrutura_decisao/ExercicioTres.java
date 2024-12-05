package estrutura_decisao.exercicios_estrutura_decisao;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean doacao;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Insira sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("É a primeira doação?");
		doacao = leia.nextBoolean();
		
		if(idade >= 18 && idade <= 59) {
			
			System.out.println("Pode doar");
			
		}else if(doacao == false && idade >= 60 && idade <= 69) {
			
			System.out.println("Pode doar");
			
		}else {
			
			System.out.println("Não pode doar");
			
		}
		
		
		
		
		
		leia.close();
	}

}
