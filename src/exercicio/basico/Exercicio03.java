package exercicio.basico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o preço do primeiro produto");
		double valor1 = leia.nextDouble();
		
		System.out.println("Digite o preço do segundo produto");
		double valor2 = leia.nextDouble();
		
		
		System.out.println("Digite o preço do terceiro produto");
		double valor3 = leia.nextDouble();
		
		
		
		if(valor1 <= valor2 && valor1 <= valor3 ) {
			 System.out.println("Pode comprar, o primeiro valor e mais barato " + valor1);
			
		}
		else if(valor2 <= valor1 && valor2 <= valor3) {
			 System.out.println("Pode comprar, o segundo valor e mais barato " + valor2);
			 
		}
		else {
			System.out.println("Pode comprar, o terceiro valor e mais barato " + valor3);
		}
		
		
		
		
		
		
		
		
		
     leia.close();
	}

}
