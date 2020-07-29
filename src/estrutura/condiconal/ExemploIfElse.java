package estrutura.condiconal;

import java.util.Scanner;

public class ExemploIfElse {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite sua idade");
		int idade = leia.nextInt();

		if (idade >= 18) {

			System.out.println("Maior de idade");
		   } else {
			   
			System.out.println("Não e maior de idade");
			
		 }

		leia.close();
	}
}
