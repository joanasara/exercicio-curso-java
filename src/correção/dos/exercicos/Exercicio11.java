package correção.dos.exercicos;

public class Exercicio11 {

	public static void main(String[] args) {

		int impar = 0;
		double pares = 0;

		for (int i = 0; i <= 30; i++) {

			if (i % 2 == 1) {
				impar += i;
			}
			if (i % 2 == 0) {
				pares = i * i;
			}

		}

		
     
		
		System.out.println("A soma do numero impar e " + impar);
		System.out.println("A multiplicação do numero pares e " + pares);

	}
}

