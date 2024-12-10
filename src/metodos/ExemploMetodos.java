package metodos;

public class ExemploMetodos {

	public static void main(String[] args) {
		//ausencia de retorno -> void
		
		/*
		 * num1 = leia.nextInt();
		 * num2 = leia.nextInt();
		 * soma(num1, num2);
		 * */
		
		
		int resultado = somar(2,5);
		System.out.println("O primeiro resultado é: " +resultado);
		
		System.out.println("O primeiro resultado é: " +somar(8,3));
		
		falar("Pode ser, Bom dia");
		falar("O gato amarelo");
		
		ExemploMetodoExterno.mensagem();
		

	}
	
	public static int somar(int x, int y) { //definição(estruturando) do metodo somar - método com retorno e com parametro
		
		return x + y; // 2 + 5
		
	}
	
	//definição(estruturando) do metodo falar - método sem retorno e com parametro
	public static void falar(String mensagem) {
		System.out.println(mensagem);
	}
	

}
