package vetor;

import java.util.Scanner;

public class ExemploVetorUsuario {

	public static void main(String[] args) {
		
		
	//tipo  nome      = new tipo[quantidade de valores = limmite]
		int numeros[] = new int[5]; // 0 - 1 - 2 -3 - 4
        Scanner leia = new Scanner(System.in);
        
        for(int indice = 0; indice < 5; indice ++) {
            System.out.println("Digite o " + (indice + 1)  +"º Número: ");
            numeros[indice] = leia.nextInt(); // ler algo e adicionar ao vetor --- Aqui o usuário está preenchendo
        }// TODO Auto-generated method stub
        
        System.out.println("\nOs números digitados foram: \n");
        
        for(int indice = 0; indice < 5; indice++) {
            System.out.println((indice + 1) + "º número: " + numeros[indice]);
        }
        
        //Aqui vai mostrar pro usuário os números e as posições
        
        
        
        
        leia.close();
	}

}
