package exercicios_estrutura_decisao;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		
		float num1;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		num1 = leia.nextFloat();
		
		if(num1 % 2 == 0 && num1 >= 0) {
			
			System.out.print("O " +num1+ " é par e positivo");
			
		}else if(num1 % 2 == 0 && num1 < 0){
			
			System.out.print("O " +num1+ " é par e negativo");
			
		}else if(num1 % 2 == 1 && num1 >= 0) {
			
			System.out.print("O " +num1+ " é ímpar e positivo");
			
		}else {
			
			System.out.print("O " +num1+ " é ímpar e negativo");
		
		}
		
		
		
		leia.close();
	}

}
