package laco.de.repeticao;

import java.util.Scanner;

public class Exercico01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		boolean notaValida = false;

		do {

			System.out.println("Digite um numero ");
			int numero = leia.nextInt();

			if (numero >= 0 && numero <= 10) {
				notaValida = true;
				 System.out.println("você digitou " + numero);

			} else {
				System.out.println("Numero invalido");
				
			}

		} while (!notaValida);

		
		
		
		
		
		
		leia.close();
	}
}
