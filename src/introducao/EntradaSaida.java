package introducao;

import java.util.Scanner; //Importando Scanner para dentro da Classe

public class EntradaSaida {

	public static void main(String[] args) {
		
		// Variaveis
		
		String nome;
		float temperatura;
		float fahrenheit;
		
		Scanner leia = new Scanner(System.in);
		
		// Entrada de dados Pedir/Inserir o nome, temperatura (32ºc para f)
		
		System.out.println("Insira seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Insira a temperatura em Celsius: ");
		temperatura = leia.nextFloat();
		
		// Processamento
		
		fahrenheit = temperatura * 1.8f + 32;
		
		// Saída dos Dados
		
		System.out.printf("Bom dia, " +nome+ ". A temperatura em Fahrenhiet é: %.1f.", fahrenheit);

	}

}
