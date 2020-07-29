package laco.de.repeticao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
	Scanner di = new Scanner(System.in);

		int numero = di.nextInt();
		int soma = 0;
		int i = 0;
		System.out.println("TABUADA DE " + numero);
		for (i = 1; i <= 10; i++) {

			soma = numero * i;
			System.out.println(numero + " x " + i + " = " + soma);
		}

		di.close();

	}

}
