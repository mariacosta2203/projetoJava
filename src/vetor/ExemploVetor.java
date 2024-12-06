package vetor;

public class ExemploVetor {

	public static void main(String[] args) {

		String vetorString[] = { "Boxer", "Pastor Alemão", "Pinscher", "Husky Siberiano", "Corgi" };
		//tipagem (tipo - string ou int etc...) - noome do vetor[] - colchetes indica que estou lidando com vetores
		

		for (int indice = 0; indice < 5; indice++) {
			System.out.println((indice + 1) + "º elemento: " + vetorString[indice]);
		}

	}

}
