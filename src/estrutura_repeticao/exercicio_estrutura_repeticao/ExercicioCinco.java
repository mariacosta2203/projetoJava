package estrutura_repeticao.exercicio_estrutura_repeticao;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		
		int num, resultado = 0;
        Scanner leia = new Scanner(System.in);

        do {
            System.out.println("\nDigite um número inteiro: ");
            num = leia.nextInt();

            if(num > 0) {
            	resultado = resultado + num;
            }
            

        } while (num != 0); //condição limite para repetir
        
        
        System.out.println("\nA soma dos números positivos é: " + resultado);


        
        leia.close();
	}

}


