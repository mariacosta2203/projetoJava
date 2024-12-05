package estrutura_repeticao.exercicio_estrutura_repeticao;

import java.util.Scanner;

public class ExercicioTres {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int num, menor = 0, maior = 0;
		
		System.out.println("----Saiba quantas pessoas são maiores e menores----\n");
		System.out.println("Digite uma idade: ");
		num = leia.nextInt();
		
		
		
		while(num > 0) {	
			
			System.out.println("Digite uma idade: ");
			num = leia.nextInt();
			
			if (num < 21) {
				menor++;
			} else if(num > 50) {
				maior++;
			}
			
		} 
		
		System.out.println("\nTotal de pessoas menores de 21 anos: " +menor);
		System.out.println("\nTotal de pessoas maiores de 50 anos: " +maior);
		
		System.out.println("\nVocê finalizou sua pesquisa (: ");
		
		
		
	
		
		leia.close();
	}
}
