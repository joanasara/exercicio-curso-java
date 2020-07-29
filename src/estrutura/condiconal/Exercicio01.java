package estrutura.condiconal;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com o primeiro  numero");
		int num1 = leia.nextInt();

		System.out.println("Entre com o segundo numero");
		int num2 = leia.nextInt();

		if (num1 > num2) {

			System.out.println("O numero maior e: " + num1);
		} else {
			System.out.println("O numero maior e: " + num2);
		}

		leia.close();
	}

}
