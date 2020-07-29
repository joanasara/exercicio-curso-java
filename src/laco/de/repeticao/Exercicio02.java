package laco.de.repeticao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		boolean inforValida = false;
		String nome;
		String senha;
		

		do {

			System.out.println("Digite o nome");
			nome = leia.next();

			System.out.println("Digite a senha");
			 senha = leia.next();

			if (nome.equalsIgnoreCase(senha)) {
				// inforValida = false;
				System.out.println("ERRO!");

			} else {
				inforValida = true;
				System.out.println("senha e usuario valido");
			}

		} while (!inforValida);
           
		leia.close();
	}

}
