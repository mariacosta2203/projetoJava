package estrutura_decisao.exercicios_estrutura_decisao;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {

		int lanche;
		int quant;
		int total = 0;
		Scanner leia = new Scanner(System.in);

		System.out.println("--Digite 1 para comprar Cachorro Quente - R$ 10,OO --");
		System.out.println("--Digite 2 para comprar X-Salada - R$ 15,OO --");
		System.out.println("--Digite 3 para comprar X-Bacon - R$ 18,OO --");
		System.out.println("--Digite 4 para comprar Bauru - R$ 12,OO --");
		System.out.println("--Digite 5 para comprar Refrigerante - R$ 8,OO --");
		System.out.println("--Digite 6 para comprar Suco de laranja - R$ 13,OO --");
		lanche = leia.nextInt();

		System.out.println("Quantidade?");
		quant = leia.nextInt();

		switch (lanche) {
		case 1:

			total = quant * 10;
			System.out.println("Os seus " + quant + " Cachorro Quente R$ " + total);
			break;

		case 2:

			total = quant * 15;
			System.out.println("Os seus " + quant + " X-Salada R$ " + total);
			break;

		case 3:

			total = quant * 18;
			System.out.println("Os seus " +quant+ " X-Bacon R$ " +total);
			break;

		case 4:

			total = quant * 12;
			System.out.println("Os seus " +quant+ " Bauru R$ " +total);
			break;
			
		case 5:

			total = quant * 8;
			System.out.println("Os seus " +quant+ " Refrigerante R$ " +total);
			break;
			
		case 6:

			total = quant * 13;
			System.out.println("Os seus " +quant+ " Suco de laranja R$ " +total);
			break;

		default:

			System.out.println("Operação inválida. Escolha um número de 1 ao 6");

		}

		leia.close();

	}

}
