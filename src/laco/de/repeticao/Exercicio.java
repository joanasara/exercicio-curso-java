package laco.de.repeticao;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero = 0;
		int maior = Integer.MIN_VALUE;

		while (numero < 5) {
			System.out.println("Digite o valor numero");
			leia.nextInt();
			numero++;

			if (numero > maior) {
				maior = numero;
			}

		}

		System.out.println("Maior numero digitado foi: " + maior);
		
		
		leia.close();

	}

}
