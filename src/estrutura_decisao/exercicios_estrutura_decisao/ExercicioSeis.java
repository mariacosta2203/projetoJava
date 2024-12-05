package estrutura_decisao.exercicios_estrutura_decisao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		
		String colaborador;
		int cargo;
		float salario, novoSalario;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome: ");
		colaborador = leia.nextLine();
		
		System.out.println("\nQual seu salário? ");
		salario = leia.nextFloat();

		System.out.println("--Digite 1 para Gerente --");
		System.out.println("--Digite 2 para Vendedor --");
		System.out.println("--Digite 3 para Supervisor --");
		System.out.println("--Digite 4 para Motorista --");
		System.out.println("--Digite 5 para Estoquista --");
		System.out.println("--Digite 6 para Técnico de TI --");
		cargo = leia.nextInt();
		

		switch (cargo) {
		case 1:

			novoSalario = salario + (0.10f * salario);
			System.out.println("Nome do colaborador: " + colaborador + " \nCargo: Gerente  \nSalário: " +novoSalario);
			break;

		case 2:

			novoSalario = salario + (0.7f * salario);
			System.out.println("Nome do colaborador: " + colaborador + " \nCargo: Vendedor  \nSalário: " +novoSalario);
			break;

		case 3:

			novoSalario = salario + (0.9f * salario);
			System.out.println("Nome do colaborador: " + colaborador + " \nCargo: Supervisor  \nSalário: " +novoSalario);
			break;
		case 4:

			novoSalario = salario + (0.6f * salario);
			System.out.println("Nome do colaborador: " + colaborador + " \nCargo: Motorista  \nSalário: " +novoSalario);
			break;
			
		case 5:

			novoSalario = salario + (0.5f * salario);
			System.out.println("Nome do colaborador: " + colaborador + " \nCargo: Estoquista  \nSalário: " +novoSalario);
			break;
			
		case 6:

			novoSalario = salario + (0.8f * salario);
			System.out.println("Nome do colaborador: " + colaborador + " \nCargo: Técnico em TI  \nSalário: " +novoSalario);
			break;

		default:

			System.out.println("Operação inválida. Escolha um número de 1 ao 6");

		}

		leia.close();

	}
}


