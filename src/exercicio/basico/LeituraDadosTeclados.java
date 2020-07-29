package exercicio.basico;

import java.util.Locale;
import java.util.Scanner;

public class LeituraDadosTeclados {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = leia.nextLine();
		
		System.out.println("Digite a sua idade");
		int idade = leia.nextInt();
		
		System.out.println("Digite a sua altura");
		double altura = leia.nextDouble();

		System.out.println("Seu nome completo: " + nomeCompleto);
		System.out.println("Sua idade: " + idade);
		System.out.println("Sua altura: " + altura);

		leia.close();
	}
}
